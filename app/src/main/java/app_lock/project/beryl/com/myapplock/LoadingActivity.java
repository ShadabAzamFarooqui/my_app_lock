package app_lock.project.beryl.com.myapplock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import app_lock.project.beryl.com.myapplock.navigation.HomeActivity;


/**
 * Created by Shadab Aazam on 11/09/2018.
 */
public class LoadingActivity extends AppCompatActivity {
    Context context;
    private static int TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        context = getApplicationContext();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LoadingActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);

    }

}
