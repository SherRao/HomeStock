package backend;

import java.util.HashMap;
import java.util.Map;

import me.sherrao.openhacks2020.MainActivity;

public class Backend {

    private final MainActivity app;

    private Map<String, Item> miscItems;
    private Map<String, TechItem> techItems;

    public Backend(MainActivity app) {
        this.app = app;

        this.miscItems = new HashMap<>();
        this.techItems = new HashMap<>();
        populateMap();

    }

    private void populateMap() {
        miscItems.put("television", new Item("Television", "desc", "", "Living Room", 2));

    }

    public Item getItemFromButton(String buttonName) {
        return this.miscItems.get(buttonName);

    }

    public TechItem getTechItemFromButton(String buttonName) {
        return this.techItems.get(buttonName);

    }

    public int getMiscItemsCount() {
        return this.miscItems.size();

    }

    public int getTechItemCount() {
        return this.techItems.size();

    }

}