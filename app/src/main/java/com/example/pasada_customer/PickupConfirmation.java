package com.example.pasada_customer;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PickupConfirmation extends Activity {

    public static MapFragment mapFragment;
    public static View myView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_main);

        mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        GoogleMap map = mapFragment.getMap();

        myView = (MyView)findViewById(R.id.myview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}