package com.example.android.newciety2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void openAndroid(View view) {
        Intent i=new Intent(this,AndroidActivity.class);
        startActivity(i);
        TextView android = (TextView) findViewById(R.id.a1);

        // Set a click listener on that View
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // The code in this method will be executed when the numbers category is clicked o

                // Create a new intent to open the {@link NumbersActivity}
                Intent androidIntent = new Intent(WelcomeActivity.this, AndroidActivity.class);

                // Start the new activity
                startActivity(androidIntent);

            }
        });
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
                Intent androidIntent = new Intent(WelcomeActivity.this, HelpActivity.class);

                // Start the new activity
                startActivity(androidIntent);

            }
        });
    }

    public void openDesign(View view) {
        Intent i=new Intent(this,DesignActivity.class);
        startActivity(i);
        TextView android = (TextView) findViewById(R.id.a3);

        // Set a click listener on that View
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // The code in this method will be executed when the numbers category is clicked o

                // Create a new intent to open the {@link NumbersActivity}
                Intent androidIntent = new Intent(WelcomeActivity.this, DesignActivity.class);

                // Start the new activity
                startActivity(androidIntent);

            }
        });
    }

    public void openEthical(View view) {
        Intent i=new Intent(this,HackingActivity.class);
        startActivity(i);
        TextView android = (TextView) findViewById(R.id.a5);

        // Set a click listener on that View
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // The code in this method will be executed when the numbers category is clicked o

                // Create a new intent to open the {@link NumbersActivity}
                Intent androidIntent = new Intent(WelcomeActivity.this, HackingActivity.class);

                // Start the new activity
                startActivity(androidIntent);

            }
        });
    }

    public void openweb(View view) {
        Intent i=new Intent(this,WebActivity.class);
        startActivity(i);
        TextView android = (TextView) findViewById(R.id.a4);

        // Set a click listener on that View
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // The code in this method will be executed when the numbers category is clicked o

                // Create a new intent to open the {@link NumbersActivity}
                Intent androidIntent = new Intent(WelcomeActivity.this, WebActivity.class);

                // Start the new activity
                startActivity(androidIntent);

            }
        });
    }

    public void opencoding(View view) {
        Intent i=new Intent(this,CodingActivity.class);
        startActivity(i);
        TextView android = (TextView) findViewById(R.id.a2);

        // Set a click listener on that View
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // The code in this method will be executed when the numbers category is clicked o

                // Create a new intent to open the {@link NumbersActivity}
                Intent androidIntent = new Intent(WelcomeActivity.this, CodingActivity.class);

                // Start the new activity
                startActivity(androidIntent);

            }
        });
    }
}
