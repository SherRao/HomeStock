package me.sherrao.openhacks2020.rooms;

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

public class KitchenRoomFragment extends Fragment {

    private MainActivity app;
    private Backend backend;

    public KitchenRoomFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.rooms_fragment_kitchen_room, container, false);
        app = (MainActivity) super.getActivity();
        backend = app.getBackend();

        TextView text = root.findViewById(R.id.kitchen_amount);
        text.setText("Number of Items: " + backend.getKitchenCount());

        ImageButton utensilsButton = root.findViewById(R.id.utensils);
        utensilsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.kitchenItems.get("utensils");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton mwButton = root.findViewById(R.id.microwave_1);
        mwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.kitchenTItems.get("microwave");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton kettleButton = root.findViewById(R.id.kettle);
        kettleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.kitchenTItems.get("kettle");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton fpButton = root.findViewById(R.id.frypan);
        fpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.kitchenItems.get("frypan");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton fridgeButton = root.findViewById(R.id.fridge);
        fridgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.kitchenTItems.get("fridge");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton tkButton = root.findViewById(R.id.cutlery);
        tkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.item = backend.kitchenItems.get("toolkit");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        return root;

    }
}
