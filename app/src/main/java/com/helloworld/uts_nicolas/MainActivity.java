package com.helloworld.uts_nicolas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.real_madrid,R.drawable.barcelona,R.drawable.atletico,R.drawable.valencia,R.drawable.villareal,
        R.drawable.real_betis,R.drawable.levante,R.drawable.real_sociedad,R.drawable.athletic_club};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.LaLiga_Club);
        s2 = getResources().getStringArray(R.array.Deskripsi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}