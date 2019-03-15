package com.example.ejercicio3_labo2_00189617;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout primero;
    LinearLayout segundo;
    LinearLayout tercero;
    int cont1=1, cont2=1, cont3=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primero=(LinearLayout)findViewById(R.id.rojo);
        segundo=(LinearLayout)findViewById(R.id.verde);
        tercero=(LinearLayout)findViewById(R.id.azul);

        primero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont1==0){
                    primero.setBackgroundColor(getResources().getColor(R.color.rojo1));
                    cont1=1;
                }
                else if(cont1==1){
                    primero.setBackgroundColor(getResources().getColor(R.color.rojo2));
                    cont1=2;
                }
                else if(cont1==2){
                    primero.setBackgroundColor(getResources().getColor(R.color.rojo3));
                    cont1=0;
                }
            }
        });

        segundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont2==0){
                    segundo.setBackgroundColor(getResources().getColor(R.color.verde1));
                    cont2=1;
                }
                else if(cont2==1){
                    segundo.setBackgroundColor(getResources().getColor(R.color.verde2));
                    cont2=2;
                }
                else if(cont2==2){
                    segundo.setBackgroundColor(getResources().getColor(R.color.verde3));
                    cont2=0;
                }
            }
        });
        tercero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont3==0){
                    tercero.setBackgroundColor(getResources().getColor(R.color.azul1));
                    cont3=1;
                }
                else if(cont3==1){
                    tercero.setBackgroundColor(getResources().getColor(R.color.azul2));
                    cont3=2;
                }
                else if(cont3==2){
                    tercero.setBackgroundColor(getResources().getColor(R.color.azul3));
                    cont3=0;
                }
            }
        });

    }
}
