package com.rocketmail.vaishnavanil.math.planes;

public class Coordinate {
    private float x;
    private float y;
    private Plane planeType;
    public Coordinate(float x,float y){
        this.x = x;
        this.y = y;
        planeType = Plane.CARTESIAN;
    }

    protected Coordinate(float x,float y,Plane p){
        this.x = x;
        this.y = y;
        planeType = p;
    }

    public Plane getPlaneType(){
        return planeType;
    }

    public float getX(){
        return x;
    }

    public float getY() {
        return y;
    }





    /*For internal use only
     **/
    @Deprecated
    public void setX(float x){
        this.x = x;
    }
    @Deprecated
    public void setY(float y){
        this.y = y;
    }
    @Deprecated
    public void setPlaneType(Plane p){
        planeType = p;
    }


    public static float distance(float x1,float y1,float x2,float y2){
        return (float)Math.sqrt(Math.pow(y2-y1,2)+Math.pow(x2-x1,2));
    }
}
