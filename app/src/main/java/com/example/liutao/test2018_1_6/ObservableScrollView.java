package com.example.liutao.test2018_1_6;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

/**
 * Created by liutao on 2018/1/6.
 */

public class ObservableScrollView extends HorizontalScrollView {
    ScrollViewListener scrollViewListener;
    public ObservableScrollView(Context context) {
        super(context);
    }
    public ObservableScrollView(Context context, AttributeSet attrs,
                                int defStyle) {
        super(context, attrs, defStyle);
    }
    public ObservableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public void setOnScrollViewListener(ScrollViewListener scrollViewListener) {
        this.scrollViewListener = scrollViewListener;
    }
    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        super.onScrollChanged(x, y, oldx, oldy);
        if (scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
        }
    }



}
