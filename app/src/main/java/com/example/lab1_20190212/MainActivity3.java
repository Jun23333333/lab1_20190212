package com.example.lab1_20190212;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String jugada;
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("clave1")) {
            String abc = intent.getStringExtra("clave1");
            jugada = abc;
            String[] partes = jugada.split("-");
            if(partes.length>1){
                if(partes[1].equals("p")){
                    TextView juego0 = findViewById(R.id.juego0);
                    juego0.setVisibility(View.VISIBLE);
                    juego0.setText("Juego 1: Cancelo");
                }
                else{
                    TextView juego0 = findViewById(R.id.juego0);
                    juego0.setVisibility(View.VISIBLE);
                    juego0.setText("Juego 1: Termino en "+ partes[1] +" seg");
                }
            }if(partes.length>2){
                if(partes[2].equals("p") && partes.length > 2){
                    TextView juego1 = findViewById(R.id.juego2);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 2: Cancelo");
                }
                else if(partes[2] != null && partes.length > 2){
                    TextView juego1 = findViewById(R.id.juego2);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 2: Termino en "+ partes[2] +" seg");
                }
            }if(partes.length>3){
                if(partes[3].equals("p")){
                    TextView juego1 = findViewById(R.id.juego3);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 3: Cancelo");
                }
                else if(partes[3] != null){
                    TextView juego1 = findViewById(R.id.juego3);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 3: Termino en "+ partes[3] +" seg");
                }
            }
            if(partes.length>4){
            if(partes[4].equals("p") && partes.length > 4){
                TextView juego1 = findViewById(R.id.juego4);
                juego1.setVisibility(View.VISIBLE);
                juego1.setText("Juego 4: Cancelo");
            }
            else if(partes[4] != null && partes.length > 4){
                TextView juego1 = findViewById(R.id.juego4);
                juego1.setVisibility(View.VISIBLE);
                juego1.setText("Juego 4: Termino en "+ partes[4] +" seg");
            }}if(partes.length>5){
                if(partes[5].equals("p")){
                    TextView juego1 = findViewById(R.id.juego5);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 5: Cancelo");
                }
                else if(partes[5] != null){
                    TextView juego1 = findViewById(R.id.juego5);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 5: Termino en "+ partes[5] +" seg");
                }}
            if(partes.length>6){
                if(partes[6].equals("p")){
                    TextView juego1 = findViewById(R.id.juego6);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 6: Cancelo");
                }
                else{
                    TextView juego1 = findViewById(R.id.juego6);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 6: Termino en "+ partes[6] +" seg");
                }}
            if(partes.length>7){
                if(partes[6].equals("p")){
                    TextView juego1 = findViewById(R.id.juego7);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 7: Cancelo");
                }
                else{
                    TextView juego1 = findViewById(R.id.juego7);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 7: Termino en "+ partes[7] +" seg");
                }}
            if(partes.length>8){
                if(partes[8].equals("p")){
                    TextView juego1 = findViewById(R.id.juego8);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 8: Cancelo");
                }
                else{
                    TextView juego1 = findViewById(R.id.juego8);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 8: Termino en "+ partes[8] +" seg");
                }}if(partes.length>9){
                if(partes[9].equals("p")){
                    TextView juego1 = findViewById(R.id.juego9);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 9: Cancelo");
                }
                else{
                    TextView juego1 = findViewById(R.id.juego6);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 9: Termino en "+ partes[9] +" seg");
                }}if(partes.length>10){
                if(partes[6].equals("p")){
                    TextView juego1 = findViewById(R.id.juego10);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 10: Cancelo");
                }
                else{
                    TextView juego1 = findViewById(R.id.juego10);
                    juego1.setVisibility(View.VISIBLE);
                    juego1.setText("Juego 10: Termino en "+ partes[10] +" seg");
                }}
        }
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView regreso = findViewById(R.id.regreso);
        regreso.setOnClickListener(view -> {
            finish();
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.button3);
        button.setOnClickListener(view ->{
            finish();
        });

    }
}