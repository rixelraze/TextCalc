package com.example.textcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView textView;
        textView = findViewById(R.id.num1);

        TextView textView2;
        textView2 = findViewById(R.id.num2);

        TextView textView3;
        textView3 = findViewById(R.id.sum);

        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {
            num1 = arguments.getInt("key1");
            textView.setText(String.valueOf(num1));
            num2 = arguments.getInt("key2");
            textView2.setText(String.valueOf(num2));
            sum = arguments.getInt("sum");
            textView3.setText(String.valueOf(sum));
            if (num2 < 0) {
                textView2.setText("(" + num2 + ")");
            }
            if (sum < 0) {
                textView3.setText("(" + sum + ")");
            }
        }
    }
}