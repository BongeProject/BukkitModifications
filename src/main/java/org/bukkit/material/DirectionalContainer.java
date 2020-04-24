package org.bukkit.material;

import org.bonge.convert.EnumConvert;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.data.key.Keys;

@Deprecated
public class DirectionalContainer extends MaterialData implements Directional {
    public DirectionalContainer(BlockState value) {
        super(value);
    }

    public DirectionalContainer(Material material) {
        super(material);
    }

    public DirectionalContainer(Material material, byte data) {
        super(material, data);
    }

    @Override
    public void setFacingDirection(@NotNull BlockFace face) {
        this.spongeValue = this.spongeValue.with(Keys.DIRECTION, EnumConvert.getDirection(face)).get();
    }

    @Override
    public @NotNull BlockFace getFacing() {
        return EnumConvert.getFace(this.spongeValue.get(Keys.DIRECTION).get());
    }
}
