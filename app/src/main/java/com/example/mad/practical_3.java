package com.example.mad;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class practical_3 extends AppCompatActivity {

    EditText num1, num2;
    TextView ans;
    Button addbtn, subbtn, mulbtn, divbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.practical3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        ans = findViewById(R.id.ans);
        addbtn = findViewById(R.id.addbtn);
        subbtn = findViewById(R.id.subbtn);
        mulbtn = findViewById(R.id.mulbtn);
        divbtn = findViewById(R.id.divbtn);

        addbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!num1.getText().toString().isBlank() & !num2.getText().toString().isBlank()) {
                    float first = Float.parseFloat(num1.getText().toString());
                    float second = Float.parseFloat(num2.getText().toString());
                    ans.setText("Ans is : " + (first + second));
                }
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!num1.getText().toString().isBlank() & !num2.getText().toString().isBlank()) {
                    float first = Float.parseFloat(num1.getText().toString());
                    float second = Float.parseFloat(num2.getText().toString());
                    ans.setText("Ans is : " + (first - second));
                }
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!num1.getText().toString().isBlank() & !num2.getText().toString().isBlank()) {
                    float first = Float.parseFloat(num1.getText().toString());
                    float second = Float.parseFloat(num2.getText().toString());
                    ans.setText("Ans is : " + (first * second));
                }
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!num1.getText().toString().isBlank() & !num2.getText().toString().isBlank()) {
                    float first = Float.parseFloat(num1.getText().toString());
                    float second = Float.parseFloat(num2.getText().toString());
                    ans.setText("Ans is : " + (first / second));
                }
            }
        });

    }
}