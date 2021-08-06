package com.dan.appactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    String age;
    int ageFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.et_age);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.tv_message);
    }

    @Override
    protected void onStart() {
        super.onStart();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                age = editText.getText().toString();
                ageFinal = Integer.parseInt(age)/4 ;
                textView.setText("Tu edad en años perro es: " + ageFinal);
            }
        });
    }


}

