package com.rocketmail.vaishnavanil.rendering;


import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.fixedfunc.GLMatrixFunc;
import com.rocketmail.vaishnavanil.Main;
import com.rocketmail.vaishnavanil.controls.MouseDrag;
import com.rocketmail.vaishnavanil.graphics.Graphics;
import com.rocketmail.vaishnavanil.rendering.Renderer;
import com.rocketmail.vaishnavanil.world.PlayerWorld;

import java.awt.*;

public class GLListener implements GLEventListener {
    public static float CamX = 0;
    public static float CamY = 0;
    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(0,0,0,1);
        Renderer.gl = gl;
        Graphics.init(gl);
        MouseDrag.getInstance().gl = gl;

    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        drawable.disposeGLEventListener(this,true);
        System.exit(0);
    }
    public float[] toIso(float x,float y){
        return new float[]{x-y,(x+y)/2};
    }
    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl =drawable.getGL().getGL2();
        float trX = (Renderer.UNIT_WIDE/Renderer.getWindowWidth()) *(MouseDrag.getInstance().dX), trY = (Renderer.UNIT_TALL()/Renderer.getWindowHeight())*((MouseDrag.getInstance().dY*-1));
        CamX+=trX;CamY+=trY;
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        gl.glTranslatef(CamX,CamY,0);

        Main.pw.render();
        gl.glFlush();
        gl.glTranslatef(-CamX,-CamY,0);
        MouseDrag.getInstance().dX = 0;
        MouseDrag.getInstance().dY = 0;
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);
        gl.glLoadIdentity();
        float unitsTall = Renderer.UNIT_TALL();
        gl.glOrtho(-Renderer.UNIT_WIDE/2,Renderer.UNIT_WIDE/2,-unitsTall/2,unitsTall/2,-1,1);
        gl.glMatrixMode(GLMatrixFunc.GL_MODELVIEW);
    }
}
