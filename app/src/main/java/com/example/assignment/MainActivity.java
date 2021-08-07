package com.example.assignment;

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

    public void stmartins(View view) {
        startActivity(new Intent(this, saintMartins.class));
    }

    public void coxsBazar(View view) {
        startActivity(new Intent(this, coxsBazar.class));
    }

    public void bandarban(View view) {
        startActivity(new Intent(this, bandarban.class));
    }

    public void sylet(View view) {
        startActivity(new Intent(this, sylet.class));
    }
}