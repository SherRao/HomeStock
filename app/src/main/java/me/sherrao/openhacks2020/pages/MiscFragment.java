package me.sherrao.openhacks2020.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import backend.Backend;
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
        backend = app.getBackend();

        TextView text = root.findViewById(R.id.kitchen_amount);
        text.setText("Number of Items: " + backend.getMiscCount());

        ImageButton toiletpaperButton = root.findViewById(R.id.toiletpaper);
        toiletpaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.miscItems.get("toiletpaper");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton lawnmowerButton = root.findViewById(R.id.lawnmower);
        lawnmowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.miscItems.get("mower");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton guitarButton = root.findViewById(R.id.guitar);
        guitarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.miscItems.get("guitar");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton giftwrapButton = root.findViewById(R.id.giftwrap);
        giftwrapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.miscItems.get("giftwrap");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton bicycleButton = root.findViewById(R.id.bicycle);
        bicycleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.miscItems.get("cycle");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton toolkitButton = root.findViewById(R.id.toolkit);
        toolkitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.miscItems.get("utensils");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        return root;
    }
}
