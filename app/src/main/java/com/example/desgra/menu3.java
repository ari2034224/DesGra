package com.example.desgra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class menu3 extends AppCompatActivity {

    TextView escrituras, archivo;
    ImageButton atras;
    View layout1, layout2;
    ImageView background2, background1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu3);

        layout1 = (View) findViewById(R.id.layout1);
        background1 = (ImageView) findViewById(R.id.background1);
        escrituras = (TextView) findViewById(R.id.escrituras);

        layout2 = (View) findViewById(R.id.layout2);
        background2 = (ImageView) findViewById(R.id.background2);
        archivo = (TextView) findViewById(R.id.archivo);

        atras=(ImageButton) findViewById(R.id.atras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accion = new Intent(menu3.this, menu_p.class);
                startActivity(accion);
            }
        });
        escrituras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent escrito = new Intent(menu3.this, menu3.class);
                startActivity(escrito);
            }
        });

        archivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arch = new Intent(menu3.this, menu2.class);
                startActivity(arch);
            }
        });
    }
}