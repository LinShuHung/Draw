package com.suhun.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class CircleView extends View {
    public int width, height;

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(Color.GREEN);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(4);
                canvas.drawLine(0, getHeight()/2, getWidth(), getHeight()/2, paint);
//        canvas.drawLine(getWidth() / 2, 40, getWidth() / 2, 100, paint);
        Log.d("suhun", "++++W:" + width + ", H" + height);

    }
}
