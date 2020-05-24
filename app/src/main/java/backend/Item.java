package backend;

import android.media.Image;

import androidx.annotation.NonNull;

import java.util.HashMap;

public class Item {

    public String name;
    public String description;
    public Image images;
    public String imageLocation;
    public String location;

    /**
    public Item(@NonNull String name, String description,  String imageLocation, String location) {
        this.name = name;
        this.description = description;
        this.imageLocation = imageLocation;
        this.location = location;
    }
    */

    public Item() {

    }

    public String setName(String name) {
        return this.name = name;
    }

    public String setDesc(String description) {
        return this.description = description;
    }
    public String setImgLoc(String imageLocation) {
        return this.imageLocation = imageLocation;
    }

    public String setLoc(String location) {
        return this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }
    public String getImgLoc() {
        return imageLocation;
    }

    public String getLoc() {
        return location;
    }

    public HashMap<String,String> toFireBaseObject() {
        HashMap<String,String> item = new HashMap<String, String>();
        item.put("name", name);
        item.put("description", description);
        item.put("imageLocation", imageLocation);
        item.put("location", location);

        return item;
    }



}
