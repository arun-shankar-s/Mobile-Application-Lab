package com.example.addition;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        res=(TextView)findViewById(R.id.result);
        Bundle b=getIntent().getExtras();
        int n1=Integer.parseInt(b.getString("num1"));
        int n2=Integer.parseInt(b.getString("num2"));

        int sum=n1+n2;
        res.setText("Sum:"+sum);



    }
}

