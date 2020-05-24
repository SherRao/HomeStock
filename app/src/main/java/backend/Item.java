package backend;

import android.media.Image;

import androidx.annotation.NonNull;

public class Item {

    public String name;
    public String description;
    public Image image;
    public String location;

    public Item(@NonNull String name, String description, Image image, String location) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.location = location;

    }

}
