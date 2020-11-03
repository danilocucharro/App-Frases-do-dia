package com.dcucharro.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas acima de tudo, seja você sempre.",
                "A persistência é o caminho do êxito.",
                "Nem todos os dias são bons, mas há algo bom em cada dia.",
                "A mudança que você quer está na decisão que você toma.",
                "A forma que você decide enxergar as coisas faz toda a diferença.",
                "Você nunca encontrará um arco-íris se estiver olhando para baixo.",
                "Ao amanhecer, todas as confusões de ontem são coisas do passado. Hoje inicia-se um novo dia, um dia que nunca existiu."
        };

        int numero = new Random().nextInt(7);

        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frases[numero]);

    }

}