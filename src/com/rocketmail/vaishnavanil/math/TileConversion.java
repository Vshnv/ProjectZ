package com.rocketmail.vaishnavanil.math;

public class TileConversion {


    /*Converts tile coordinate to array coordinates
    * */
    public static int[] tileToArray(int tileX,int tileY,int arrW,int arrH){
        int[] arrCenter = new int[]{arrW%2 == 0 ? arrW/2:(arrW/2) +1 , arrH%2 == 0 ? arrH/2:(arrH/2) +1};
        arrCenter[0] -= tileX;
        arrCenter[1] -= tileY;
        return arrCenter;
    }

    /*Converts array coordinates to tile coordinate
     * */
    public static int[] arrayToTile(int arrayX,int arrayY,int arrW,int arrH){
        int[] tileCenter = new int[]{arrW%2 == 0 ? arrW/2:(arrW/2) +1 , arrH%2 == 0 ? arrH/2:(arrH/2) +1};
        tileCenter[0] += arrayX;
        tileCenter[1] += arrayY;
        return tileCenter;
    }


}
