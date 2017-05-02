package com.tri.maldor.familyfoodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }
    Intent intent = getIntent();
    String message = (TextView) findById(R.id.textView);

    TextView textView = (TextView) findViewById(R.id.textView);
    textview.setText(message);

}
