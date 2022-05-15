package com.example.studyproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    boolean isFirstClick = true;
    @Override
    protected void onCreate(@Nullable Bundle saved){
        super.onCreate(saved);
        setContentView(R.layout.activity_second);
        String text2 = getIntent().getStringExtra("TextForTransferring"); //достаём из Intent переданный текст
        TextView name2 = findViewById(R.id.textView2); //находим нужное окно
        name2.setText(text2); //вставляем туда текст из первой активити


    }
    @SuppressLint("ResourceAsColor")
    public void finish(View view){ //обработчик нажатия второй кнопки
        Button button2 = findViewById(R.id.button2);
        if (isFirstClick){ //Проверка первого нажатия
        Toast.makeText(this, R.string.Похвала, Toast.LENGTH_LONG).show();
        isFirstClick = false;
        button2.setText("GAME OVER");
        //button2.setTextColor(android.R.color.holo_orange_light);
        //button2.setBackgroundColor(android.R.color.black);
        }
    }
}
