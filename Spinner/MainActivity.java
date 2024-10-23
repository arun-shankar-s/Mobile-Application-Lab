package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    TextView res;
    String[] courses = {"DBMS", "ASE", "CN", "OS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Spinner sp=findViewById(R.id.spinner);
        res=(TextView)findViewById(R.id.result);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,courses);

        sp.setAdapter(arrayAdapter);

    

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                res.setText("Selected Course:"+courses[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                res.setText("No course selected");
            }
        });
    }
}
