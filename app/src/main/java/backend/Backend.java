package backend;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.sherrao.openhacks2020.MainActivity;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class Backend {

    private final MainActivity app;

    public Backend(MainActivity app) {
        this.app = app;
        submitItem("Phone", "iPhone8", "cool place");
    }

    public void submitAuthRequest() {
        //database stuff
    }

    /**
     * Takes values that are inputted by user and adds to Firebase Database
     * Uses Item.java file to create object
     * @param name - name of the item
     * @param description - description of item
     * @param location - where item would be placed in the house
     */
    public void submitItem(String name, String description, String location ) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        Map<String, Object> item = new HashMap<>();
        item.put("name", name);
        item.put("description",description);
        item.put("location",location);

        db.collection("nonTech")
                .add(item)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
    }

    public void submitTech(String name, String description, String location, int powerConsumption, Date expirationDate ) {
        //database stuff
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        Map<String, Object> item = new HashMap<>();
        item.put("name", name);
        item.put("description",description);
        item.put("location",location);
        item.put("powerConsumption", powerConsumption);
        item.put("expDate", expirationDate);

        db.collection("Tech").document(location)
                .set(item)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
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
        return items;
    }


    public String getPowerUnit() {
        //database stuff
        return "KWh";

    }
}
