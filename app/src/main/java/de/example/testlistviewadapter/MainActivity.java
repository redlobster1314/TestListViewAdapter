package de.example.testlistviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView datenListView = findViewById(R.id.myListView);
        ListViewAdapter listViewAdapter = new ListViewAdapter(initialisieren(), this);
        datenListView.setAdapter(listViewAdapter);
    }

    private List<Daten> initialisieren(){
        ArrayList<Daten> datenListe = new ArrayList<Daten>();
        datenListe.add(new Daten("Plorp", "Popplers!"));
        datenListe.add(new Daten("Honig", "Aus Blumen"));
        datenListe.add(new Daten("Anderer Honig", "Aus dem Wald"));

        return datenListe;
    }



}