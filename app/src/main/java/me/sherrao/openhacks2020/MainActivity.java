package me.sherrao.openhacks2020;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import backend.Backend;

public class MainActivity extends AppCompatActivity {

    private Backend backend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        super.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setBackgroundColor(Color.rgb(0, 188, 169));

        /**
         // Passing each menu ID as a set of Ids because each
         // menu should be considered as top level destinations.
         AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
         R.id.navigation_add, R.id.navigation_misc, R.id.navigation_rooms, R.id.navigation_settings, R.id.navigation_tech )
         .build();
         appBarConfiguration.
         */

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);
        backend = new Backend(this);

    }

    public Backend getBackend() {
        return backend;

    }

}