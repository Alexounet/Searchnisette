package com.alexb.tools;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

import java.util.ArrayList;

/**
 * Created by grammont on 28/06/2017.
 */
public class ValueEventListener implements com.google.firebase.database.ValueEventListener{
    private static final String TAG = com.google.firebase.database.ValueEventListener.class.getSimpleName();
    private ArrayList<Response> sanisettes = new ArrayList<>();

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        // This method is called once with the initial value and again
        // whenever data at this location is updated.
       Response r = dataSnapshot.getValue(Response.class);
       Geometry g = r.getGeometry();



        for(DataSnapshot ds : dataSnapshot.getChildren()){
            Response  msg = ds.getValue(Response.class);
            System.out.println(msg);
            sanisettes.add(msg);
            Log.d(TAG, "Value is: " + dataSnapshot.getValue());
        }

    }

    @Override
    public void onCancelled(DatabaseError error) {
        // Failed to read value
        Log.w(TAG, "Failed to read value.", error.toException());
    }
}
