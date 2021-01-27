package com.example.event_handling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ButButtonClick,ButMotionEvent,ButCommonGestures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        ButButtonClick = (Button) findViewById(R.id.ButButtonClick);
        ButMotionEvent = (Button) findViewById(R.id.ButMotionEvent);
        ButCommonGestures = (Button) findViewById(R.id.ButCommonGestures);
        ButButtonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".ButtonClick");
                startActivity(intent);
            }
        });
        ButMotionEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".MootionEvent");
                startActivity(intent);
            }
        });
        ButCommonGestures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".CommonGestures");
                startActivity(intent);
            }
        });
    }


}