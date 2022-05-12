package com.geektech.lesson3_java3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        ArrayList<String> name = new ArrayList<>();
        name.add("Kyial");
        name.add("Kutman");
        name.add("Chyngys");
        name.add("Kyial");
        name.add("Kyial");
        name.add("Kyial");
        name.add("Kyial");
        name.add("Kyial");
        name.add("Kyial");
        name.add("Kyial");
        name.add("Kyial");
        name.add("Nursultan");

        Adapter adapter=new Adapter(name);
        recyclerView.setAdapter(adapter);
    }
}