package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowSavedLocationList extends AppCompatActivity {

    ListView lv_savedlocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_saved_location_list);
        lv_savedLocations = findViewById(R.id.lv_wayPoints);

        MyApplication myApplication= (MyApplication)getApplicationContext();
        List<Location> savedLocation = myApplication.getMyLocation();

        lv_savedLocations.setAdapter(new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1,savedLocation));

    }
}