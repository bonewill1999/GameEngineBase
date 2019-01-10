package com.example.johnnybahama.physicsgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.Toast;

public class PlayableObject extends DynamicObject {


    private Bitmap image;
    private int x, y;
    private int moveSpeed;
    private int health = 5;
    private Canvas canvas;

    private String commandMode;

    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;



    public PlayableObject (Bitmap bmp) {
        this.image = bmp;
        this.x = 100;
        this.y = 100;
        this.moveSpeed = 5;
        this.canvas = canvas;
    }

    public PlayableObject (Bitmap bmp, int x, int y) {
        this.image = bmp;
        this.x = x;
        this.y = y;
        this.moveSpeed = 5;
        this.canvas = canvas;
    }

    public PlayableObject (Bitmap bmp, int x, int y, int moveSpeed) {
        this.image = bmp;
        this.x = x;
        this.y = y;
        this.moveSpeed = moveSpeed;
        this.canvas = canvas;
    }





    public void draw(Canvas canvas) {
      //  while(this.health > 0){

            //System.out.print("REEEEEEEEEEEEEEEEEEEE");

            canvas.drawBitmap(this.image, this.x, this.y, null);
      //  }
    }
    public void update() {

    }

    public void checkCollision(GameObject gameObject) {

        int thisHitBoxW = this.image.getWidth();
        int thisHitBoxH = this.image.getHeight();
        int gameObjectHitBoxW = gameObject.getImage().getWidth();
        int gameObjectHitBoxH = gameObject.getImage().getHeight();

        int spacingW = thisHitBoxW - gameObjectHitBoxW;
        int spacingH = thisHitBoxH - gameObjectHitBoxH;


        //if x y link up, this.oncolliion and gameObject.oncollisoin
        if ((Math.abs(this.x - gameObject.getX()) < spacingW) && (Math.abs(this.y - gameObject.getY()) < spacingH)  ){
            this.onCollision(gameObject);
            gameObject.onCollision(this);
        }

    }


    public void onCollision(GameObject gameObject) {

        //somthing


    }



    public void animate(String direction){
        //change this.bitmap for each dicrection

    }

    public void move(int newX, int newY, int speed){
        System.out.print("pls work");
        this.x = newX;
        this.y = newY;
    //    this.x +=20;


////        while(Math.abs(this.x - newX) < speed && Math.abs(this.y - newY) < speed){
////
//        while(this.x < newX || this.y < newY) {
//
//
//            if (this.x < newX) {this.x += speed;}
//            //this.animate("left");
//            if (this.x > newX) {this.x += speed;}
//            //this.animate("right");
//            if (this.y < newY) {this.y += speed;}
//         //   this.animate("up");
//            if (this.y > newY) {this.y -= speed;}
//        //    this.animate("down");
//        }
////        }


    }






}