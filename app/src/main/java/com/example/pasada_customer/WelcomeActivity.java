package com.example.pasada_customer;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.login_and_register);

        // login button code
        AppCompatButton loginButton = findViewById(R.id.loginButton);

        // set onClickListener for the button
        loginButton.setOnClickListener(v -> {
            // Navigate to login activity
            Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
            startActivity(intent);

            // Smooth Transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // Register button code
        AppCompatButton registerButton = findViewById(R.id.registerButton);

        // set onClickListener for the button
        registerButton.setOnClickListener(v -> {
            // Navigate to login activity
            Intent intent = new Intent(WelcomeActivity.this, RegisterActivity.class);
            startActivity(intent);

            // Smooth Transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

    }

    // You can add other methods to handle user interactions, data fetching, etc.
}


