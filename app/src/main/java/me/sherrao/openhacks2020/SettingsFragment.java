package me.sherrao.openhacks2020;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

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
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        app = (MainActivity) super.getActivity();
        backend = app.getBackend();

        TextView accountName = root.findViewById(R.id.account_name);
        accountName.setText( backend.getUserName() );

        ImageButton accountInfo = root.findViewById(R.id.account_info);
        /**accountInfo.setOnTouchListener(new View.OnTouchListener() {

        @Override public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
        case MotionEvent.ACTION_DOWN: {
        ImageButton view = (ImageButton ) v;
        view.getBackground().setColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);
        v.invalidate();
        break;

        }

        case MotionEvent.ACTION_UP:

        case MotionEvent.ACTION_CANCEL: {
        ImageButton view = (ImageButton) v;
        view.getBackground().clearColorFilter();
        view.invalidate();
        break;
        }
        }
        return true;
        }
        });*/


        return root;
    }
}
