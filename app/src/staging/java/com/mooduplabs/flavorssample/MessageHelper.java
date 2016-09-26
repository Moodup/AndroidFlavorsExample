package com.mooduplabs.flavorssample;

import android.support.design.widget.Snackbar;
import android.view.View;

public class MessageHelper {

    public static void showMessage(View view){
        Snackbar.make(view, "Hello Staging application", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }


}