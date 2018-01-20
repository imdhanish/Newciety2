package com.example.android.newciety2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
    }

    public void openHelp(View view) {
        Intent i=new Intent(this,HelpActivity.class);
        startActivity(i);
        TextView android = (TextView) findViewById(R.id.textView10);

        // Set a click listener on that View
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // The code in this method will be executed when the numbers category is clicked o

                // Create a new intent to open the {@link NumbersActivity}
                Intent androidIntent = new Intent(DesignActivity.this, HelpActivity.class);

                // Start the new activity
                startActivity(androidIntent);

            }
        });
    }
}
