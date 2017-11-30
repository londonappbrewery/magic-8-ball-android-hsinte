package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int [] results={
                R.string.ans1,
                R.string.ans2,
                R.string.ans3,
                R.string.ans4,
                R.string.ans5,
                R.string.ans6,
                R.string.ans7,
                R.string.ans8,
                R.string.ans9
        };
        final TextView ansText=findViewById(R.id.ans_textView);
        Button ask_btn=findViewById(R.id.ask_button);
        ask_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r=new Random();
                int number=r.nextInt(9);
                ansText.setText(results[number]);
            }
        });

    }
}
