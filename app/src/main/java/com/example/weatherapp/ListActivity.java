package com.example.weatherapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> ciudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setUpListView();
    }
    void setUpListView() {
        listView = (ListView) findViewById(R.id.miListView);
        ciudades = new ArrayList<String>();
        ciudades.add("Godoy Cruz");
        ciudades.add("San Martin");
        ciudades.add("La Paz");
        ciudades.add("Maipu");
        ciudades.add("Las Heras");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getApplicationContext(), android.R.layout.simple_expandable_list_item_1,ciudades);
        listView.setAdapter(adapter);

    }

}