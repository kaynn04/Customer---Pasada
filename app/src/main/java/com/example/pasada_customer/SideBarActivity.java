package com.example.pasada_customer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class SideBarActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // Make sure this points to your XML layout
        setContentView((R.layout.user_profile));
        setContentView((R.layout.saved_places));
        setContentView((R.layout.metric));
        setContentView((R.layout.history));


        // Initialize the DrawerLayout and NavigationView
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        // Set up the burger menu button to open the drawer
        findViewById(R.id.burger_icon).setOnClickListener(v -> {
            drawerLayout.openDrawer(navigationView);  // Open the drawer when burger icon is clicked
        });

        // Handle clicks on sidebar menu items
        handleMenuItemClicks();
    }

    private void handleMenuItemClicks() {
        // Set up the menu item clicks
        TextView userProfile = findViewById(R.id.user_profile);
        TextView savedPlaces = findViewById(R.id.saved_places);
        TextView metric = findViewById(R.id.metric);
        TextView history = findViewById(R.id.history);
        TextView settings = findViewById(R.id.settings);
        TextView logout = findViewById(R.id.logout);

        // Example of what happens when you click each menu item:
        userProfile.setOnClickListener(v -> {
            // Navigate to Profile Activity or do something else
            Intent intent = new Intent(SideBarActivity.this, UserProfileActivity.class);
            drawerLayout.closeDrawer(navigationView);  // Close the drawer after selection
        });

        savedPlaces.setOnClickListener(v -> {
            // Navigate to Saved Places Activity
            Intent intent = new Intent(SideBarActivity.this, SavedPlacesActivity.class);
            drawerLayout.closeDrawer(navigationView);  // Close the drawer after selection
        });

        metric.setOnClickListener(v -> {
            // Navigate to Metric Activity
            Intent intent = new Intent(SideBarActivity.this, MetricActivity.class);
            drawerLayout.closeDrawer(navigationView);  // Close the drawer after selection
        });

        history.setOnClickListener(v -> {
            // Navigate to History Activity
            Intent intent = new Intent(SideBarActivity.this, HistoryActivity.class);
            drawerLayout.closeDrawer(navigationView);  // Close the drawer after selection
        });

        settings.setOnClickListener(v -> {
            // Navigate to Settings Activity
            // Example: startActivity(new Intent(SideBar.this, SettingsActivity.class));
            drawerLayout.closeDrawer(navigationView);  // Close the drawer after selection
        });

        logout.setOnClickListener(v -> {
            // Handle logout functionality
            // Example: logoutUser(); or perform any necessary logout logic
            drawerLayout.closeDrawer(navigationView);  // Close the drawer after selection
        });
    }
}
