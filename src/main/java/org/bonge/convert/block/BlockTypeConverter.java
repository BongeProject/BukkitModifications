package org.bonge.convert.block;

import org.bonge.Bonge;
import org.bonge.bukkit.r1_13.material.BongeMaterial;
import org.bonge.convert.Converter;
import org.bukkit.Material;
import org.spongepowered.api.block.BlockType;

import java.io.IOException;
import java.util.Optional;

public class BlockTypeConverter implements Converter<Material, BlockType> {
    @Override
    public Class<BlockType> getSpongeClass() {
        return BlockType.class;
    }

    @Override
    public Class<Material> getBukkitClass() {
        return Material.class;
    }

    @Override
    public BlockType from(Material value) throws IOException {
        Optional<Material> opType = Bonge.getInstance().getMaterials().stream()
                .filter(t -> t instanceof BongeMaterial)
                .filter(t -> t.isBlock())
                .filter(t -> ((BongeMaterial)t).toBlock().get().getSpongeBlockType().equals(value))
                .findAny();
        if(opType.isPresent()){
            return ((BongeMaterial)opType.get()).toBlock().get().getSpongeBlockType();
        }
        throw new IOException("Unknown material converter for " + value.name());
    }

    @Override
    public Material to(BlockType value) throws IOException{
        Optional<Material> opType = Bonge.getInstance().getMaterials().stream()
                .filter(t -> t instanceof BongeMaterial)
                .filter(t -> t.isBlock())
                .filter(t -> ((BongeMaterial) t).toBlock().get().getSpongeBlockType().equals(value))
                .findAny();
        if(opType.isPresent()){
            return opType.get();
        }
        throw new IOException("Unknown material converter for " + value.getId());
    }
}
