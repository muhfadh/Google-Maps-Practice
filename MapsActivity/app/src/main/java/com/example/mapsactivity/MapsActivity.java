package com.example.mapsactivity;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;



public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);

        LatLng sman9 = new LatLng(-6.346939, 106.780115);
        mMap.addMarker(new MarkerOptions().position(sman9).title("SMAN 9 Depok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sman9));

        LatLng sman6 = new LatLng(-6.370554, 106.773236);
        mMap.addMarker(new MarkerOptions().position(sman6).title("SMAN 6 Depok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sman6));

        LatLng sman10 = new LatLng(-6.392497, 106.731958);
        mMap.addMarker(new MarkerOptions().position(sman10).title("SMAN 10 Depok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sman10));

        LatLng smayadika = new LatLng(-6.371606, 106.770501);
        mMap.addMarker(new MarkerOptions().position(smayadika).title("SMA Yadika 12"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smayadika));

        mMap.addPolyline(new PolylineOptions().add(
                sman6,
                new LatLng(-6.370614, 106.773531),
                new LatLng(-6.371259, 106.773172),
                new LatLng(-6.371243, 106.772614),
                new LatLng(-6.370705, 106.771383),
                new LatLng(-6.371699, 106.770850),
                new LatLng(-6.371584, 106.770601),
                smayadika
            ).width(10).color(Color.BLUE)
        );




    }
}
