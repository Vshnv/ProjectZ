package com.rocketmail.vaishnavanil.graphics;

import com.jogamp.opengl.GL2;
import com.rocketmail.vaishnavanil.math.PlaneConversion;
import com.rocketmail.vaishnavanil.math.planes.Coordinate;

public class Graphics {
    /*Singleton reference*/
    private static Graphics instance;


    /*Used to render*/
    GL2 gl;


    /*Static method to retrieve singleton (MUST INITALIZE WITH #init(GL2) FIRST)
    * */
    public static Graphics getGraphics(){
        return instance;
    }


    public void setColor(int R,int G,int B){
        gl.glColor3f(((float)R)/255,((float)G)/255,((float)B)/255);
    }


    /*Util methods
    * */
    public void fillIsoTile(float x,float y,float width,float height){
        float[] v1 = PlaneConversion.toIso(x-width/2,y-height/2);
        float[] v2 = PlaneConversion.toIso(x+width/2,y-height/2);
        float[] v3 = PlaneConversion.toIso(x+width/2,y+height/2);
        float[] v4 = PlaneConversion.toIso(x-width/2,y+height/2);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex2f(v1[0],v1[1]);
        gl.glVertex2f(v2[0],v2[1]);
        gl.glVertex2f(v3[0],v3[1]);
        gl.glVertex2f(v4[0],v4[1]);
        gl.glEnd();
        gl.glFlush();
    }
    public void fillRect(float x, float y,float width,float height){
        gl.glBegin(GL2.GL_QUADS);
            gl.glVertex2f(x-width/2,y-height/2);
            gl.glVertex2f(x+width/2,y-height/2);
            gl.glVertex2f(x+width/2,y+height/2);
            gl.glVertex2f(x-width/2,y+height/2);
        gl.glEnd();
        gl.glFlush();
    }







    /*Initalize the singleton instance
    * */
    public static void init(GL2 gl){
        if(instance == null){
            instance = new Graphics(gl);
        }
    }
    /*Private Constructor
    * */
    private Graphics(GL2 gl){
        this.gl = gl;
    }
}
