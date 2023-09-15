package com.suhun.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class SignView extends View {
    private LinkedList< LinkedList<HashMap<String, Float>>> lines = new LinkedList<>();
    private LinkedList< LinkedList<HashMap<String, Float>>> recycle = new LinkedList<>();
    public SignView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(Color.GREEN);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(7);
        for(LinkedList<HashMap<String, Float>> line:lines ){
            for(int i=1;i<line.size();i++){
                HashMap<String, Float> p1 = line.get(i);
                HashMap<String, Float> p0 = line.get(i-1);
                canvas.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"), paint);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        HashMap<String, Float> point = new HashMap<>();
        point.put("x", event.getX());
        point.put("y", event.getY());
        if(event.getAction() == MotionEvent.ACTION_DOWN){//draw new line
            LinkedList<HashMap<String, Float>> line = new LinkedList<>();
            line.add(point);
            lines.add(line);

        }else if(event.getAction() == MotionEvent.ACTION_MOVE){//draw old line
            lines.getLast().add(point);
        }
        invalidate();
        return true;
    }
    public void undo(){
        if(lines.size()>0){
            recycle.add(lines.removeLast());
            invalidate();
        }
    }
}
