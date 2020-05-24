package backend;

import android.graphics.drawable.Drawable;

public class Item {

    public String name;
    public String description;
    public Drawable image;
    public String location;
    public int quantity;

    public Item(String name, String description, Drawable image, String location, int quantity) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.location = location;
        this.quantity = quantity;

    }

}
