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
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        Map<String, Object> user = new HashMap<>();

        /**
        user.put("first", "Tarandeep");
        user.put("last", "Mittal");
        user.put("born", 1998);

        db.collection("inventory")
                .add(user)
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
         */
    }

    public void submitAuthRequest() {
        //database stuff

    }

    public void submitItem(String name, String description, String location ) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        String key = database.getReference("tech").push.getKey();

        Item item = new Item();
        item.setName(name);
        item.setDesc(description);
        item.setLoc(location);

        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put(key, todo.toFirebaseObject());
        database.getReference("Item").updateChildren(childUpdates, new DatabaseReference.CompletionListener()) {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                if (databaseError == null) {
                    finish();
                }
            }
        }

    }

    public void submitTech(String name, String description, String location, int powerConsumption, Date expirationDate ) {
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
        //List<TechItem> items = new ArrayList<>();
        //return items;
    }


    public String getPowerUnit() {
        //database stuff
        return "KWh";

    }
}
