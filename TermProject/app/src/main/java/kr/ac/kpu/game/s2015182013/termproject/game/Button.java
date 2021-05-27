package kr.ac.kpu.game.s2015182013.termproject.game;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.Log;

import kr.ac.kpu.game.s2015182013.termproject.R;
import kr.ac.kpu.game.s2015182013.termproject.framework.BoxCollidable;
import kr.ac.kpu.game.s2015182013.termproject.framework.GameBitmap;
import kr.ac.kpu.game.s2015182013.termproject.framework.GameObject;
import kr.ac.kpu.game.s2015182013.termproject.framework.IndexedAnimationGameBitmap;
import kr.ac.kpu.game.s2015182013.termproject.framework.Recyclable;
import kr.ac.kpu.game.s2015182013.termproject.ui.view.GameView;

public class Button implements GameObject {
    private static final String TAG = Button.class.getSimpleName();
    private float x;
    private GameBitmap bitmap;
    private float y;
    private int r;

    public Button(float x, float y) {
        Log.d(TAG, "loading bitmap for coin");

        this.x = x;
        this.y = y;
        this.r = 100;

        bitmap = new GameBitmap(R.mipmap.btn_b);
        bitmap.setSize(r,r);
    }


    @Override
    public void update() {
    }

    @Override
    public void draw(Canvas canvas) {
        bitmap.draw(canvas, x, y);
    }


    public boolean isClicked(float x, float y) {
        float dx = this.x-x;
        float dy = this.y-y;
        if(dx*dx+dy*dy<=r*r){
            return true;
        }
        return false;
    }
}