package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerviewAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] pokemonList = {"feunard", "papilusion", "pikachu", "kadabra", "aquali", "ptera"};
    private int[] pokemonImages = {R.drawable.feunard, R.drawable.papilusion, R.drawable.pikachu, R.drawable.kadabra, R.drawable.aquali, R.drawable.ptera};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerList);
        //recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerviewAdapter = new recyclerviewAdapter(this, pokemonList, pokemonImages);
        recyclerView.setAdapter(recyclerviewAdapter);
    }
}