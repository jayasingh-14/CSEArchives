package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    EditText name;
    Spinner branch, year;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.editTextName);
        branch = findViewById(R.id.spinnerBranch);
        year = findViewById(R.id.spinnerYear);
        next = findViewById(R.id.nextButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                archive(view);
            }
        });
    }

    private void archive(View v)
    {
        if(v.getId()==R.id.nextButton)
        {
            if(year.getSelectedItem().toString().equals("First Year"))
            {
                startActivityForResult(new Intent(MainActivity2.this, FirstYear.class),1);
            }
            else if(year.getSelectedItem().toString().equals("Second Year"))
            {
                startActivityForResult(new Intent(MainActivity2.this, SecondYear.class),2);
            }
            else if(year.getSelectedItem().toString().equals("Third Year"))
            {
                startActivityForResult(new Intent(MainActivity2.this, ThirdYear.class),3);
            }
            else if(year.getSelectedItem().toString().equals("Fourth Year"))
            {
                startActivityForResult(new Intent(MainActivity2.this, FourthYear.class),4);
            }
        }
    }
}