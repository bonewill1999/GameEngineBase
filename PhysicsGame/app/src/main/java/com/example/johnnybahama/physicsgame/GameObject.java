package com.example.johnnybahama.physicsgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by rushd on 7/5/2017.
 */

public class GameObject {


    private Bitmap image;
    private int x, y;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
    private Canvas canvas;

    public GameObject (){

    }

    public GameObject (Bitmap bmp, Canvas canvas) {
        image = bmp;
        x = 100;
        y = 100;
        this.canvas = canvas;
    }


    public void draw() {
        this.canvas.drawBitmap(image, x, y, null);


    }
    public void update() {

        //game object instructions

    }

    public void checkCollision(GameObject gameObject) {

        //if x y link up, this.oncolliion and gameObject.oncollisoin

    }


    public void onCollision(GameObject gameObject) {

        //somthing


    }

    public void animate(){
        //update character bitmap
    }

    public Bitmap getImage() {
        return image;
    }

    public int getX() {
        return x;
    }


    public int getY(){
        return y;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y){
        this.y = y;
    }
}