package com.example.pasada_customer;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.widget.ImageButton;

public class HatidSundoConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.hatid_sundo_confirmation);

        ImageButton backButton = findViewById(R.id.back_button);

        // OnclickListener for the backButton
        backButton.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(HatidSundoConfirmation.this, PadalaSecondPage.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        AppCompatButton confirmBooking = findViewById(R.id.next_button);

        // OnclickListener for the backButton
        confirmBooking.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(HatidSundoConfirmation.this, HatidSundoArriving.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

    }

    // You can add other methods to handle user interactions, data fetching, etc.
}

