package com.example.button_round;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

public class button_round {


    public static void roundButton(View view){



        GradientDrawable shape =  new GradientDrawable();
        shape.setCornerRadius( 100 );
        view.setBackground(shape);


    }


}
