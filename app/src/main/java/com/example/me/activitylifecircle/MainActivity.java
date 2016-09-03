package com.example.me.activitylifecircle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static String LOG_TAG = "MainActivity";


    @Bind(R.id.btn_back_last)
    TextView btnBackLast;
    @Bind(R.id.btn_click_back)
    TextView btnClickBack;
    @Bind(R.id.btn_click_home)
    TextView btnClickHome;
    @Bind(R.id.btn_destroy_relaunch)
    TextView btnDestroyRelaunch;
    @Bind(R.id.btn_open_new)
    TextView btnOpenNew;
    @Bind(R.id.btn_first_launch)
    TextView btnFirstLaunch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        log("onCreate");
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnBackLast.setOnClickListener(this);
        btnClickBack.setOnClickListener(this);
        btnClickHome.setOnClickListener(this);
        btnDestroyRelaunch.setOnClickListener(this);
        btnFirstLaunch.setOnClickListener(this);
        btnOpenNew.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        log("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }

    private void log(String logText) {
        Log.w(LOG_TAG, LOG_TAG + "  >>  " + logText);
        Toast.makeText(MainActivity.this, LOG_TAG + "  >>  " + logText, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_back_last:
                intent = new Intent(this, TempActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_click_back:
                onBackPressed();
                break;
            case R.id.btn_click_home:
                intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
                break;
            case R.id.btn_destroy_relaunch:


                break;
            case R.id.btn_first_launch:
                break;
            case R.id.btn_open_new:
                intent = new Intent(this, NewActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
