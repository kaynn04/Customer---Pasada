package com.example.pasada_customer;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class HatidSundoPickupInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.hatid_sundo_pickup_inputfield);

        ImageButton backButton = findViewById(R.id.back_button);

        // OnclickListener for the backButton
        backButton.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(HatidSundoPickupInput.this, HatidSundoFirstPage.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // Confirm Button Logic
        AppCompatButton confirmButton = findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener(v -> {
            Intent intent = new Intent(HatidSundoPickupInput.this, HatidSundoPickupConfirmation.class); // Replace with the correct activity
            startActivity(intent);
        });
    }

    // You can add other methods to handle user interactions, data fetching, etc.
}

