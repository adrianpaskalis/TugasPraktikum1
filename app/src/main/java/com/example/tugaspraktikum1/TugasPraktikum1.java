package com.example.tugaspraktikum1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TugasPraktikum1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tugaspraktikum1_activity);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("test");
    }
}