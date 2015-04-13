package com.example.lvbk.task5;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ListActivity {

    TextView selection;
    String[] items={"Prof Reinbold", "Prof abc", "Prof xyz", "Prof prof"};
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.custom, R.id.title, items));
        selection=(TextView)findViewById(R.id.selection);
    }
    public void onListItemClick(ListView parent, View v, int position, long id) {
            selection.setText(items[position]);
    }
}