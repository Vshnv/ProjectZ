package com.rocketmail.vaishnavanil;

import com.rocketmail.vaishnavanil.rendering.Renderer;
import com.rocketmail.vaishnavanil.world.PlayerWorld;

public class Main {
    public static PlayerWorld pw;
    public static void main(String[] args) {
        pw = new PlayerWorld(10,10);
        Renderer.init();
    }
}
