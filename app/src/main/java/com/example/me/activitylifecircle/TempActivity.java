package com.example.me.activitylifecircle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by gechentuo on 16/9/4.
 */
public class TempActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 2000);

    }
}
