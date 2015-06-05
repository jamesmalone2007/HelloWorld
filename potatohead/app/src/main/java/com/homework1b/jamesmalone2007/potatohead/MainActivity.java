package com.homework1b.jamesmalone2007.potatohead;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox hat_button = (CheckBox) findViewById(R.id.box_hat);
        final ToggleRadioButton hat_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_hat));
        hat_button.setOnClickListener(hat_event);

        final CheckBox arm_button = (CheckBox) findViewById(R.id.box_arms);
        final ToggleRadioButton arm_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_arms));
        arm_button.setOnClickListener(arm_event);

        final CheckBox eyebrows_button = (CheckBox) findViewById(R.id.box_eyebrows);
        final ToggleRadioButton eyebrows_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_eyebrows));
        eyebrows_button.setOnClickListener(eyebrows_event);

        final CheckBox ears_button = (CheckBox) findViewById(R.id.box_ears);
        final ToggleRadioButton ears_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_ears));
        ears_button.setOnClickListener(ears_event);

        final CheckBox eyes_button = (CheckBox) findViewById(R.id.box_eyes);
        final ToggleRadioButton eyes_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_eyes));
        eyes_button.setOnClickListener(eyes_event);

        final CheckBox glasses_button = (CheckBox) findViewById(R.id.box_glasses);
        final ToggleRadioButton glasses_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_glasses));
        glasses_button.setOnClickListener(glasses_event);

        final CheckBox mustache_button = (CheckBox) findViewById(R.id.box_mustache);
        final ToggleRadioButton mustache_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_mustache));
        mustache_button.setOnClickListener(mustache_event);

        final CheckBox mouth_button = (CheckBox) findViewById(R.id.box_mouth);
        final ToggleRadioButton mouth_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_mouth));
        mouth_button.setOnClickListener(mouth_event);

        final CheckBox nose_button = (CheckBox) findViewById(R.id.box_nose);
        final ToggleRadioButton nose_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_nose));
        nose_button.setOnClickListener(nose_event);

        final CheckBox shoes_button = (CheckBox) findViewById(R.id.box_shoes);
        final ToggleRadioButton shoes_event = new ToggleRadioButton((ImageView) findViewById(R.id.img_shoes));
        shoes_button.setOnClickListener(shoes_event);
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
