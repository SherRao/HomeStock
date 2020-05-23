package me.sherrao.openhacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ((Button) findViewById(R.id.splash_button)).setOnClickListener( (View view) -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        });

    }
}
