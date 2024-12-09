package com.example.pasada_customer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hbb20.CountryCodePicker;

public class RegisterActivity extends AppCompatActivity {

    private CountryCodePicker countryCodePicker;
    private EditText phoneNumberEditText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        countryCodePicker = findViewById(R.id.country_code);
        phoneNumberEditText = findViewById(R.id.phone_number);
        Button confirmButton = findViewById(R.id.loginButton);

        // Set default country code
        countryCodePicker.setDefaultCountryUsingNameCode("PH");
        countryCodePicker.setAutoDetectedCountry(true);

        // Confirm button click listener
        confirmButton.setOnClickListener(view -> {
            String countryCode = countryCodePicker.getSelectedCountryCodeWithPlus();
            String phoneNumber = phoneNumberEditText.getText().toString();

            if (TextUtils.isEmpty(phoneNumber)) {
                Toast.makeText(RegisterActivity.this, "Please enter your phone number", Toast.LENGTH_SHORT).show();
                return;
            }

            // Combine country code with phone number
            String fullPhoneNumber = countryCode + phoneNumber;
            Toast.makeText(RegisterActivity.this, "Phone Number: " + fullPhoneNumber, Toast.LENGTH_LONG).show();

            // Add additional functionality for phone verification here if needed
        });
    }
}
