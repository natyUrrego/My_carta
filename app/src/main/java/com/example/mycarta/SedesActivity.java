package com.example.mycarta;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mycarta.databinding.ActivitySedesBinding;

public class SedesActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivitySedesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySedesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng colombia = new LatLng(6.246007, -75.5692);

        // Add a marker in Sydney and move the camera
        LatLng medellin = new LatLng(6.3, -75.569245);
        LatLng envigado = new LatLng(5.3, -75.569263);
        LatLng sabaneta = new LatLng(4.3, -75.569274);
        LatLng bello = new LatLng(3.3, -75.5692739);
        mMap.addMarker(new MarkerOptions().position(medellin).title("sede principal"));
        mMap.addMarker(new MarkerOptions().position(envigado).title("sede Envigado"));
        mMap.addMarker(new MarkerOptions().position(sabaneta).title("sede Sabaneta"));
        mMap.addMarker(new MarkerOptions().position(bello).title("sede Bello"));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(colombia));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.moveCamera(CameraUpdateFactory.zoomTo(12));

    }

}