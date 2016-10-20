package edu.tecii.android.simplelistdemo;

import android.app.ListActivity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView txtMsg;
    TextView Empty;
    ListView List;

    String[] Item={"Data-0","Data-1","Data-2","Data-3","Data-4","Data-5","Data-6","Data-7",};

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String text="Position:"+position+" "+Item[position];
        txtMsg.setText(text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, Item));
        txtMsg=(TextView) findViewById (R.id.txtMsg);
        getListView().setBackgroundColor(Color.GRAY);

    }

}
