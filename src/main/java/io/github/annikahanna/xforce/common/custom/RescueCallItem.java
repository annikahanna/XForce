package io.github.annikahanna.xforce.common.custom;

import io.github.annikahanna.xforce.common.player.PlayerRescueCoordinatesProvider;
import io.github.annikahanna.xforce.core.init.SoundInit;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

public class RescueCallItem extends Item {

    public  int x = 0;
    public int y = 0;
    public int z = 0;
    CompoundTag nbt = new CompoundTag();

    public RescueCallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        Minecraft instance = Minecraft.getInstance();


        if(hand == InteractionHand.MAIN_HAND){
            try{
                loadNBTData(nbt.getString("savepoint"));
            }catch (Exception e){
                System.out.println(e);
                nbt.putString("savepoint",createCoordinates((int) player.getX(), (int) player.getY(), (int) player.getZ()));
                return super.use(level, player, hand);
            }
            player.teleportTo(this.x,this.y, this.z);
}
        if(hand == InteractionHand.OFF_HAND){
                    nbt.putString("savepoint",createCoordinates((int) player.getX(), (int) player.getY(), (int) player.getZ()));
        }
        return super.use(level, player, hand);
    }

    public String createCoordinates(int x, int y, int z){
        return Integer.toString(x)+","+Integer.toString(y)+","+Integer.toString(z);
    }

    public void loadNBTData(String string){
        this.x =Integer.valueOf(string.split(",")[0]);
        this.y =Integer.valueOf(string.split(",")[1]);
        this.z =Integer.valueOf(string.split(",")[2]);
    }
}
