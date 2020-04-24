package org.bukkit.material;

import org.bonge.convert.EnumConvert;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.data.key.Keys;

@Deprecated
public class Sign extends MaterialData implements Attachable {

    public Sign(BlockState value) {
        super(value);
    }

    public Sign(Material material) {
        super(material);
    }

    public Sign(){
        this(BlockTypes.STANDING_SIGN.getDefaultState());
    }

    @Override
    public @NotNull BlockFace getAttachedFace() {
        if(this.getSpongeValue().getType().equals(BlockTypes.STANDING_SIGN)){
            return BlockFace.DOWN;
        }
        return this.getFacing().getOppositeFace();
    }

    @Override
    public void setFacingDirection(@NotNull BlockFace face) {
        this.spongeValue = this.spongeValue.with(Keys.DIRECTION, EnumConvert.getDirection(face)).get();
    }

    @Override
    public @NotNull BlockFace getFacing() {
        return EnumConvert.getFace(this.getSpongeValue().get(Keys.DIRECTION).get());
    }
}
