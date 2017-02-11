package com.homework1c.jamesmalone2007.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a singleton class with a state contained in it for X and O

        TextView winner = (TextView) findViewById(R.id.winner);

        Button[][] multi = new Button[3][3];

        Button button = (Button) findViewById(R.id.button_00);
        multi[0][0] = button;

        Button button1 = (Button) findViewById(R.id.button_01);
        multi[0][1] = button1;

        Button button2 = (Button) findViewById(R.id.button_02);
        multi[0][2] = button2;

        Button button3 = (Button) findViewById(R.id.button_10);
        multi[1][0] = button3;

        Button button4 = (Button) findViewById(R.id.button_11);
        multi[1][1] = button4;

        Button button5 = (Button) findViewById(R.id.button_12);
        multi[1][2] = button5;

        Button button6 = (Button) findViewById(R.id.button_20);
        multi[2][0] = button6;

        Button button7 = (Button) findViewById(R.id.button_21);
        multi[2][1] = button7;

        Button button8 = (Button) findViewById(R.id.button_22);
        multi[2][2] = button8;

        button.setOnClickListener(new TicTacToeButtonBehaviour(multi, button, winner, this));
        button1.setOnClickListener(new TicTacToeButtonBehaviour(multi, button1, winner, this));
        button2.setOnClickListener(new TicTacToeButtonBehaviour(multi, button2, winner, this));
        button3.setOnClickListener(new TicTacToeButtonBehaviour(multi, button3, winner, this));
        button4.setOnClickListener(new TicTacToeButtonBehaviour(multi, button4, winner, this));
        button5.setOnClickListener(new TicTacToeButtonBehaviour(multi, button5, winner, this));
        button6.setOnClickListener(new TicTacToeButtonBehaviour(multi, button6, winner, this));
        button7.setOnClickListener(new TicTacToeButtonBehaviour(multi, button7, winner, this));
        button8.setOnClickListener(new TicTacToeButtonBehaviour(multi, button8, winner, this));
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
