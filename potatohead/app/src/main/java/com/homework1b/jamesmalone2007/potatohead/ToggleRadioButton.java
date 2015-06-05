package com.homework1b.jamesmalone2007.potatohead;

import android.view.View;
import android.widget.ImageView;

/**
 * Defines behavior of what happens when the checkbox is clicked.
 *
 * Created by James on 05/06/2015.
 */
public class ToggleRadioButton implements View.OnClickListener
{
    ImageView image;

    public ToggleRadioButton(ImageView iv)
    {
        image = iv;
    }

    @Override
    public void onClick(View view) {
        image.setVisibility(image.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
    }


    //hat eyebrows nose mouth
}
