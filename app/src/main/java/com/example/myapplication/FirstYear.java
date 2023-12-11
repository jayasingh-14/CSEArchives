package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FirstYear extends AppCompatActivity {

    ImageButton c,eng,maths,physics,egd,labs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);

        c = findViewById(R.id.c);
        eng = findViewById(R.id.eng);
        maths = findViewById(R.id.maths);
        physics = findViewById(R.id.physics);
        egd = findViewById(R.id.egd);
        labs = findViewById(R.id.labs1);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FirstYear.this, Display.class),0);
            }
        });
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FirstYear.this, Display.class),0);
            }
        });
        egd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FirstYear.this, Display.class),0);
            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FirstYear.this, Display.class),0);
            }
        });
        labs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FirstYear.this, Display.class),0);
            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FirstYear.this, Display.class),0);
            }
        });
        // Find the button by ID
        Button notesButton = findViewById(R.id.notesbutton);

        // Set OnClickListener for the button
        notesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity here
                Intent intent = new Intent(FirstYear.this, NoteEssentials.class);
                startActivity(intent);
            }
        });
    }
}