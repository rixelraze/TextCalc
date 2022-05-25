package com.example.textcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    TextView textView;
    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.num1);

        editText2 = findViewById(R.id.num2);

        textView = findViewById(R.id.text);


    }

    public void doSum(View v) {
        String string1 = editText1.getText().toString();

        String string2 = editText2.getText().toString();

        try {

            num1 = Integer.parseInt(string1);

            num2 = Integer.parseInt(string2);

            int sum = num1 + num2;

            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("key1", num1);
            intent.putExtra("key2", num2);
            intent.putExtra("sum", sum);
            startActivity(intent);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            String result = "Данные не корректны!";

            textView.setText(result);

        }
    }
}
