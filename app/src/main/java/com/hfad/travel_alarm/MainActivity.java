package com.hfad.travel_alarm;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.gms.maps.SupportMapFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout main_layout = (DrawerLayout) findViewById(R.id.main_layout);
        ActionBarDrawerToggle open_panel_B = new ActionBarDrawerToggle(this,main_layout,toolbar,R.string.open_menu,R.string.set_alarm);

        main_layout.addDrawerListener(open_panel_B);
        open_panel_B.syncState();

        /*FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        ft.add(R.id.contentFrame,mapFragment);
        ft.commit();*/
    }
}
