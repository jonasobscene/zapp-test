package com.example.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)
                findViewById(R.id.push_the_button);
        //buttonClick(button);


    }

    public void buttonClick(View button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Log.d("ZAPP", "OMG YOU DID IT!!!");

                final EditText editText = (EditText)findViewById(R.id.main_activity_edittext);
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);

                String text = editText.getText().toString();
                intent.putExtra("text_from_main_activity", text);

                startActivity(intent);
            }
        });
        //trololololol!
    }
}
