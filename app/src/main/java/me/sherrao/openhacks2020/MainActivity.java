package me.sherrao.openhacks2020;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setBackgroundColor(Color.rgb(0, 188, 169));

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        /**
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_add, R.id.navigation_misc, R.id.navigation_rooms, R.id.navigation_settings, R.id.navigation_tech )
                .build();
        appBarConfiguration.
           */
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);

    }

    @Override
    protected void onPostCreate(Bundle savedBundleInstance) {
        super.onPostCreate(savedBundleInstance);
        //super.getSupportActionBar().addOnMenuVisibilityListener(  );
        //super.getActionBar().addOnMenuVisibilityListener( (event) -> {} );

    }


    @Override
    public void onBackPressed() {
        return;

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);

    }

}
