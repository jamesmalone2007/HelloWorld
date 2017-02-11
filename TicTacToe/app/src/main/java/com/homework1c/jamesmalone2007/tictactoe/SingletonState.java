package com.homework1c.jamesmalone2007.tictactoe;

/**
 * Created by James on 06/06/2015.
 */
enum SingletonState {
    INSTANCE;

    private static String current_letter = "X";

    public static void getInstance(android.widget.Button button)
    {
        if(((String) button.getText()).isEmpty())
        {
            if (current_letter == "X")
                current_letter = "O";
            else
                current_letter = "X";

            button.setText(current_letter);

        }
    }

}
