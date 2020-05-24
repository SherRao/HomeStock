package backend;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

import me.sherrao.openhacks2020.MainActivity;
import me.sherrao.openhacks2020.R;

public class Backend {

    private final MainActivity app;

    public Map<String, Item> kitchenItems;
    public Map<String, TechItem> kitchenTItems;
    public Map<String, Item> miscItems;
    public Map<String, TechItem> electricItems;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Backend(MainActivity app) {
        this.app = app;

        this.kitchenItems = new HashMap<>();
        this.kitchenTItems = new HashMap<>();
        this.miscItems = new HashMap<>();
        this.electricItems = new HashMap<>();

        populateMap();

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void populateMap() {
        kitchenItems.put("utensils", new Item("Cooking Utensils", "All my cooking stuff", app.getApplicationContext().getDrawable(R.drawable.utensils), "Kitchen", 8));
        kitchenTItems.put("microwave", new TechItem("Microwave", null, app.getApplicationContext().getDrawable(R.drawable.microwave), "Kitchen", 1, 1748091818, 576));
        kitchenTItems.put("kettle", new TechItem("Kettle", null, app.getApplicationContext().getDrawable(R.drawable.kettle), "Kitchen", 2, 1748091818, 100));
        kitchenItems.put("frypan", new Item("Frying Pan", "The small frypan", app.getApplicationContext().getDrawable(R.drawable.frypan), "Kitchen", 1));
        kitchenTItems.put("fridge", new TechItem("Refrigerator", null, app.getApplicationContext().getDrawable(R.drawable.fridge), "Kitchen", 1, 1748091818, 321));
        kitchenItems.put("toolkit", new Item("Tool Kit", "Tool box with stuff in it, above the fridge", app.getApplicationContext().getDrawable(R.drawable.toolkit), "Kitchen", 1));

        electricItems.put("tv", new TechItem("Television", null, app.getApplicationContext().getDrawable(R.drawable.television), "Living Room", 2, 1748091818, 120));
        electricItems.put("laptop", new TechItem("Laptop", null, app.getApplicationContext().getDrawable(R.drawable.laptop), "Living Room", 3, 1748091818, 321));
        electricItems.put("vacuum", new TechItem("Vacuum", "In the garage behind the cabinet", app.getApplicationContext().getDrawable(R.drawable.vacuum), "Garage", 1, 1748091818, 20));
        electricItems.put("bulbs", new TechItem("Lightbulbs", "The smart ones ", app.getApplicationContext().getDrawable(R.drawable.lightbulbs), "All", 32, 1748091818, 80));
        electricItems.put("ac", new TechItem("Air Conditioning", null, app.getApplicationContext().getDrawable(R.drawable.acunit), "Living Room", 1, 1748091818, 100));
        electricItems.put("fridge", kitchenTItems.get("fridge"));
        electricItems.put("microwave", kitchenTItems.get("microwave"));
        electricItems.put("kettle", kitchenTItems.get("kettle"));

        miscItems.put("toiletpaper", new Item("Toilet Paper", "Gotta restock a lot", app.getApplicationContext().getDrawable(R.drawable.toiletpaper), "Washroom", 8));
        miscItems.put("mower", new Item("Lawn Mower", "only enough gas for one use", app.getApplicationContext().getDrawable(R.drawable.lawnmower), "Garage", 1));
        miscItems.put("guitar", new Item("Guitar", "the E string sounds terrible", app.getApplicationContext().getDrawable(R.drawable.guitar), "Living Room", 1));
        miscItems.put("giftwrap", new Item("Gift Wrapping", "need to wrap the husbands gift soon", app.getApplicationContext().getDrawable(R.drawable.giftwrap), "Kitchen", 1));
        miscItems.put("cycle", new Item("Bicycle", null, app.getApplicationContext().getDrawable(R.drawable.bicycle), "Garage", 3));
        miscItems.put("utensils", kitchenItems.get("utensils"));
        miscItems.put("frypan", kitchenItems.get("frypan"));
        miscItems.put("toolkit", kitchenItems.get("toolkit"));

    }

    public int getKitchenCount() {
        int total = 0;
        for (Item item : kitchenItems.values())
            total += item.quantity;

        for (TechItem item : kitchenTItems.values())
            total += item.quantity;

        return total;

    }

    public int getMiscCount() {
        int total = 0;
        for (Item item : miscItems.values())
            total += item.quantity;

        return total;

    }

    public int getElectricCount() {
        int total = 0;
        for (TechItem item : electricItems.values())
            total += item.quantity;

        return total;

    }

}