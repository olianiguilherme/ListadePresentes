package com.up.listadepresentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

     private FloatingActionButton fabAddButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabAddButton =  findViewById(R.id.fab_add_gift);

        fabAddButton.setOnClickListener(
                new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }

        });
    }
}