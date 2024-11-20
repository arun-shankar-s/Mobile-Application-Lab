package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    TextView res;
    String[] courses = {"DBMS", "ASE", "CN", "OS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=(Spinner)findViewById(R.id.spinner);
        res=(TextView)findViewById(R.id.result);


        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,courses);
        sp.setAdapter(arrayAdapter);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i==0) {
                    res.setText("Software for managing and accessing databases.");
                } else if (i==1) {
                    res.setText("Study of advanced software development methods.");
                } else if (i==2) {
                    res.setText("Interconnected systems sharing data and resources.");

                } else if (i==3) {
                    res.setText("Software managing hardware and program resources.");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                res.setText("No course selected");
            }
        });
    }
}
