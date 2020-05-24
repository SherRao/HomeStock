package me.sherrao.openhacks2020;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import backend.Backend;


public class ItemDisplayFragment extends Fragment {

    private MainActivity app;
    private Backend backend;

    public ItemDisplayFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_item_display, container, false);
        app = (MainActivity) super.getActivity();
        backend = app.getBackend();

        ((TextView) root.findViewById(R.id.button)).setText(app.s);

        return root;
    }
}
