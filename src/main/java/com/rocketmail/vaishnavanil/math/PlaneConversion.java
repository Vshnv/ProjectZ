package com.rocketmail.vaishnavanil.math;

import com.rocketmail.vaishnavanil.math.planes.Coordinate;
import com.rocketmail.vaishnavanil.math.planes.Plane;

public class PlaneConversion {
    public static float[] toIso(float x,float y){
        return new float[]{x-y,(x+y)/2};
    }
    public static float[] toCart(float isoX,float isoY){
        return new float[]{(2 * isoY + isoX) / 2,(2 * isoY - isoX) / 2};
    }
    public static void toIso(Coordinate c){
        if(c.getPlaneType() == Plane.ISOMETRIC)return;
        if(c.getPlaneType() != Plane.CARTESIAN){
           toCartesian(c);
        }
        c.setX(c.getX()-c.getY());
        c.setY((c.getX()+c.getY())/2);
        c.setPlaneType(Plane.CARTESIAN);
    }
    //For future use.
    @Deprecated
    public static void toCartesian(Coordinate c){

    }
}
