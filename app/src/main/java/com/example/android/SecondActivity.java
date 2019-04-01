package com.example.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = (TextView)findViewById(R.id.second_activity_textview);
        String textFromMainActivity = getIntent().getExtras().getCharSequence("text_from_main_activity", "lol").toString();
        textView.setText(textFromMainActivity);
    }
}
