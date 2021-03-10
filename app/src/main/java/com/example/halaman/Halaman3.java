package com.example.halaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Halaman3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);
    }
    public void Artikel(View view) {
        Intent c = new Intent(Halaman3.this,Halaman2.class);
        startActivity(c);
        Toast.makeText(this, "ke Artikel", Toast.LENGTH_SHORT).show();
    }
    public void Beranda(View view) {
        Intent c = new Intent(Halaman3.this,MainActivity.class);
        startActivity(c);
        Toast.makeText(this, "ke Beranda", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }

}