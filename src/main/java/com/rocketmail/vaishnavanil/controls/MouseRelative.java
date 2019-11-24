package com.rocketmail.vaishnavanil.controls;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;
import com.rocketmail.vaishnavanil.Main;
import com.rocketmail.vaishnavanil.math.PlaneConversion;
import com.rocketmail.vaishnavanil.math.TileConversion;
import com.rocketmail.vaishnavanil.rendering.GLListener;
import com.rocketmail.vaishnavanil.rendering.Renderer;

public class MouseRelative implements MouseListener {
    static MouseRelative mr;
    static float mX;
    static float mY;
    public static float getX(){
        return mX;
    }
    public static float getY(){
        return mY;
    }
    public static MouseRelative getInstance(){
        if(mr == null) mr = new MouseRelative();
        return mr;
    }
    private MouseRelative(){

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
        int x = e.getX();
        int y = e.getY();
        float rX = (Renderer.UNIT_WIDE/Renderer.getWindowWidth()) *(x) -Renderer.UNIT_WIDE/2  - GLListener.CamX;
        float rY = -((Renderer.UNIT_TALL()/Renderer.getWindowHeight()) * (y) -Renderer.UNIT_TALL()/2) - GLListener.CamY;
        System.out.println("relative :: x:" + rX + "   y:" + rY);
        float[] coords = PlaneConversion.toCart(rX,rY);
        Main.pw.mouseSelect(Math.round(coords[0]),Math.round(coords[1]));
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseEvent e) {

    }
}
