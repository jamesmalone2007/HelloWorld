package com.androiddevelopment.jamesmalone2007.potatohead;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private void CreateButtonAndListener(final int boxid, final int imgid)
    {
        CheckBox button = (CheckBox) findViewById(boxid);
        ToggleRadioButton event = new ToggleRadioButton((ImageView) findViewById(imgid));
        button.setOnClickListener(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateButtonAndListener(R.id.box_hat, R.id.img_hat);
        CreateButtonAndListener(R.id.box_arms,R.id.img_arms );
        CreateButtonAndListener(R.id.box_eyebrows, R.id.img_eyebrows);
        CreateButtonAndListener(R.id.box_ears, R.id.img_ears);
        CreateButtonAndListener(R.id.box_eyes, R.id.img_eyes);
        CreateButtonAndListener(R.id.box_glasses, R.id.img_glasses);
        CreateButtonAndListener(R.id.box_mustache, R.id.img_mustache);
        CreateButtonAndListener(R.id.box_mouth, R.id.img_mouth);
        CreateButtonAndListener(R.id.box_nose, R.id.img_nose);
        CreateButtonAndListener(R.id.box_shoes, R.id.img_shoes);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
