package com.feri.android.startingnewactivities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /* Fields that will store our EditText and Button */
    private EditText mNameEntry;
    private Button mDoSomethingCoolButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDoSomethingCoolButton = (Button) findViewById(R.id.b_do_something_cool);
        mNameEntry = (EditText) findViewById(R.id.et_text_entry);

        /* Setting an OnClickListener allows us to do something when this button is clicked. */
        mDoSomethingCoolButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // COMPLETED (1) Retrieve the text from the EditText and store it in a variable
                String textEntered = mNameEntry.getText().toString();
                Context context = MainActivity.this;

                /* This is the class that we want to start (and open) when the button is clicked. */
                Class destinationActivity = ChildActivity.class;

                Intent startChildActivityIntent = new Intent(context, destinationActivity);

                // COMPLETED (2) Use the putExtra method to put the String from the EditText in the Intent
                startChildActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);

                startActivity(startChildActivityIntent);
            }
        });
    }
}
