package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SecondYear extends AppCompatActivity {

    ImageButton oop,dsa,os,dismath,spdd,labs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_year);

        oop = findViewById(R.id.oop);
        dsa = findViewById(R.id.dsa);
        os = findViewById(R.id.os);
        dismath = findViewById(R.id.dismath);
        spdd = findViewById(R.id.spdd);
        labs = findViewById(R.id.labs2);

        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(SecondYear.this,Display.class),0);
            }
        });
        dsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(SecondYear.this,Display.class),0);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(SecondYear.this,Display.class),0);
            }
        });
        dismath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(SecondYear.this,Display.class),0);
            }
        });
        spdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(SecondYear.this,Display.class),0);
            }
        });
        labs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(SecondYear.this,Display.class),0);
            }
        });

        // Find the button by ID
        Button notesButton = findViewById(R.id.notesbutton);

        // Set OnClickListener for the button
        notesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity here
                Intent intent = new Intent(SecondYear.this, NoteEssentials.class);
                startActivity(intent);
            }
        });
    }
}