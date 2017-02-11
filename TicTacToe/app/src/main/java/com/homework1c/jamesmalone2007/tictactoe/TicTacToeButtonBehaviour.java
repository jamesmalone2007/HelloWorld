package com.homework1c.jamesmalone2007.tictactoe;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by James on 06/06/2015.
 */
public class TicTacToeButtonBehaviour implements View.OnClickListener{

    TextView winner_field;
    Button button;
    Button[][] multi;
    String winner;
    Context ctx;

    public TicTacToeButtonBehaviour(android.widget.Button[][] m, android.widget.Button b, android.widget.TextView w, Context context)
    {
        ctx = context;
        button = b;
        button.setText("");
        multi = m;
        winner_field = w;
    }
    @Override
    public void onClick(View view) {
        SingletonState.getInstance(button);

        if(checkForWinner())
            Toast.makeText(ctx, "Winner is " + winner, Toast.LENGTH_LONG).show();
            //winner_field.setText("Winner is " + winner);
    }

    private boolean checkForWinner()
    {
        if(checkRows() || checkColumns() || checkDiagonals())
            return true;
        return false;
    }

    private boolean checkRows()
    {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(multi[i][0], multi[i][1], multi[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns()
    {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(multi[0][i], multi[1][i], multi[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals()
    {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(multi[0][0], multi[1][1], multi[2][2]) == true)
                return true;
        }
        return false;
    }

    private boolean checkRowCol(Button one, Button two, Button three)
    {
        System.out.println("One: " + one.getText().toString());

        int oneid = one.getId();
        int twoid = two.getId();

        String text = one.getText().toString();
        String text2 = two.getText().toString();
        String text3 = three.getText().toString();

        if ((!one.getText().toString().contentEquals(""))  &&
                (!two.getText().toString().contentEquals("") &&
                        (!three.getText().toString().contentEquals("")) &&
                one.getText().toString().contentEquals(two.getText().toString()) &&
                one.getText().toString().contentEquals(three.getText().toString())))
        {
            winner = one.getText().toString();
            return true;
        }

        return false;
    }
}
