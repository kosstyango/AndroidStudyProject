package com.example.studyproject;

import static java.lang.Thread.sleep;

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
    public void transfer(View view){
        Toast.makeText(this, R.string.Переход, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this.getApplicationContext(), SecondActivity.class);
        intent.putExtra("TextForTransferring", getString(R.string.textForTransferring));
        startActivity(intent);
    }
}