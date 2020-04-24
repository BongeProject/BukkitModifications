package org.bukkit.material;

import org.bonge.wrapper.BongeWrapper;
import org.bukkit.Material;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.item.ItemType;

import java.util.Optional;

@Deprecated
public class MaterialData extends BongeWrapper<BlockState> implements Cloneable {

    private byte data;

    public MaterialData(BlockState value) {
        super(value);
    }

    public MaterialData(Material material){
        super(material.getSpongeBlockValue().get().getDefaultState());
    }

    public MaterialData(Material material, byte data){
        this(material);
        this.data = data;
    }

    public byte getData(){
        return this.data;
    }

    public void setData(byte data){
        this.data = data;
    }

    public Material getItemType(){
        Optional<ItemType> opType = this.getSpongeValue().getType().getItem();
        if(opType.isPresent()){
            return Material.getMaterial(opType.get());
        }
        return null;
    }

    @Override
    public MaterialData clone(){
        try{
            return (MaterialData) super.clone();
        }catch (CloneNotSupportedException e){
            throw new Error(e);
        }
    }

    public static MaterialData getData(BlockState state){
        if(state.getType().equals(BlockTypes.STANDING_SIGN) || state.getType().equals(BlockTypes.WALL_SIGN)){
            return new Sign(state);
        }
        if(state.getType().equals(BlockTypes.CHEST) || state.getType().equals(BlockTypes.TRAPPED_CHEST)){
            return new Chest(state);
        }
        return new MaterialData(state);
    }
}
