package com.homework1d.jamesmalone2007.hangman;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //POPULATE THE FIELDS CORRECTLY
        String[] words = getResources().getStringArray(R.array.words);

        //Select random word.
        Random rand = new Random();
        int randomNum = rand.nextInt(words.length);
        final String targetword = words[randomNum];

        String displayword = targetword;

        for(char ch : displayword.toCharArray())
        {
            displayword = displayword.replace(ch,'?');
        }

        final TextView display_view = (TextView) findViewById(R.id.textView3);

        display_view.setText(displayword);


        Button submit = (Button) findViewById(R.id.SUBMIT);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.entry);
                char submitted_char = editText.getText().toString().charAt(0);



                if(targetword.indexOf(submitted_char) == -1)
                {
                    int[] arr = new int[7];
                    arr[0] = R.drawable.hangman6;
                    arr[1] = R.drawable.hangman5;
                    arr[2] = R.drawable.hangman4;
                    arr[3] = R.drawable.hangman3;
                    arr[4] = R.drawable.hangman2;
                    arr[5] = R.drawable.hangman1;
                    arr[6] = R.drawable.hangman0;

                    int currentid = R.id.hangman_gallows;
                    int currentarr = Arrays.asList(arr).indexOf(currentid);

                    //No match found
                    ImageView img = (ImageView) findViewById(R.id.hangman_gallows);

                    img.setImageResource(arr[currentarr + 1]);

                    int n = img.getId();
                    n = n;
                } else {
                    StringBuilder d_word = new StringBuilder(display_view.getText().toString());

                    for (int i = 0; i < targetword.length(); i++) {
                        if (targetword.charAt(i) == submitted_char) {
                            d_word.setCharAt(i, submitted_char);
                        }
                    }

                    display_view.setText(String.valueOf(d_word));
                    editText.setText("");
                }
            }
        });

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
