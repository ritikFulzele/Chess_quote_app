package com.rakdevloper.chessquoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView quote;        // Initializing the quote variable as TextView widegts
    Button share;          // Initializing the share variable as Button Widgets

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();     // Hiding the action bar of the android application

        share = findViewById(R.id.shareBtn);    // Finding the share Button by using the id : shareBtn
        quote = findViewById(R.id.tvquote);     // Finding the TextView quote by using the id : tvquote

        share.setOnClickListener(new View.OnClickListener() {      // on clicking share Button (what type of action we want to perform)
            @Override
            public void onClick(View view) {
                String shareTxt = quote.getText().toString();    // converting the text to string ( in quote )

                Intent sendIntent = new Intent();      // Creating the new Intent
                sendIntent.setAction(Intent.ACTION_SEND);   // We set the action "SEND" from "sendIntent" after clicking "SHARE" Button
                sendIntent.setType("text/plain");    // we set the type of text which we want to send
                sendIntent.putExtra(Intent.EXTRA_TEXT, shareTxt);    // we use putExtra for sending the extra text
                startActivity(sendIntent);    // calling for the starting the activity 

            }
        });





    }
}