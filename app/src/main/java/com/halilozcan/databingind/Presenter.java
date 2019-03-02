package com.halilozcan.databingind;

import android.view.View;
import android.widget.Toast;

public class Presenter {

    private static final String LOG_TAG = Presenter.class.getSimpleName();

    public void onPersonNameClicked(View view, String name) {
        Toast.makeText(view.getContext(), "Name:" + name, Toast.LENGTH_LONG).show();
    }

    public static String getUpperString(String name) {
        return name.toUpperCase();
    }
}
