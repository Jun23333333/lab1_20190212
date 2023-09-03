package com.example.lab1_20190212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity2 extends AppCompatActivity {
    String[] listaDePalabras = {
            "REDES", "PROPA", "PUCP", "TELITO", "TELECO", "BATI"
    };

    Random random = new Random();

    int indiceAleatorio = random.nextInt(listaDePalabras.length);

    String palabraSeleccionada = listaDePalabras[indiceAleatorio];
    int intentosRestantes = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ahorcado);
        LocalDateTime inicio = LocalDateTime.now();
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("clave_valor")) {
                String valorRecibido;
                valorRecibido = intent.getStringExtra("clave_valor");
                TextView textView = findViewById(R.id.textView10);

            }
        }

        Button a = findViewById(R.id.buttonA);
        Button b = findViewById(R.id.buttonB);
        Button c = findViewById(R.id.buttonC);
        Button d = findViewById(R.id.buttonD);
        Button e = findViewById(R.id.buttonE);
        Button f = findViewById(R.id.buttonF);
        Button g = findViewById(R.id.buttonG);
        Button h = findViewById(R.id.buttonH);
        Button i = findViewById(R.id.buttonI);
        Button j = findViewById(R.id.buttonJ);
        Button k = findViewById(R.id.buttonK);
        Button l = findViewById(R.id.buttonL);
        Button m = findViewById(R.id.buttonM);
        Button n = findViewById(R.id.buttonN);
        Button o = findViewById(R.id.buttonO);
        Button p = findViewById(R.id.buttonP);
        Button q = findViewById(R.id.buttonQ);
        Button r = findViewById(R.id.buttonR);
        Button s = findViewById(R.id.buttonS);
        Button t = findViewById(R.id.buttonT);
        Button u = findViewById(R.id.buttonU);
        Button v = findViewById(R.id.buttonV);
        Button w = findViewById(R.id.buttonW);
        Button x = findViewById(R.id.buttonX);
        Button y = findViewById(R.id.buttonY);
        Button z = findViewById(R.id.buttonZ);
        Button nuevo = findViewById(R.id.buttonA);
        TextView t1 = findViewById(R.id.textView4);
        TextView t2 = findViewById(R.id.textView5);
        TextView t3 = findViewById(R.id.textView6);
        TextView t4 = findViewById(R.id.textView11);
        TextView t5 = findViewById(R.id.textView7);
        TextView t6 = findViewById(R.id.textView8);
        AtomicInteger victo = new AtomicInteger();
        if (palabraSeleccionada.equals("REDES")) {
            ImageView palito = findViewById(R.id.imageView15);
            palito.setVisibility(View.INVISIBLE);
            victo.set(4);
            a.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            b.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            c.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            d.setOnClickListener(view -> {
                t3.setText("D");
                t3.setVisibility(View.VISIBLE);
                d.setEnabled(false);
                victo.set(victo.get() - 1);
                if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            e.setOnClickListener(view -> {
                t2.setText("E");
                t2.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t4.setText("E");
                e.setEnabled(false);
                victo.set(victo.get() - 1);
                if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            f.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            g.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            h.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            i.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            j.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            k.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            l.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            m.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            n.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            o.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            p.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            q.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            r.setOnClickListener(view -> {
                t1.setText("R");
                t1.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                r.setEnabled(false);
                if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            s.setOnClickListener(view -> {
                t5.setText("S");
                t5.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                s.setEnabled(false);
                if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            t.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            u.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            v.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            w.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            x.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            y.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            z.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });

        }
        else if (palabraSeleccionada.equals("PROPA")) {
            ImageView palito = findViewById(R.id.imageView15);
            palito.setVisibility(View.INVISIBLE);
            victo.set(4);
            a.setOnClickListener(view -> {
                t5.setText("A");
                t5.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                a.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            b.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            c.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            d.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            e.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            f.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            g.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            h.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
                if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            i.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            j.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();
                }
            });
            k.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            l.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            m.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            n.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            o.setOnClickListener(view -> {
                t3.setText("O");
                t3.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                o.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            p.setOnClickListener(view -> {
                t1.setText("P");
                t1.setVisibility(View.VISIBLE);
                t4.setText("P");
                t4.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                p.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            q.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            r.setOnClickListener(view -> {
                t2.setText("R");
                t2.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                r.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            s.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            t.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            u.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            v.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            w.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            x.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            y.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            z.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
        } else if (palabraSeleccionada.equals("PUCP")) {
            ImageView palito = findViewById(R.id.imageView15);
            palito.setVisibility(View.INVISIBLE);
            ImageView palito1 = findViewById(R.id.imageView11);
            palito1.setVisibility(View.INVISIBLE);
            victo.set(3);
            a.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            b.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}

            });
            c.setOnClickListener(view -> {
                t4.setText("C");
                t4.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                c.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            d.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            e.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            f.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            g.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}

            });
            h.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            i.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            j.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            k.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            l.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            m.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            n.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            o.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            p.setOnClickListener(view -> {
                t2.setText("P");
                t2.setVisibility(View.VISIBLE);
                t5.setText("P");
                t5.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                p.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            q.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            r.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            s.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            t.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            u.setOnClickListener(view -> {
                t3.setText("U");
                t3.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                u.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            v.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            w.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            x.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            y.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            z.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
        } else if (palabraSeleccionada.equals("TELITO")) {
            victo.set(5);
            a.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            b.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            c.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            d.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            e.setOnClickListener(view -> {
                t2.setText("E");
                t2.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                e.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            f.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            g.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            h.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            i.setOnClickListener(view -> {
                t4.setText("I");
                t4.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                i.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            j.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            k.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            l.setOnClickListener(view -> {
                t3.setText("L");
                t3.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                l.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            m.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}

            });
            n.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            o.setOnClickListener(view -> {
                t6.setText("O");
                t6.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                o.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            p.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            q.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            r.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            s.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            t.setOnClickListener(view -> {
                t1.setText("T");
                t1.setVisibility(View.VISIBLE);
                t5.setText("T");
                t5.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                t.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            u.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            v.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            w.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            x.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            y.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            z.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
        } else if (palabraSeleccionada.equals("TELECO")) {
            victo.set(5);
            a.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            b.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            c.setOnClickListener(view -> {
                t5.setText("C");
                t5.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                c.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            d.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            e.setOnClickListener(view -> {
                t2.setText("E");
                t2.setVisibility(View.VISIBLE);
                t4.setText("E");
                t4.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                e.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            f.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            g.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();
            });
            h.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            i.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            j.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            k.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            l.setOnClickListener(view -> {
                t3.setText("L");
                t3.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                l.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            m.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            n.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            o.setOnClickListener(view -> {
                t6.setText("O");
                t6.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                o.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            p.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            q.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            r.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            s.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            t.setOnClickListener(view -> {
                t1.setText("T");
                t1.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                t.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            u.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            v.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            w.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            x.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            y.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            z.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });

        } else {
            victo.set(4);
            ImageView palito = findViewById(R.id.imageView15);
            palito.setVisibility(View.INVISIBLE);
            ImageView palito1 = findViewById(R.id.imageView11);
            palito1.setVisibility(View.INVISIBLE);
            a.setOnClickListener(view -> {
                t3.setText("A");
                t3.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                a.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            b.setOnClickListener(view -> {
                t2.setText("B");
                t2.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                b.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            c.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            d.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            e.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            f.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            g.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            h.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            i.setOnClickListener(view -> {
                t5.setText("I");
                t5.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                i.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            j.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            k.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            l.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            m.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            n.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            o.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            p.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            q.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            r.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            s.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            t.setOnClickListener(view -> {
                t4.setText("T");
                t4.setVisibility(View.VISIBLE);
                victo.set(victo.get() - 1);
                t.setEnabled(false);if (victo.get() == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    LocalDateTime fin = LocalDateTime.now();
                    Duration duracion = Duration.between(inicio, fin);
                    long segundosTranscurridos = duracion.getSeconds();
                    textView.setText("Ganaste / Termino en " + (int) segundosTranscurridos + "s");
                    inhabilitar();
                }
            });
            u.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            v.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            w.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            x.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            y.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
            z.setOnClickListener(view -> {
                intentosRestantes = intentosRestantes - 1;
                colgar();if (intentosRestantes == 0) {
                    TextView textView = findViewById(R.id.textView10);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("GG!!!!");
                    inhabilitar();}
            });
        }
        ImageView regreso = findViewById(R.id.imageView16);
        regreso.setOnClickListener(view -> {
            finish();
        });
    }


    public void colgar(){
        ImageView cabeza = findViewById(R.id.imageView5);
        ImageView brazod = findViewById(R.id.imageView7);
        ImageView brazoi = findViewById(R.id.imageView8);
        ImageView tronco = findViewById(R.id.imageView6);
        ImageView piei = findViewById(R.id.imageView10);
        ImageView pied = findViewById(R.id.imageView9);
        if(intentosRestantes == 5){
            cabeza.setVisibility(View.VISIBLE);
        } else if (intentosRestantes == 4) {
            tronco.setVisibility(View.VISIBLE);
        } else if (intentosRestantes == 3) {
            brazod.setVisibility(View.VISIBLE);
        } else if (intentosRestantes == 2) {
            brazoi.setVisibility(View.VISIBLE);
        } else if (intentosRestantes == 1) {
            piei.setVisibility(View.VISIBLE);
        }else {
            pied.setVisibility(View.VISIBLE);
        }
    }

    public void inhabilitar(){
        Button a = findViewById(R.id.buttonA);
        Button b = findViewById(R.id.buttonB);
        Button c = findViewById(R.id.buttonC);
        Button d = findViewById(R.id.buttonD);
        Button e = findViewById(R.id.buttonE);
        Button f = findViewById(R.id.buttonF);
        Button g = findViewById(R.id.buttonG);
        Button h = findViewById(R.id.buttonH);
        Button i = findViewById(R.id.buttonI);
        Button j = findViewById(R.id.buttonJ);
        Button k = findViewById(R.id.buttonK);
        Button l = findViewById(R.id.buttonL);
        Button m = findViewById(R.id.buttonM);
        Button n = findViewById(R.id.buttonN);
        Button o = findViewById(R.id.buttonO);
        Button p = findViewById(R.id.buttonP);
        Button q = findViewById(R.id.buttonQ);
        Button r = findViewById(R.id.buttonR);
        Button s = findViewById(R.id.buttonS);
        Button t = findViewById(R.id.buttonT);
        Button u = findViewById(R.id.buttonU);
        Button v = findViewById(R.id.buttonV);
        Button w = findViewById(R.id.buttonW);
        Button x = findViewById(R.id.buttonX);
        Button y = findViewById(R.id.buttonY);
        Button z = findViewById(R.id.buttonZ);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        g.setEnabled(false);
        h.setEnabled(false);
        i.setEnabled(false);
        j.setEnabled(false);
        k.setEnabled(false);
        l.setEnabled(false);
        m.setEnabled(false);
        n.setEnabled(false);
        o.setEnabled(false);
        p.setEnabled(false);
        q.setEnabled(false);
        r.setEnabled(false);
        s.setEnabled(false);
        t.setEnabled(false);
        u.setEnabled(false);
        v.setEnabled(false);
        w.setEnabled(false);
        x.setEnabled(false);
        y.setEnabled(false);
        z.setEnabled(false);
    }








}