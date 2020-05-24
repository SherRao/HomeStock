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
        techItems.put("television", new TechItem("Television", "desc", "", "living-room", 2, -1, 2));
        techItems.put("microwave", new TechItem("Microwave", "desc", "", "kitchen", 1, -1, 2));
        //techItems.put("refrigerator", new TechItem("Refrigerator", "desc", "", "kitchen", 1, -1, 2));
        //techItems.put("lawnmotor", new TechItem("Lawnmower", "desc", "", "garage", 1, -1, 1));
        techItems.put("vacuum", new TechItem("Vacuum", "desc", "", "living-room", 1, -1, 1));
        techItems.put("lightbulb", new TechItem("Light Bulb", "desc", "", "living-room", 1, -1, 1));
        techItems.put("ac", new TechItem("Air Conditioning", "desc", "", "living-room", 1, -1, 1));
        techItems.put("laptop", new TechItem("Laptop", "desc", "", "living-room", 1, -1, 1));

        //miscItems.put("cooking-util", new Item("Cooking Utensils", "desc", "", "Kitchen", 1));
        miscItems.put("kettle", new Item("Kettle", "desc", "", "Kitchen", 1));
        //miscItems.put("cutlery", new Item("Cutlery", "desc", "", "Kitchen", 1));
        miscItems.put("frying-pan", new Item("Frying Pan", "desc", "", "Kitchen", 1));
        miscItems.put("bicycle", new Item("Bicycle", "desc", "", "garage", 1));
        miscItems.put("gift-wrap", new Item("Gift Wrap", "desc", "", "garage", 1));
        miscItems.put("guitar", new Item("Guitar", "desc", "", "garage", 1));
        miscItems.put("toolkit", new Item("Tool Kit", "desc", "", "garage", 1));

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