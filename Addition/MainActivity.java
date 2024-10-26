package com.example.addition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        number1= (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String n1= number1.getText().toString();
                String n2 = number2.getText().toString();
                i.putExtra("num1", n1);
                i.putExtra("num2", n2);
                startActivity(i);
            }
        });


    }
}
