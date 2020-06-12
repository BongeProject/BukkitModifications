package org.bonge.bukkit.r1_13.material;

import org.bonge.bukkit.r1_13.material.block.BlockMaterial;
import org.bonge.bukkit.r1_13.material.item.ItemMaterial;
import org.bukkit.Material;
import org.spongepowered.api.item.ItemTypes;

import java.util.Optional;

public enum SpongeMaterialFix {

    CAKE((BlockMaterial) Material.CAKE, new ItemMaterial(ItemTypes.CAKE, "CAKE"));

    private BlockMaterial block;
    private ItemMaterial item;

    SpongeMaterialFix(BlockMaterial block, ItemMaterial item){
        this.block = block;
        this.item = item;
    }

    public BlockMaterial getBlock(){
        return this.block;
    }

    public ItemMaterial getItem(){
        return this.item;
    }

    public static Optional<SpongeMaterialFix> get(BlockMaterial type){
        for(SpongeMaterialFix fix : SpongeMaterialFix.values()){
            if(fix.getBlock().equals(type)){
                return Optional.of(fix);
            }
        }
        return Optional.empty();
    }

    public static Optional<SpongeMaterialFix> get(ItemMaterial type){
        for(SpongeMaterialFix fix : SpongeMaterialFix.values()){
            if(fix.getItem().equals(type)){
                return Optional.of(fix);
            }
        }
        return Optional.empty();
    }

}
