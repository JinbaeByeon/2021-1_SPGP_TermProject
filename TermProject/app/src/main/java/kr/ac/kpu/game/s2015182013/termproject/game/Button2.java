package kr.ac.kpu.game.s2015182013.termproject.game;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.Log;

import kr.ac.kpu.game.s2015182013.termproject.R;
import kr.ac.kpu.game.s2015182013.termproject.framework.BoxCollidable;
import kr.ac.kpu.game.s2015182013.termproject.framework.GameBitmap;
import kr.ac.kpu.game.s2015182013.termproject.framework.GameObject;
import kr.ac.kpu.game.s2015182013.termproject.framework.IndexedAnimationGameBitmap;
import kr.ac.kpu.game.s2015182013.termproject.framework.IndexedGameBitmap;
import kr.ac.kpu.game.s2015182013.termproject.framework.Recyclable;
import kr.ac.kpu.game.s2015182013.termproject.ui.view.GameView;

public class Button2 implements GameObject, BoxCollidable, Recyclable {
    private static final String TAG = Button2.class.getSimpleName();
    private float x;
    private GameBitmap bitmap;
    private float y;
    private float r;

    enum Type{
        bomb, p1,p2,p3,p4
    }
    public Button2(float x, float y, int type) {

        Log.d(TAG, "loading bitmap for button");
        this.x = x;
        this.y = y;

        if(type==Type.p1.ordinal())
            bitmap = new GameBitmap(R.mipmap.enemy_a);
        if(type==Type.p2.ordinal())
            bitmap = new GameBitmap(R.mipmap.enemy_b);
        if(type==Type.p3.ordinal())
            bitmap = new GameBitmap(R.mipmap.enemy_c);
        if(type==Type.p4.ordinal())
            bitmap = new GameBitmap(R.mipmap.enemy_d);
//        bitmap = new IndexedGameBitmap(R.mipmap.fighters,67,80,11,0,0);
//        bitmap.setIndex(5);
        int w = bitmap.getWidth();
        int h = bitmap.getHeight();
        r = w<h?w:h;
    }


    @Override
    public void update() {

    }

    @Override
    public void draw(Canvas canvas) {
        bitmap.draw(canvas, x, y);
    }

    @Override
    public void hitBullet(int damage) {

    }

    @Override
    public void getBoundingRect(RectF rect) {
        bitmap.getBoundingRect(x, y, rect);
    }

    @Override
    public void recycle() {
        // 재활용통에 들어가는 시점에 불리는 함수. 현재는 할일없음.
    }

    public boolean isClicked(float mx, float my) {
        float dx = x- mx;
        float dy = y-my;
        if(dx*dx+dy*dy <= r*r)
            return true;
        return false;
    }
}