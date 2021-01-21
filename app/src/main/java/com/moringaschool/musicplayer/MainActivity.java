package com.moringaschool.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.l1) LinearLayout mLinearLayout1;
    @BindView(R.id.l2) LinearLayout mLinearLayout2;
    @BindView(R.id.tag) TextView mTag;
    @BindView(R.id.app_title) TextView mApp_tittle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final Intent intent = new Intent(MainActivity.this,MusicActivty.class);
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();

                }
            }
        };thread.start();
    }
}