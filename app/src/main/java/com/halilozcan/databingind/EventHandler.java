package com.halilozcan.databingind;

import android.view.View;
import android.widget.Toast;

public class EventHandler {
    public void onNameTextClicked(View view) {
        Toast.makeText(view.getContext(), "Text Clicked", Toast.LENGTH_LONG).show();
    }
}
