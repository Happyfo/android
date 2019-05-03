package com.example.aclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv=(ListView)findViewById(R.id.listview);
        ArrayList<String> kiki = new ArrayList<String>();
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        kiki.add("computer");
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,kiki);
        lv.setAdapter(adapter);


    }
}
