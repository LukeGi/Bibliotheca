package com.ewyboy.bibliotheca.proxy;

import com.ewyboy.bibliotheca.client.ModelLoader;
import net.minecraftforge.api.distmarker.Dist;

public class ClientProxy extends CommonProxy {

    @Override
    public Dist getSide() {
        return Dist.CLIENT;
    }

    @Override
    public void construct() {
        super.construct();
    }

    @Override
    public void setup() {
        super.setup();
        ModelLoader.initSpecialRenders();
    }
}
