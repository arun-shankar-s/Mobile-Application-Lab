package com.example.multiplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView res;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        res=(TextView)findViewById(R.id.result);
        Bundle b=getIntent().getExtras();
        int n=Integer.parseInt(b.getString("number"));
        int r=Integer.parseInt(b.getString("range"));

        for(int i=1;i<=r;i++){
            String rt=n+"*"+i+"="+(n*i)+"\n";
            res.append(rt);
        }

    }
}
