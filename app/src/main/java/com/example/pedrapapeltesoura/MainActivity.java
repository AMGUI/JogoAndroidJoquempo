package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void pedra(View v){
        this.selacao(0);
    }
    public  void papel(View v){
        this.selacao(1);
    }
    public  void tesoura(View v){
        this.selacao(2);

    }

    public void selacao( int tipo){
        int numero = new Random().nextInt(3);
        ImageView img = findViewById(R.id.imgPadrao);
        TextView resultado = findViewById(R.id.resultado);

        switch (numero){
            case  0:
                img.setImageResource(R.drawable.pedra);
                    break;
            case 1:
                img.setImageResource(R.drawable.papel);
                    break;

            case 2:
                img.setImageResource(R.drawable.tesoura);
                     break;
        }

        if(tipo == 0) {
            if (numero == 1) {
                resultado.setText("Voce perdeu");
            } else if (numero == 2) {
                resultado.setText("Voce venceu");
            } else {
                resultado.setText("Empate");
            }
        }

        if(tipo == 1) {
            if (numero == 2) {
                resultado.setText("Voce perdeu");
            } else if (numero == 0) {
                resultado.setText("Voce venceu");
            } else {
                resultado.setText("Empate");
            }
        }

        if(tipo == 2) {
            if (numero == 0) {
                resultado.setText("Voce perdeu");
            } else if (numero == 1) {
                resultado.setText("Voce venceu");
            } else {
                resultado.setText("Empate");
            }
        }

    }

}