package com.example.desgra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class menu_p extends AppCompatActivity {

    TextView despacho, granja;
    ImageButton atras;
    View layout1, layout2;
    ImageView background2, background1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_p);

        layout1 = (View) findViewById(R.id.layout1);
        background1 = (ImageView) findViewById(R.id.background1);
        despacho= (TextView) findViewById(R.id.despacho);

        layout2 = (View) findViewById(R.id.layout2);
        background2 = (ImageView) findViewById(R.id.background2);
        granja= (TextView) findViewById(R.id.granja);

        atras=(ImageButton) findViewById(R.id.atras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accion = new Intent(menu_p.this, inicio.class);
                startActivity(accion);
            }
        });
        despacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent despacho = new Intent(menu_p.this, menu3.class);
                startActivity(despacho);
            }
        });

        granja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent granja = new Intent(menu_p.this, menu2.class);
                startActivity(granja);
            }
        });
    }
}