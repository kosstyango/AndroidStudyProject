package com.example.androidstudyproject0;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                textView.setText(button.getText());
                Toast.makeText(getApplicationContext(), "Сработало!!!", Toast.LENGTH_SHORT).show();
                button.setEnabled(false);
                button.setText("GAME OVER");
            }
        });

    }
}