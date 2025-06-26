package com.bederin.randomnumber001;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Main extends AppCompatActivity {
TextView tvNumbers;
Button btnRandNumber;
TextView tvSum;
    int count = 0;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tvNumbers = (TextView) findViewById(R.id.tvNumbers);
        btnRandNumber = (Button) findViewById(R.id.btnRandNumber);
        tvSum = (TextView) findViewById(R.id.tvSum);

    }

    public void newNumber(View view) {
        int num = 1+(int)((9-1+1)*Math.random());
        tvNumbers.setText("Coздaнo случайное число = "+num);
        count = ++count;
        btnRandNumber.setText("Haжми дпя создания и показа \n случайноrо числа \n Число нажатий: " + count);
        sum = sum + num;
        tvSum.setText("Сумма случайных чисел: " + sum);
    }
}