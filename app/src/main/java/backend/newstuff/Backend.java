package backend;

import android.widget.ImageButton;

import java.util.HashMap;
import java.util.Map;

import me.sherrao.openhacks2020.MainActivity;

public class Backend {

    private final MainActivity app;

    private Map<ImageButton, Item> miscItems;
    private Map<ImageButton, TechItem> techItems;

    public Backend(MainActivity app) {
        this.app = app;

        this.miscItems = new HashMap<>();
        this.techItems = new HashMap<>();
        populateMap();

    }

    private void populateMap() {


    }

    public Item getItemFromButton(ImageButton button) {
        return this.miscItems.get(button);

    }

    public TechItem getTechItemFromButton(ImageButton button) {
        return this.techItems.get(button);

    }

    public int getMiscItemsCount() {
        return this.miscItems.size();

    }

    public int getTechItemCount() {
        return this.techItems.size();

    }

}