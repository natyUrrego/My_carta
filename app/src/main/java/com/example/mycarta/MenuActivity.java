package com.example.mycarta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void conocerEntrada(View v) {
        Intent intencion = new Intent(this, EntradasActivity.class);
        startActivities(intencion);

    }

    private void startActivities(Intent intencion) {
    }

    public void ConocerPlatos(View v) {

        Intent intencion = new Intent(this, PlatosActivity.class);
        startActivities(intencion);
    }

    public void ConocerBebidas(View v) {

        Intent intencion = new Intent(this, BebidasActivity.class);
        startActivities(intencion);
    }

    public void conocerSede(View v) {
        Intent intencion = new Intent(this, SedesActivity.class);
        startActivities(intencion);
    }

    public void contactarSede(View v) {
        String whatsApp = "com.whatsapp";
        PackageManager pm = getPackageManager();
        Intent intencion = pm.getLaunchIntentForPackage(whatsApp);
        //Mensaje y numero especifico
        startActivities(intencion);
        /*String contact = "+573214576340";
        String url ="https://api.whatsapp.com/send?phone=" + contact;
        try{
            PackageManager pm= this.getPackageManager();
            pm.getPackageInfo("com.whatsapp",PackageManager.GET_ACTIVITIES);
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));

        }*/

    }


    }

