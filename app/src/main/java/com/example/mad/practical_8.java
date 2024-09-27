package com.example.mad;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class practical_8 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.practical8);
        Toolbar toolbar = findViewById(R.id.p8_toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.p8);
        NavigationView nav = findViewById(R.id.p8_nav_view);
        nav.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,  R.string.p8_open_nav, R.string.p8_close_nav);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.p8_fragment_container, new P8_HomeFragement()).commit();
            nav.setCheckedItem(R.id.p8_nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.p8_nav_home){
            getSupportFragmentManager().beginTransaction().replace(R.id.p8_fragment_container,new P8_HomeFragement()).commit();
        }else if(item.getItemId() == R.id.p8_nav_about){
            getSupportFragmentManager().beginTransaction().replace(R.id.p8_fragment_container,new P8_AboutFragement()).commit();
        }else if(item.getItemId() == R.id.p8_nav_settings){
            getSupportFragmentManager().beginTransaction().replace(R.id.p8_fragment_container,new P8_SettingsFragement()).commit();
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}