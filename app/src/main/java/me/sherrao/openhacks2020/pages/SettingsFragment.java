package me.sherrao.openhacks2020.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        return root;
    }
}
