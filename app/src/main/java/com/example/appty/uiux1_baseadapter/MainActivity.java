package com.example.appty.uiux1_baseadapter;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] titles;
    String[] Desc;
    TypedArray images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titles = getResources().getStringArray(R.array.Languages);
        Desc = getResources().getStringArray(R.array.LanguagesDesc);
        images = getResources().obtainTypedArray(R.array.images);

        ListView lv = findViewById(R.id.listview);
        OurAdapter adapter = new OurAdapter(this, images, titles, Desc);
        lv.setAdapter(adapter);
    }
}
