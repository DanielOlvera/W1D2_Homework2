package com.example.daniel.w1d2_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMagic(View view){
        Toast.makeText(this, "State Working!", Toast.LENGTH_SHORT).show();
    }

    /*References: https://sermojohn.wordpress.com/2012/02/04/using-a-state-list-drawable-as-a-button-background-image/
                  http://justsimpleinfo.blogspot.com/2014/06/android-statelistdrawable-example.html
     */

}
