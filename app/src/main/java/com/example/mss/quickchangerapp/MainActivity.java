package com.example.mss.quickchangerapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {



    RelativeLayout layout;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.rGroup);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {



                switch (checkedId){

                    case R.id.rBtnBlue:

                        layout.setBackgroundColor(Color.parseColor("#74B9FF"));
                        break;

                    case R.id.rBtnGreen:

                        layout.setBackgroundColor(Color.parseColor("#7CEC9F"));
                        break;
                    case R.id.rBtnRed:

                        layout.setBackgroundColor(Color.parseColor("#EC4849"));
                        break;
                }

            }
        });
    }
}
