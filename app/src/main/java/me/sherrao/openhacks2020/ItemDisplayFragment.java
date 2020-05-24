package me.sherrao.openhacks2020;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Date;

import backend.Backend;
import backend.Item;
import backend.TechItem;


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

        Item item = app.item;
        if (item != null) {
            ImageView itemPicture = root.findViewById(R.id.item_pic);
            itemPicture.setImageDrawable(item.image);

            TextView itemName = root.findViewById(R.id.item_title);
            itemName.setText(item.name);

            EditText itemDesc = root.findViewById(R.id.item_description);
            itemDesc.setText(item.description);

            EditText itemLoc = root.findViewById(R.id.item_location);
            itemLoc.setText(item.location);

            EditText itemQuantity = root.findViewById(R.id.item_quantity);
            itemQuantity.setText(item.quantity + "");

            EditText itemPower = root.findViewById(R.id.item_power);
            itemPower.setText("");

            EditText itemExp = root.findViewById(R.id.item_exp);
            itemExp.setText("");

            app.item = null;
            app.titem = null;
        } else {
            TechItem titem = app.titem;
            if (titem != null) {
                ImageView itemPicture = root.findViewById(R.id.item_pic);
                itemPicture.setImageDrawable(titem.image);

                TextView itemName = root.findViewById(R.id.item_title);
                itemName.setText(titem.name);

                EditText itemDesc = root.findViewById(R.id.item_description);
                itemDesc.setText(titem.description);

                EditText itemLoc = root.findViewById(R.id.item_location);
                itemLoc.setText(titem.location);

                EditText itemQuantity = root.findViewById(R.id.item_quantity);
                itemQuantity.setText(titem.quantity + "");

                EditText itemPower = root.findViewById(R.id.item_power);
                itemPower.setText(titem.power + "");

                long s = titem.expiration * 1000;
                Date d = new Date(s * 1000);

                EditText itemExp = root.findViewById(R.id.item_exp);
                itemExp.setText("ERR");//d.getDay() + "/" + d.getMonth() + "/" + d.getYear());

                app.item = null;
                app.titem = null;
            }
        }

        return root;
    }
}
