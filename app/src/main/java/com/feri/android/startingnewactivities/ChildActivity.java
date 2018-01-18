package com.feri.android.startingnewactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    /* Field to store our TextView */
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        /* Typical usage of findViewById... */
        mDisplayText = (TextView) findViewById(R.id.tv_display);

        // COMPLETED (3) Use the getIntent method to store the Intent that started this Activity in a variable
        Intent intentThatStartedThisActivity = getIntent();

        // COMPLETED (4) Create an if statement to check if this Intent has the extra we passed from MainActivity
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            // COMPLETED (5) If the Intent contains the correct extra, retrieve the text
            String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);

            // COMPLETED (6) If the Intent contains the correct extra, use it to set the TextView text
            mDisplayText.setText(textEntered);
        }
    }
}