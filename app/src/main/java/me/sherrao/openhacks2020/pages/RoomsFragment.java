package me.sherrao.openhacks2020.pages;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import backend.Backend;
import me.sherrao.openhacks2020.MainActivity;
import me.sherrao.openhacks2020.R;

public class RoomsFragment extends Fragment {

    private MainActivity app;
    private Backend backend;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.pages_fragment_rooms, container, false);
        app = (MainActivity) super.getActivity();
        backend = app.getBackend();

        ImageButton kitchenButton = root.findViewById(R.id.kitchen_button);
        kitchenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.navigation_kitchen, null, null);

            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                app.notSupportedPopup(v);

            }
        };

        ImageButton livingroomButton = root.findViewById(R.id.livingroom_button);
        livingroomButton.setOnClickListener(listener);

        ImageButton washroomButton = root.findViewById(R.id.washroom_button);
        washroomButton.setOnClickListener(listener);

        ImageButton garageButton = root.findViewById(R.id.garage_button);
        garageButton.setOnClickListener(listener);
        return root;

    }
}
