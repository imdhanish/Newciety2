package com.example.android.newciety2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMainList(View view) {
        Intent i=new Intent(this,WelcomeActivity.class);
        startActivity(i);
        Button Numbers = (Button) findViewById(R.id.button);

        // Set a click listener on that View
        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            // The code in this method will be executed when the numbers category is clicked o

                // Create a new intent to open the {@link NumbersActivity}
                Intent NumbersIntent = new Intent(MainActivity.this, WelcomeActivity.class);

                // Start the new activity
                startActivity(NumbersIntent);

            }
        });


    }
}
