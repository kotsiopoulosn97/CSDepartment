package com.example.csdepartment;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.Arrays;
import java.util.List;
public class StudiesActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<Direction> listAdapter =
                new ArrayAdapter<>(
                        this, android.R.layout.simple_list_item_1, Direction.directions);
        ListView listView = getListView();
        listView.setAdapter(listAdapter);
    }
}