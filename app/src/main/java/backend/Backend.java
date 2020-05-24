package backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import me.sherrao.openhacks2020.MainActivity;

public class Backend {

    private final MainActivity app;

    public Backend(MainActivity app) {
        this.app = app;

    }

    public void submitAuthRequest() {
        //database stuff

    }

    public void submitItem(String name, String description, String location) {
        //database stuff

    }

    public void submitTech(String name, String description, String location, int powerConsumption, Date expirationDate) {
        //database stuff

    }

    public void setPowerUnit(String powerUnit) {
        //database stuff

    }

    public String getUserName() {
        //database stuff

        return "John Smith";

    }

    public List<Item> getMiscItems() {
        List<Item> items = new ArrayList<>();
        //database stuff

        return items;

    }

    public List<TechItem> getTechItem() {
        List<TechItem> items = new ArrayList<>();
        //database stuff

        return items;
    }

    public String getPowerUnit() {
        //database stuff
        return "KWh";

    }

}
