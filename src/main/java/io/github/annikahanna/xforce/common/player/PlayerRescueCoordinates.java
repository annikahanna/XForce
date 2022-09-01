package io.github.annikahanna.xforce.common.player;

import net.minecraft.nbt.CompoundTag;

public class PlayerRescueCoordinates {

    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String createCoordinates(int x, int y, int z){
        return Integer.toString(x)+","+Integer.toString(y)+","+Integer.toString(z);
    }

    public void copyFrom(PlayerRescueCoordinates source) {
        this.x = source.getX();
        this.y = source.getY();
        this.z = source.getZ();
    }

    public void saveNBTData(CompoundTag nbt){
        nbt.putString("savepoint",createCoordinates(this.x, this.y, this.z));
    }

    public void loadNBTData(CompoundTag nbt){
        String string = nbt.getString("savepoint");
        this.x =Integer.valueOf(string.split(",")[0]);
        this.y =Integer.valueOf(string.split(",")[1]);
        this.z =Integer.valueOf(string.split(",")[2]);
    }
}
