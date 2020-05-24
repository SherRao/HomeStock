package backend;

import android.media.Image;

import androidx.annotation.NonNull;

import java.util.Date;

public class TechItem {

    public String name;
    public String description;
    public Image image;
    public String location;
    public int powerUsage;
    public Date expiration;

    public TechItem(@NonNull  String name, String description, Image image, String location, int powerUsage, Date expiration) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.location = location;
        this.powerUsage = powerUsage;
        this.expiration = expiration;

    }

}
