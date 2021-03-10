package com.example.halaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Artikel(View view) {
        Intent a = new Intent(MainActivity.this,Halaman2.class);
        startActivity(a);
        Toast.makeText(this, "ke Artikel", Toast.LENGTH_SHORT).show();
    }
    public void Biodata(View view) {
        Intent a = new Intent(MainActivity.this, Halaman3.class);
        startActivity(a);
        Toast.makeText(this, "ke Biodata", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
}