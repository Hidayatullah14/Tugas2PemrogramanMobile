package com.example.halaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Halaman2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
    }

    public void Beranda(View view) {
        Intent b = new Intent(Halaman2.this,MainActivity.class);
        startActivity(b);
        Toast.makeText(this, "ke Beranda", Toast.LENGTH_SHORT).show();
    }
    public void Biodata(View view) {
        Intent b = new Intent(Halaman2.this,Halaman3.class);
        startActivity(b);
        Toast.makeText(this, "ke Biodata", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
}