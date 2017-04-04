package com.example.daniel.quizzz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void start ( View v)
    {
        Context cont;
        cont = getApplicationContext();
        Intent intent = new Intent(cont,gra.class);
        startActivity(intent);
    }
}
