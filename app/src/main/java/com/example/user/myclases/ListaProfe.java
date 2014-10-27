package com.example.user.myclases;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ListaProfe extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_profe);

        // Simple array with a list of my favorite TV shows
        String[] favoriteTVShows = {"Javier Grand", "Pablo López",
                "Gustavo Rapaport", "Francisco Undurraga", "Ricardo Montégu", "Fernando Paraguez",
                "Ignacio Leyes", "Benjamín Merino", "Agustín Lobato"};

        // A View is the generic term and class for every widget you put on your screen.
        // Views occupy a rectangular area and are responsible for handling events
        // and drawing the widget.

        // The ListAdapter acts as a bridge between the data and each ListItem
        // You fill the ListView with a ListAdapter. You pass it a context represented by
        // this.

        // A Context provides access to resources you need. It provides the current Context, or
        // facts about the app and the events that have occurred with in it.
        // android.R.layout.simple_list_item_1 is one of the resources needed.
        // It is a predefined layout provided by Android that stands in as a default

        ListAdapter theAdapter;
        theAdapter = new ArrayAdapter<String>(this, R.layout.row_layout,
                R.id.textView1, favoriteTVShows);


    // We point the ListAdapter to our custom adapter
    // ListAdapter theAdapter = new MyAdapter(this, favoriteTVShows);

    // Get the ListView so we can work with it
    ListView theListView = (ListView) findViewById(R.id.listView1);

    // Connect the ListView with the Adapter that acts as a bridge between it and the array
    theListView.setAdapter(theAdapter);
    
}


    @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();
            if (id == R.id.action_settings) {
            return true;
            }
            return super.onOptionsItemSelected(item);
         }
         }

