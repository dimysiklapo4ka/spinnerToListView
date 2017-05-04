package com.example.d1mys1klapo4ka.myspeenerinit;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity{

    private Spinner spinner;
    private ListView listView;

//     String[] lvMax = getResources().getStringArray(R.array.max_task);
//     String[] lvRoma = getResources().getStringArray(R.array.roma_task);
//     String[] lvDima = getResources().getStringArray(R.array.dima_task);

    //String[] lvMax = new String[]{"Calculator Math.class","BMI","Wiget Sinoptic"};
    //String[] lvRoma = new String[]{"Calculator","Piano","Money banking"};
    //String[] lvDima = new String[]{"Calculator programming","China Calendar","Internet brovzer"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        listView = (ListView)findViewById(R.id.lvListView);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//                listVievToSpinner(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item, lvMax);
//
//        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
//    ArrayAdapter<String> listAdapter;
//    private void listVievToSpinner(int position){
//
//        switch (position){
//            case 0:
//                listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lvMax);
//                break;
//            case 1:
//                listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lvRoma);
//                break;
//            case 2:
//                listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lvDima);
//                break;
//            default:
//                break;
//        }
//        listView.setAdapter(listAdapter);
//    }
}
