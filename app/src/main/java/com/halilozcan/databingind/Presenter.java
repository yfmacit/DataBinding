package com.halilozcan.databingind;

import android.util.Log;

public class Presenter {

    private static final String LOG_TAG = Presenter.class.getSimpleName();

    public void onPersonNameClicked(String name) {
        Log.v(LOG_TAG, "Name:" + name);
    }
}
