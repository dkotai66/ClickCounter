package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plussz, minusz;
    private TextView szoveg;

    private int szam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();




        plussz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam = Integer.valueOf(szoveg.getText().toString());
                szam += 1;
                szoveg.setText(String.valueOf(szam));

                if(szam>0){
                    szoveg.setTextColor(Color.parseColor("#00FF00"));
                }
                else if(szam<0){
                    szoveg.setTextColor(Color.parseColor("#FF0000"));
                }
                else if(szam==0) {
                    szoveg.setTextColor(Color.parseColor("#0000FF"));
                }
            }
        });

        szoveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szoveg.setText("0");
                szoveg.setTextColor(Color.parseColor("#0000FF"));
            }
        });

        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam = Integer.valueOf(szoveg.getText().toString());
                szam -= 1;
                szoveg.setText(String.valueOf(szam));

                if(szam>0){
                    szoveg.setTextColor(Color.parseColor("#00FF00"));
                }
                else if(szam<0){
                    szoveg.setTextColor(Color.parseColor("#FF0000"));
                }
                else if(szam==0) {
                    szoveg.setTextColor(Color.parseColor("#0000FF"));
                }
            }
        });

    }

    private void init(){
        plussz = findViewById(R.id.plussz);
        minusz = findViewById(R.id.minusz);
        szoveg = findViewById(R.id.szoveg);
    }
}