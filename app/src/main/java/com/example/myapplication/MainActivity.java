package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the "Get Started" button by its ID
        Button getStartedButton = findViewById(R.id.getStartedButton);

        // Set a click listener for the button
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the "Get Started" button click, you can navigate to the next activity or perform any other action.
                // For now, let's just show a toast message.
                showToast("Get Started button clicked!");
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }

    private void showToast(String message) {
        // A simple method to show a toast message
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
