package com.example.johnnybahama.physicsgame;


import android.app.ActionBar;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Toast;

import java.lang.reflect.Parameter;

/**
 * Created by rushd on 7/5/2017.
 */

public class GameView extends SurfaceView implements SurfaceHolder.Callback {
    private MainThread thread;
    public PlayableObject mainCharacter;
    private final Context dummyContext = this.getContext();





    public GameView(Context context) {
        super(context);

        getHolder().addCallback(this);


        thread = new MainThread(getHolder(), this);
        this.setBackgroundResource(R.drawable.andriod);


  //      mainCharacter = new PlayableObject(BitmapFactory.decodeResource(getResources(),R.drawable.test),getHolder().lockCanvas(), 3, 3, 3 );

        setFocusable(true);


    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {

        return super.onTouchEvent(event);
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        mainCharacter = new PlayableObject(BitmapFactory.decodeResource(getResources(),R.drawable.test), 220, 220, 1);
        System.out.print("REEEEEEEEEEEEEEEEEEEE");








        thread.setRunning(true);
        thread.start();
        this.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mainCharacter.move(0, 0, 1);





                return false;





            }
        });

    }



    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        while (retry) {
            try {
                thread.setRunning(false);
                thread.join();

            } catch(InterruptedException e){
                e.printStackTrace();
            }
            retry = false;
        }
    }

    public void update() {
        mainCharacter.update();

    }



    @Override
    public void draw(Canvas canvas)
    {
       // System.out.print("REEEEEEEEEEEEEEEEEEEE");
   //     canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.test), 50, 50, null);



        super.draw(canvas);
        if(canvas!=null) {
            //canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.andriod), 0, 0, null);


            mainCharacter.draw(canvas);

            //System.out.print("REEEEEEEEEEEEEEEEEEEE");
            //canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.test), 50, 50, null);




        }
    }



}


