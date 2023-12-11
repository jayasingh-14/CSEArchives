package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FourthYear extends AppCompatActivity {

    ImageButton ai,ml,se,cd,project,labs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_year);

        ai = findViewById(R.id.ai);
        ml = findViewById(R.id.ml);
        se = findViewById(R.id.se);
        cd = findViewById(R.id.cd);
        project = findViewById(R.id.project);
        labs = findViewById(R.id.labs4);

        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FourthYear.this,Display.class),0);
            }
        });
        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FourthYear.this,Display.class),0);
            }
        });
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FourthYear.this,Display.class),0);
            }
        });
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FourthYear.this,Display.class),0);
            }
        });
        project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FourthYear.this,Display.class),0);
            }
        });
        labs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FourthYear.this,Display.class),0);
            }
        });

        // Find the button by ID
        Button notesButton = findViewById(R.id.notesbutton);

        // Set OnClickListener for the button
        notesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity here
                Intent intent = new Intent(FourthYear.this, NoteEssentials.class);
                startActivity(intent);
            }
        });
    }
}