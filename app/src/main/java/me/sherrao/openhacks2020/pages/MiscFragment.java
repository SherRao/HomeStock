package me.sherrao.openhacks2020.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import backend.Backend;
import me.sherrao.openhacks2020.ItemDisplayFragment;
import me.sherrao.openhacks2020.MainActivity;
import me.sherrao.openhacks2020.R;

public class MiscFragment extends Fragment {

    private MainActivity app;
    private Backend backend;

    public MiscFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.pages_fragment_misc, container, false);
        app = (MainActivity) super.getActivity();

        ImageButton toiletpaperButton = super.getView().findViewById(R.id.toiletpaper);
        toiletpaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemDisplayFragment nextFrag = new ItemDisplayFragment();
                nextFrag.item(backend.getItemFromButton("toiletpaper"));

                app.getSupportFragmentManager().beginTransaction()
                        .replace(MiscFragment.super.getView().getId(), nextFrag)
                        .addToBackStack(null)
                        .commit();

            }
        });

        ImageButton lawnmowerButton = super.getView().findViewById(R.id.lawnmower);
        lawnmowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemDisplayFragment nextFrag = new ItemDisplayFragment();
                nextFrag.item(backend.getItemFromButton("lawnmower"));

                app.getSupportFragmentManager().beginTransaction()
                        .replace(MiscFragment.super.getView().getId(), nextFrag)
                        .addToBackStack(null)
                        .commit();

            }
        });

        ImageButton guitarButton = super.getView().findViewById(R.id.guitar);
        guitarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemDisplayFragment nextFrag = new ItemDisplayFragment();
                nextFrag.item(backend.getItemFromButton("guitar"));

                app.getSupportFragmentManager().beginTransaction()
                        .replace(MiscFragment.super.getView().getId(), nextFrag)
                        .addToBackStack(null)
                        .commit();

            }
        });

        ImageButton giftwrapButton = super.getView().findViewById(R.id.giftwrap);
        giftwrapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemDisplayFragment nextFrag = new ItemDisplayFragment();
                nextFrag.item(backend.getItemFromButton("giftwrap"));

                app.getSupportFragmentManager().beginTransaction()
                        .replace(MiscFragment.super.getView().getId(), nextFrag)
                        .addToBackStack(null)
                        .commit();

            }
        });

        ImageButton bicycleButton = super.getView().findViewById(R.id.bicycle);
        bicycleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemDisplayFragment nextFrag = new ItemDisplayFragment();
                nextFrag.item(backend.getItemFromButton("bicycle"));

                app.getSupportFragmentManager().beginTransaction()
                        .replace(MiscFragment.super.getView().getId(), nextFrag)
                        .addToBackStack(null)
                        .commit();

            }
        });

        ImageButton toolkitButton = super.getView().findViewById(R.id.toolkit);
        toolkitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemDisplayFragment nextFrag = new ItemDisplayFragment();
                nextFrag.item(backend.getItemFromButton("toolkit"));

                app.getSupportFragmentManager().beginTransaction()
                        .replace(MiscFragment.super.getView().getId(), nextFrag)
                        .addToBackStack(null)
                        .commit();

            }
        });

        return root;
    }
}
