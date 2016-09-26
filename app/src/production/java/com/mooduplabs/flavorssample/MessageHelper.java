package com.mooduplabs.flavorssample;

import android.view.View;
import android.widget.Toast;

public class MessageHelper {

    public static void showMessage(View view) {
        Toast.makeText(view.getContext(), "Hello Production application", Toast.LENGTH_SHORT).show();
    }


}