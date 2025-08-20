package com.fightcalendar.app;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout root = new FrameLayout(this);
        TextView tv = new TextView(this);
        tv.setText("Fight Calendar");
        tv.setTextSize(20f);
        tv.setPadding(32, 32, 32, 32);
        tv.setGravity(Gravity.CENTER);
        root.addView(tv);

        setContentView(root);
    }
}
