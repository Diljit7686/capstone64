package com.example.root.braingames;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String items[] = new String[]{"TIC TAC", "\n" +
            "MATHEMATICS", "BALLOON", "DRAGON BALL"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(MainActivity.this, tacticActivity.class);
                    Toast.makeText(MainActivity.this, "WELCOME TO TICTAC", Toast.LENGTH_LONG).show();
                    startActivity(i);
                }
                else if(position == 1){
                    Toast.makeText(MainActivity.this, "WELCOME TO MATH", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this,secondActivity.class);
                    startActivity(i);
                }
                else if (position == 2){
                    Toast.makeText(MainActivity.this, "WELCOME TO DRAGON", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this,main.class);
                    startActivity(i);
                }
            }
        });


    }
}
