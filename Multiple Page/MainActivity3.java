package com.example.multiplepages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    TextView question;
    Button previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        question=(TextView)findViewById(R.id.textView);
        previous=(Button)findViewById(R.id.button);
        question.setText("Q3.Hello World");

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(i);
            }
        });

    }
}
