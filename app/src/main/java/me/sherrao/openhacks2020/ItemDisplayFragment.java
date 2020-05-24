package me.sherrao.openhacks2020;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import backend.Item;
import backend.TechItem;


public class ItemDisplayFragment extends Fragment {

    public ItemDisplayFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void item(Item item) {
    }

    public void item(TechItem item) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_item_display, container, false);

        return root;
    }
}
