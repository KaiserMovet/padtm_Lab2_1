package com.example.lab21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnCreate");
        Toast.makeText(this, "Metodag OnCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda onStart");
        Toast.makeText(this, "Metodag onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda onPause");
        Toast.makeText(this, "Metodag onPause", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda onStop");
        Toast.makeText(this, "Metodag onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda onRestart");
        Toast.makeText(this, "Metodag onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda onResume");
        Toast.makeText(this, "Metodag onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda onDestroy");
        Toast.makeText(this, "Metodag onDestroy", Toast.LENGTH_SHORT).show();
    }
}

