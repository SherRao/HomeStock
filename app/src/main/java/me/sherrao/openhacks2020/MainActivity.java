package me.sherrao.openhacks2020;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import backend.Backend;
import backend.Item;
import backend.TechItem;

public class MainActivity extends AppCompatActivity {

    private Backend backend;

    private ViewGroup overlayParent;
    private ViewGroupOverlay overlay;
    private Drawable dim;

    public Item item;
    public TechItem titem;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        backend = new Backend(this);

        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        super.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_IMMERSIVE |
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setBackgroundColor(Color.rgb(0, 188, 169));

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        overlayParent = (ViewGroup) super.getWindow().getDecorView().getRootView();
        overlay = overlayParent.getOverlay();
        dim = new ColorDrawable(Color.BLACK);
        dim.setBounds(0, 0, overlayParent.getWidth(), overlayParent.getHeight());
        dim.setAlpha((int) (255 * .5f));
        dim.setVisible(true, false);
        dim.setAlpha((int) (255 * .5f));

        return super.onCreateView(name, context, attrs);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void notSupportedPopup(View view) {
        LayoutInflater inflater = (LayoutInflater) super.getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.not_supported_popup, null);

        // create popup
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // show the popup window
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
        popupWindow.setElevation(20);
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;

            }
        });

    }

    public Backend getBackend() {
        return backend;

    }

}