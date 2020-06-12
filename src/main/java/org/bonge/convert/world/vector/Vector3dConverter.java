package org.bonge.convert.world.vector;

import com.flowpowered.math.vector.Vector3d;
import org.bonge.convert.Converter;
import org.bukkit.util.Vector;

public class Vector3dConverter implements Converter<Vector, Vector3d> {
    @Override
    public Class<Vector3d> getSpongeClass() {
        return Vector3d.class;
    }

    @Override
    public Class<Vector> getBukkitClass() {
        return Vector.class;
    }

    @Override
    public Vector3d from(Vector value) {
        return new Vector3d(value.getX(), value.getY(), value.getZ());
    }

    @Override
    public Vector to(Vector3d value) {
        return new Vector(value.getX(), value.getY(), value.getZ());
    }
}
