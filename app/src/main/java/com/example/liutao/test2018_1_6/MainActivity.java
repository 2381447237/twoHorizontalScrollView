package com.example.liutao.test2018_1_6;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements ScrollViewListener{
    private ObservableScrollView sv1, sv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sv1 = (ObservableScrollView) findViewById(R.id.sv1);
        sv2 = (ObservableScrollView) findViewById(R.id.sv2);
        sv1.setOnScrollViewListener(this);
        sv2.setOnScrollViewListener(this);
    }

    @Override
    public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldx, int oldy) {
        if (scrollView == sv1) {
            sv2.scrollTo(x, y);
        } else if (scrollView == sv2) {
            sv1.scrollTo(x, y);
        }
    }
}
