package me.sherrao.openhacks2020;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;

import backend.Backend;

public class SettingsFragment extends Fragment {

    private MainActivity app;
    private Backend backend;

    public SettingsFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        app = (MainActivity) super.getActivity();
        backend = app.getBackend();

        TextView accountName = (TextView) view.findViewById(R.id.account_name);
        accountName.setText(backend.getUserName() );

        return view;
    }
}
