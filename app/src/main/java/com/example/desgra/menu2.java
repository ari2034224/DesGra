package com.example.desgra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class menu2 extends AppCompatActivity {
    ImageButton atras;
    TextView ventas, gastos, ganancias;
    View layout1, layout2 , layout3;
    ImageView background2, background1, background3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2);

        layout1 = (View) findViewById(R.id.layout1);
        background1 = (ImageView) findViewById(R.id.background1);
        ventas = (TextView) findViewById(R.id.ventas);

        layout2 = (View) findViewById(R.id.layout2);
        background2 = (ImageView) findViewById(R.id.background2);
        gastos = (TextView) findViewById(R.id.gastos);

        layout3 = (View) findViewById(R.id.layout3);
        background3 = (ImageView) findViewById(R.id.background2);
        ganancias = (TextView) findViewById(R.id.ganancias);

        atras=(ImageButton) findViewById(R.id.atras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accion = new Intent(menu2.this, menu_p.class);
                startActivity(accion);
            }
        });

        ventas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent venta = new Intent(menu2.this, ventas.class);
                startActivity(venta);
            }
        });
        gastos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gasto = new Intent(menu2.this, gastos.class);
                startActivity(gasto);
            }
        });
        ganancias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ganancia = new Intent(menu2.this, ganancias.class);
                startActivity(ganancia);
            }
        });
    }
}