package com.example.d1mys1klapo4ka.myspeenerinit;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private Spinner spinner;
    private ListView listView;
    private EditText mEtNew;
    private Button mBtAdd;

    private List<String> lvMax ;
    private List<String> lvRoma ;
    private List<String> lvDima ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMax = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.max_task)));
        lvRoma = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.roma_task)));
        lvDima = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.dima_task)));

        spinner = (Spinner)findViewById(R.id.spinner);
        listView = (ListView)findViewById(R.id.lvListView);
        mEtNew = (EditText)findViewById(R.id.et_new);
        mBtAdd = (Button)findViewById(R.id.bt_add);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                listVievToSpinner(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final ArrayAdapter<String> btAdapter;
        btAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lvMax);
        listView.setAdapter(btAdapter);



        mBtAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"" + btAdapter.getCount(),Toast.LENGTH_SHORT).show();


//                btAdapter.add("new task");
                btAdapter.addAll("new task");
                btAdapter.notifyDataSetChanged();
                listView.invalidateViews();
//                listView.notify();
                Toast.makeText(MainActivity.this,"" + btAdapter.getCount(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void listVievToSpinner(int position){

        ArrayAdapter<String> listAdapter = null;

        switch (position){
            case 0:
                listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lvMax);
                break;
            case 1:
                listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lvRoma);
                break;
            case 2:
                listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lvDima);
                break;
            default:
                break;
        }
        listView.setAdapter(listAdapter);
    }
}
