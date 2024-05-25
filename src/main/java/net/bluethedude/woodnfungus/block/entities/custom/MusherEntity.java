package net.bluethedude.woodnfungus.block.entities.custom;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.block.entities.ModEntities;
import net.bluethedude.woodnfungus.item.ModItems;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MusherEntity extends AnimalEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationCooldown = 0;

    public MusherEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    private void updateAnimations() {
        if (this.idleAnimationCooldown <= 0) {
            this.idleAnimationCooldown = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationCooldown;
        }
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f;
        if (this.getPose() == EntityPose.STANDING) {
            f = Math.min(posDelta * 6.0F, 1.0F);
        } else {
            f = 0.0F;
        }

        this.limbAnimator.updateLimbs(f, 0.2F);
    }

    @Override
    public void tick() {
        super.tick();
        if(this.getWorld().isClient()) {
            updateAnimations();
        }
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.15D));
        this.goalSelector.add(3, new FleeEntityGoal<>(this, OcelotEntity.class, 6.0F, 1.0, 1.2));
        this.goalSelector.add(3, new FleeEntityGoal<>(this, CatEntity.class, 6.0F, 1.0, 1.2));
        this.goalSelector.add(4, new MeleeAttackGoal(this, 1.0, false));
        this.goalSelector.add(5, new TemptGoal(this, 1.25D, Ingredient.ofItems(
                ModBlocks.SAVORSHROOM.asItem(),
                ModItems.ROASTED_SAVORSHROOM,
                ModItems.ROASTED_SAVORSHROOM_CHUNKS,
                ModItems.ROASTED_SAVORSHROOM_SCRAPS), false));
        this.goalSelector.add(6, new FollowParentGoal(this, 1.15D));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 0.8));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add(9, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createMusherAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25);
    }

    public int getSafeFallDistance() {
        return this.getTarget() == null ? 3 : 3 + (int)(this.getHealth() - 1.0F);
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_CREEPER_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_CREEPER_DEATH;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(ModBlocks.SAVORSHROOM.asItem());
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.MUSHER.create(world);
    }


}
