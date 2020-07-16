package org.bukkit.material;

import org.bonge.Bonge;
import org.bonge.util.exception.NotImplementedException;
import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.TreeType;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.data.Keys;
import org.spongepowered.api.data.type.WoodType;

import java.io.IOException;

@Deprecated
public class Wood extends MaterialData {

    public Wood() {
        super(BlockTypes.OAK_PLANKS.get().getDefaultState());
    }

    public Wood(TreeSpecies species){
        this(Material.OAK_PLANKS, species);
    }

    public Wood(Material material) {
        super(material);
    }

    public Wood(Material material, TreeSpecies species){
        super(material);
        this.setSpecies(species);
    }

    public Wood(Material material, byte data) {
        super(material, data);
    }

    public TreeSpecies getSpecies(){
        try {
            return Bonge.getInstance().convert(TreeSpecies.class, this.spongeValue.get(Keys.WOOD_TYPE).get());
        } catch (IOException e) {
            throw new NotImplementedException("Unknown TreeSpecies of " + this.spongeValue.get(Keys.WOOD_TYPE).get().getKey().getFormatted());
        }
    }

    public void setSpecies(TreeSpecies species){
        try {
            WoodType type = Bonge.getInstance().convert(species, WoodType.class);
            this.spongeValue = this.spongeValue.with(Keys.WOOD_TYPE, type).get();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
