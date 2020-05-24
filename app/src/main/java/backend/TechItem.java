package backend;

import java.util.Date;

public class TechItem {

    public String name;
    public String description;
    public String imageLocation;
    public String location;
    public int quantity;
    public long expiration;
    public int power;

    public TechItem(String name, String description, String imageLocation, String location, int quantity, long expiration, int power) {
        this.name = name;
        this.description = description;
        this.imageLocation = imageLocation;
        this.location = location;
        this.quantity = quantity;
        this.expiration = expiration;
        this.power = power;

    }

}