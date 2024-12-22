package com.example.pasada_customer;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HatidSundoSecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.hatid_sundo_secondpage);

        ImageButton backButton = findViewById(R.id.back_button);

        // OnclickListener for the backButton
        backButton.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(HatidSundoSecondPage.this, HatidSundoFirstPage.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        TextView pickUpLocation = findViewById(R.id.pickup_location);


        // OnclickListener for the backButton
        pickUpLocation.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(HatidSundoSecondPage.this, HatidSundoPickupInput.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        TextView dropOffLocation = findViewById(R.id.dropoff_location);

        // OnclickListener for the backButton
        dropOffLocation.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(HatidSundoSecondPage.this, HatidSundoDropoffInput.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        AppCompatButton nextButton = findViewById(R.id.next_button);

        // OnclickListener for the backButton
        nextButton.setOnClickListener(v -> {
            // Navigate to the welcome page
            Intent intent = new Intent(HatidSundoSecondPage.this, HatidSundoConfirmation.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // Bottom sheet logic for "How many Passenger"
        View howManyPassenger = findViewById(R.id.how_many_passenger);
        howManyPassenger.setOnClickListener(v -> showBottomSheet());

        // Bottom sheet logic for "Add notes to your driver"
        View notesForDriver = findViewById(R.id.notes_for_driver);
        notesForDriver.setOnClickListener(v -> showAddNotesBottomSheet());
    }

    private void showBottomSheet() {
//        Create a BottomSheetDialog
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);

//        Inflate the bottom sheet layout
        View bottomSheetView = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_passenger,
                null
        );

//        Setting the bottom sheet content
        bottomSheetDialog.setContentView(bottomSheetView);

//        Add button click Logic (example)
        Button onePassengerButton = bottomSheetView.findViewById(R.id.select_one_passenger);
        onePassengerButton.setOnClickListener(v -> {
            // Handle selection of 1 passenger
            bottomSheetDialog.dismiss();
        });

        Button twoPassengersButton = bottomSheetView.findViewById(R.id.select_two_passengers);
        twoPassengersButton.setOnClickListener(v -> {
            // Handle selection of 2 passengers
            bottomSheetDialog.dismiss();
        });

        // Show the BottomSheetDialog
        bottomSheetDialog.show();

    }

    private void showAddNotesBottomSheet() {
        // Create a BottomSheetDialog
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);

        // Inflate the bottom sheet layout
        View bottomSheetView = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_add_notes, null);

        // Setting the bottom sheet content
        bottomSheetDialog.setContentView(bottomSheetView);

        // Add Save button logic
        Button saveNotesButton = bottomSheetView.findViewById(R.id.btn_save_notes);
        saveNotesButton.setOnClickListener(v -> {
            // Logic to save the notes (e.g., pass to backend or update UI)
            bottomSheetDialog.dismiss();
        });

        // Show the BottomSheetDialog
        bottomSheetDialog.show();
    }

    // You can add other methods to handle user interactions, data fetching, etc.
}

