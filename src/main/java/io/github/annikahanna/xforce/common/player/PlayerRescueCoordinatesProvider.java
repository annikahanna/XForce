package io.github.annikahanna.xforce.common.player;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlayerRescueCoordinatesProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {

    public static Capability<PlayerRescueCoordinates> PLAYER_COORDINATES =
            CapabilityManager.get(new CapabilityToken<PlayerRescueCoordinates>() {});

    private PlayerRescueCoordinates coordinates = null;
    private final LazyOptional<PlayerRescueCoordinates> optional = LazyOptional.of(this::createPlayerRescueCoordinates);

    private PlayerRescueCoordinates createPlayerRescueCoordinates() {
        if (this.coordinates == null){
            this.coordinates = new PlayerRescueCoordinates();
        }
        return this.coordinates;
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == PLAYER_COORDINATES){
            return optional.cast();
        }
        return LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        createPlayerRescueCoordinates().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createPlayerRescueCoordinates().loadNBTData(nbt);
    }
}
