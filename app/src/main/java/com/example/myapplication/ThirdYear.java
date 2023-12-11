package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ThirdYear extends AppCompatActivity {

    ImageButton map,cn,daa,dbms,dp,labs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_year);

        map = findViewById(R.id.map);
        cn = findViewById(R.id.cn);
        daa = findViewById(R.id.daa);
        dbms = findViewById(R.id.dbms);
        dp = findViewById(R.id.dp);
        labs = findViewById(R.id.labs3);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(ThirdYear.this, Display.class),0);
            }
        });
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/0/folders/1hkZtmUaxdJBhvJPc-ZaiT_13aqHy7iRV")));
            }
        });
        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/drive/u/0/folders/1VC2SfmFQHdUUmH371Txh3n6NZOdlTS_7")));
            }
        });
        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/drive/u/0/folders/1VC2SfmFQHdUUmH371Txh3n6NZOdlTS_7")));
            }
        });
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(ThirdYear.this, Display.class),0);
            }
        });
        labs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(ThirdYear.this, Display.class),0);
            }
        });

        // Find the button by ID
        Button notesButton = findViewById(R.id.notesbutton);

        // Set OnClickListener for the button
        notesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity here
                Intent intent = new Intent(ThirdYear.this, NoteEssentials.class);
                startActivity(intent);
            }
        });
    }
}