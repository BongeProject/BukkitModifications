package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;

import javax.naming.ldap.ExtendedRequest;
import java.security.cert.Extension;

@Deprecated
public class ExtendedRails extends Rails {

    public ExtendedRails(final Material material){
        super(material);
    }

    @Deprecated
    public ExtendedRails(final Material material, byte data){
        super(material, data);
    }

    @Override
    public boolean isCurve(){
        return false;
    }
}
