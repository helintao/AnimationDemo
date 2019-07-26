package com.banana.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.banana.animationdemo.R;

import java.util.ArrayList;
import java.util.List;

public class NextActivity extends AppCompatActivity {

    private ListView listView;

    String [] strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        listView=findViewById(R.id.next_lv);
        strings=new String[15];
        initData();
        ArrayAdapter adapter=new ArrayAdapter<String>(
                this,android.R.layout.simple_expandable_list_item_1,strings);
        listView.setAdapter(adapter);

    }

    private void initData(){
        for(int i=0;i<15;i++){
            strings[i]="item:"+(i+1);
        }
    }
}
