package com.rocketmail.vaishnavanil.controls;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;
import com.rocketmail.vaishnavanil.Main;
import com.rocketmail.vaishnavanil.graphics.Graphics;
import com.rocketmail.vaishnavanil.math.PlaneConversion;
import com.rocketmail.vaishnavanil.math.TileConversion;
import com.rocketmail.vaishnavanil.math.planes.Coordinate;
import com.rocketmail.vaishnavanil.rendering.GLListener;
import com.rocketmail.vaishnavanil.rendering.Renderer;
import com.rocketmail.vaishnavanil.world.PlayerWorld;

public class MouseSelector implements MouseListener {
    static MouseSelector instance;

    public static MouseSelector getInstance(){
        if(instance == null)instance = new MouseSelector();
        return instance;
    }
    private MouseSelector(){

    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseEvent e) {

    }

    public float[] relativeCoords(int x,int y){
        return null;
    }


}
