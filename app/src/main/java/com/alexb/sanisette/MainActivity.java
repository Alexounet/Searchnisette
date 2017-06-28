package com.alexb.sanisette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMap(View view){
        DatabaseReference mDatabase =  FirebaseDatabase.getInstance().getReference();
        mDatabase.addValueEventListener(new com.alexb.tools.ValueEventListener());
    }
}
