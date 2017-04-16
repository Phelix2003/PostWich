package com.postwich.sandwich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String applicationName = getResources().getString(R.string.screen_position);

        TextView text = new TextView(this);
        text.setText(applicationName);
        setContentView(text);

    }
}
