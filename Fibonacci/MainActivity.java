package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button btn;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        number=(EditText)findViewById(R.id.number);
        result=(TextView)findViewById(R.id.result);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=number.getText().toString();
                int num=Integer.parseInt(n1);
                int a=0;
                int b=1;
                int i=2;
                if (num==1){
                    result.setText(String.valueOf(a));
                }
                else{
                    result.setText(String.valueOf(a) + ", " + String.valueOf(b));
                }
                while(i<num){
                    int sum=a+b;
                    a=b;
                    b=sum;
                    i=i+1;
                    result.append(","+b);


                }


            }
        });

    }
}
