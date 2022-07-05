package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    TextView textView;
    Button countButton;

    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textV);
        countButton= (Button) findViewById(R.id.countBtn);

        countButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter ++;
                textView.setText(Integer.toString(counter));
            }
        });


    }

    public void HelloToast(View view){
        Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

}