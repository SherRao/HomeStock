package backend;

import android.graphics.drawable.Drawable;

public class TechItem {

    public String name;
    public String description;
    public Drawable image;
    public String location;
    public int quantity;
    public long expiration;
    public int power;

    public TechItem(String name, String description, Drawable image, String location, int quantity, long expiration, int power) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.location = location;
        this.quantity = quantity;
        this.expiration = expiration;
        this.power = power;

    }

}