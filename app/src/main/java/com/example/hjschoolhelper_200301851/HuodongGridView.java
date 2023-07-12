package com.example.hjschoolhelper_200301851;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class HuodongGridView extends GridView {
    public HuodongGridView(Context context) {
        super(context);
    }

    public HuodongGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HuodongGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int h=MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, h);
    }
}
