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
    //Button next;
    String[] courses = {"DBMS", "ASE", "CN", "OS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Spinner sp=findViewById(R.id.spinner);
        res=(TextView)findViewById(R.id.result);
        //next= (Button) findViewById(R.id.button);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,courses);
        //arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(arrayAdapter);

        /*next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedCourse = sp.getSelectedItem().toString();

                // Update the TextView with the selected item
                res.setText("Selected Course: " + selectedCourse);
            }
        });*/

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
