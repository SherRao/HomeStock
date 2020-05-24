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

public class TechFragment extends Fragment {

    private MainActivity app;
    private Backend backend;

    public TechFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.pages_fragment_tech, container, false);
        app = (MainActivity) super.getActivity();
        backend = app.getBackend();

        TextView text = root.findViewById(R.id.tech_amount);
        text.setText("Number of Items: " + backend.getElectricCount());

        ImageButton tvButton = root.findViewById(R.id.television);
        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.electricItems.get("tv");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton lpButton = root.findViewById(R.id.television);
        lpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.electricItems.get("laptop");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton vacuum = root.findViewById(R.id.vacuum);
        vacuum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.electricItems.get("vacuum");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton microwaveButton = root.findViewById(R.id.microwave);
        microwaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.electricItems.get("microwave");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton bulbsButton = root.findViewById(R.id.lightbulbs);
        bulbsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.electricItems.get("bulbs");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        ImageButton acButton = root.findViewById(R.id.acunt);
        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.titem = backend.electricItems.get("ac");
                Navigation.findNavController(v).navigate(R.id.navigation_itemview, null, null);

            }
        });

        return root;
    }
}
