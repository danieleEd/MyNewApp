package com.example.dani.mynewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telalogin);

    }

    public void cadastrar(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

}
