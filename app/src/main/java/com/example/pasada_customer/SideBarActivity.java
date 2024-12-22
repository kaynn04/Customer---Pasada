package com.example.pasada_customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class SideBarActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ImageButton burgerIcon;
    private TextView userProfile, savedPlaces, metric, history, settings, logout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // Your layout XML file

        // Initialize the drawer layout and navigation view
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        // Initialize the ImageButton and set an OnClickListener to open the navigation drawer
        burgerIcon = findViewById(R.id.burger_icon);
        burgerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the drawer when the burger icon is clicked
                drawerLayout.openDrawer(navigationView);
            }
        });

        // Initialize the menu items
        RelativeLayout userProfile = findViewById(R.id.user_profile);
        RelativeLayout savedPlaces = findViewById(R.id.saved_places);
        RelativeLayout metric = findViewById(R.id.metric);
        RelativeLayout history = findViewById(R.id.history);
        RelativeLayout settings = findViewById(R.id.settings);
        RelativeLayout logout = findViewById(R.id.logout);

        // Set OnClickListeners for the navigation items
        userProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SideBarActivity.this, UserProfileActivity.class);
                startActivity(intent);
            }
        });

        savedPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SideBarActivity.this, SavedPlacesActivity.class);
                startActivity(intent);
            }
        });

        // Set OnClickListeners for the navigation items
        metric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SideBarActivity.this, MetricActivity.class);
                startActivity(intent);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SideBarActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle saved places click
                // Navigate to saved places screen, for example
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout click
                // Perform logout actions here (e.g., clear session, navigate to login screen)
                finish(); // Close the current activity
            }
        });
        
        // Hatid-Sundo Button
        // Find the button by ID
        LinearLayout hatidSundoButton = findViewById(R.id.hatid_sundo_layout);

        // Set an OnClickListener for the button
        hatidSundoButton.setOnClickListener(v -> {
            // Navigate to the OnlineBookingsActivity
            Intent intent = new Intent(SideBarActivity.this, HatidSundoFirstPage.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // Padala Button
        // Find the button by ID
        LinearLayout padalaButton = findViewById(R.id.padala_layout);

        // Set an OnClickListener for the button
        padalaButton.setOnClickListener(v -> {
            // Navigate to the OnlineBookingsActivity
            Intent intent = new Intent(SideBarActivity.this, PadalaFirstPage.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }
}
