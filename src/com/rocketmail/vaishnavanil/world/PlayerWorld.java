package com.rocketmail.vaishnavanil.world;

import com.rocketmail.vaishnavanil.graphics.Graphics;

import java.util.concurrent.ThreadLocalRandom;

public class PlayerWorld {
    private int[][] tile;
    private int h,w;
    public int getH(){return h;}
    public int getW(){return w;}
    /*
    /Generates a blank world
     */
    public PlayerWorld(int width,int height){
        h = height;
        w = width;
        tile = new int[w][h];
        for(int x = 0; x<w;x++){
            for(int y = 0; y<h;y++){
                tile[x][y] = ThreadLocalRandom.current().nextInt(255);
            }
        }
    }
    private int sX,sY;
    public void mouseSelect(int x,int y){
        sX = x;
        sY = y;
    }
    public void render(){
        for(int x = w-1;x>=0;x--){
            for(int y = h-1;y>=0;y--){
                if(x != sX || y != sY) {
                    Graphics.getGraphics().setColor(tile[x][y], 0, 0);
                }else{
                    Graphics.getGraphics().setColor(255,0,0);
                }
                Graphics.getGraphics().fillIsoTile(x,y,1,1);
            }
        }
    }
}
