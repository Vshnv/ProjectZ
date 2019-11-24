package com.rocketmail.vaishnavanil.controls;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;
import com.jogamp.opengl.GL2;

public class MouseDrag implements MouseListener {
    public GL2 gl;
    static MouseDrag ins;
    int sX,sY;
    public int dX,dY;
    public int mX,mY;
    private MouseDrag(){}
    public static MouseDrag getInstance(){
        if(ins == null){
            ins = new MouseDrag();
        }
        return ins;
    }
    boolean pressed = false;

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(!pressed)pressed = true;
        sX = e.getX();
        sY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(pressed) {
            pressed = false;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mX = e.getX();
        mY = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(pressed) {
            if(dX==0 && dY == 0) {
            dX = e.getX()-sX;
            dY = e.getY()-sY;

                sX = e.getX();
                sY = e.getY();
            }
        }
    }

    @Override
    public void mouseWheelMoved(MouseEvent e) {

    }
}
