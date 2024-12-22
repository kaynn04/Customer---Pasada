package com.example.pasada_customer;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.login);

        TextView backButton = findViewById(R.id.backButton);

        // OnclickListener for the backButton
        backButton.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        TextView registerTextView = findViewById(R.id.registerTextView);
        String text = "Not yet registered? Register here";
        SpannableString spannableString = new SpannableString(text);

        // Clickable "Register here"
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                // Click event (e.g., navigate to registration page)
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        };


        // Apply a different color to "Register here"
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#8C1C13")); // Use any color here
        spannableString.setSpan(clickableSpan, 20, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        registerTextView.setText(spannableString);
        registerTextView.setMovementMethod(LinkMovementMethod.getInstance());

        // Confirm Button Logic
        AppCompatButton confirmButton = findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, SideBarActivity.class); // Replace with the correct activity
            startActivity(intent);
        });
    }

    // You can add other methods to handle user interactions, data fetching, etc.
}


