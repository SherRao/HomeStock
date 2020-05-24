package backend;

public class Item {

    public String name;
    public String description;
    public String imageLocation;
    public String location;
    public int quantity;

    public Item(String name, String description, String imageLocation, String location, int quantity) {
        this.name = name;
        this.description = description;
        this.imageLocation = imageLocation;
        this.location = location;
        this.quantity = quantity;

    }

}
