package com.rocketmail.vaishnavanil.rendering;

import com.jogamp.nativewindow.WindowClosingProtocol;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;
import com.rocketmail.vaishnavanil.controls.MouseDrag;
import com.rocketmail.vaishnavanil.controls.MouseRelative;
import com.rocketmail.vaishnavanil.controls.MouseSelector;

public class Renderer  {
    public static GL2 gl;
    public static float tX,tY;
    private static GLWindow window;
    public static int SCREEN_WIDTH = 640;
    public static int SCREEN_HEIGHT = 360;

    public static float UNIT_WIDE = 10f;
    public static float UNIT_TALL(){
        return getWindowHeight()/(getWindowWidth()/UNIT_WIDE);
    }
    public static int getWindowWidth(){
        return window.getWidth();
    }
    public static int getWindowHeight(){
        return window.getHeight();
    }
    public static  void init(){
        GLProfile.initSingleton();
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities com = new GLCapabilities(profile);
        window = GLWindow.create(com);
        window.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
        window.setDefaultCloseOperation(WindowClosingProtocol.WindowClosingMode.DISPOSE_ON_CLOSE);
        window.addGLEventListener(new GLListener());
        window.addMouseListener(MouseRelative.getInstance());
        window.addMouseListener(MouseDrag.getInstance());
        window.addMouseListener(MouseSelector.getInstance());
        window.setResizable(false);
        window.setTitle("Project Z");
        FPSAnimator animator = new FPSAnimator(window,60);
        animator.start();
        //window.setFullscreen(true);
        window.setVisible(true);
    }
}
