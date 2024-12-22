package com.example.pasada_customer;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class PadalaSecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.padala_secondpage);

        ImageButton backButton = findViewById(R.id.back_button);

        // OnclickListener for the backButton
        backButton.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(PadalaSecondPage.this, PadalaFirstPage.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        TextView pickUpLocation = findViewById(R.id.pickup_location);

        // OnclickListener for the backButton
        pickUpLocation.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(PadalaSecondPage.this, PadalaPickupInput.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        TextView dropOffLocation = findViewById(R.id.dropoff_location);

        // OnclickListener for the backButton
        dropOffLocation.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(PadalaSecondPage.this, PadalaDropoffInput.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        AppCompatButton nextButton = findViewById(R.id.next_button);

        // OnclickListener for the backButton
        nextButton.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(PadalaSecondPage.this, PadalaConfirmation.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

    }

    // You can add other methods to handle user interactions, data fetching, etc.
}

