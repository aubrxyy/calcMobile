package com.example.myapplication;

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

public class MainActivity extends AppCompatActivity {

    private EditText a, b;
    private Button plusbtn, minbtn, multibtn, divbtn;
    private TextView rslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        a = findViewById(R.id.bil01);
        b = findViewById(R.id.bil02);

        plusbtn = findViewById(R.id.plusbtn);
        minbtn = findViewById(R.id.minbtn);
        multibtn = findViewById(R.id.multibtn);
        divbtn = findViewById(R.id.divbtn);
        rslt = findViewById(R.id.tvrslt);

        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rslt.setText("");
                Integer x, y, z;
                x = Integer.parseInt(a.getText().toString());
                y = Integer.parseInt(b.getText().toString());
                z = x + y;
                rslt.setText(z.toString());
            }
        });

        minbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rslt.setText("");
                Integer x, y, z;
                x = Integer.parseInt(a.getText().toString());
                y = Integer.parseInt(b.getText().toString());
                z = x - y;
                rslt.setText(z.toString());
            }
        });

        multibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rslt.setText("");
                Integer x, y, z;
                x = Integer.parseInt(a.getText().toString());
                y = Integer.parseInt(b.getText().toString());
                z = x * y;
                rslt.setText(z.toString());
            }
        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rslt.setText("");
                Integer x, y, z;
                x = Integer.parseInt(a.getText().toString());
                y = Integer.parseInt(b.getText().toString());
                z = x / y;
                rslt.setText(z.toString());
            }
        });
    }
}