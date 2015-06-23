package com.example.qauser.funtest;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class FunTestActivity extends ActionBarActivity {
    private Funtestgeneration  funny = new Funtestgeneration();
    private Funcolors mcolors = new Funcolors();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_test);
        final TextView lytext = (TextView) findViewById(R.id.textView2);
        final TextView tTitle = (TextView) findViewById(R.id.textView);
        final Button shownewtxt = (Button) findViewById(R.id.btn_change);
        final RelativeLayout relativelout = (RelativeLayout) findViewById(R.id.relativeL);
        View.OnClickListener  listner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lytext.setText(funny.funTest());
                int  mycolor = mcolors.getColors();
                relativelout.setBackgroundColor(mycolor);
                shownewtxt.setTextColor(mycolor);

            }
        };

        shownewtxt.setOnClickListener(listner);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
