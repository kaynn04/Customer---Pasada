package com.example.pasada_customer;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class HatidSundoPickupConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.hatid_sundo_pickup_confirmation);

        ImageButton backButton = findViewById(R.id.back_button);

        // OnclickListener for the backButton
        backButton.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(HatidSundoPickupConfirmation.this, HatidSundoPickupInput.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // Confirm Button Logic
        AppCompatButton confirmButton = findViewById(R.id.confirm_button);

        confirmButton.setOnClickListener(v -> {
            Intent intent = new Intent(HatidSundoPickupConfirmation.this, HatidSundoFirstPage.class); // Replace with the correct activity
            startActivity(intent);
        });
    }

    // You can add other methods to handle user interactions, data fetching, etc.
}

