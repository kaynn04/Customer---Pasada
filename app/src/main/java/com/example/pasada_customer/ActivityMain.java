package com.example.pasada_customer;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {

    private ProgressBar progressBar;
    private Handler handler = new Handler();
    private int progressStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_main); // Make sure this points to your XML layout file

        progressBar = findViewById(R.id.progressBar);  // Initialize the ProgressBar

        // Simulate loading (filling up the progress bar)
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 1;  // Increase the progress

                    // Update the ProgressBar's progress on the main thread
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progressStatus);  // Set the progress
                        }
                    });

                    try {
                        Thread.sleep(50);  // Delay to simulate loading (adjust speed here)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
