package com.example.multiplepages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView question;
    Button next,previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        question=(TextView)findViewById(R.id.textView);
        next=(Button)findViewById(R.id.button);
        previous=(Button)findViewById(R.id.button2);
        question.setText("Q2.Hello World");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
