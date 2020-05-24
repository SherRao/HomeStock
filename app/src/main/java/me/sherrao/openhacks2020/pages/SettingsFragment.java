package me.sherrao.openhacks2020.pages;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import backend.Backend;
import me.sherrao.openhacks2020.MainActivity;
import me.sherrao.openhacks2020.R;

public class SettingsFragment extends Fragment {

    private MainActivity app;
    private Backend backend;

    public SettingsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.pages_fragment_settings, container, false);
        app = (MainActivity) super.getActivity();

        View.OnClickListener listener = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                app.notSupportedPopup(v);

            }
        };

        ImageButton accountInfoButton = root.findViewById(R.id.account_info);
        accountInfoButton.setOnClickListener(listener);

        ImageButton personalisationButton = root.findViewById(R.id.personalisation);
        personalisationButton.setOnClickListener(listener);

        ImageButton measurementButton = root.findViewById(R.id.measurements);
        measurementButton.setOnClickListener(listener);

        ImageButton langsButton = root.findViewById(R.id.langs);
        langsButton.setOnClickListener(listener);

        ImageButton helpButton = root.findViewById(R.id.help);
        helpButton.setOnClickListener(listener);

        return root;
    }
}
