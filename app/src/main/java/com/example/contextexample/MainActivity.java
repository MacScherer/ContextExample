package com.example.contextexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setTextColor(ContextCompat.getColor(this, com.google.android.material.R.color.design_default_color_error));
    }
    //============================//
    //         CONTEXT            //
    //============================//

    // 1 - Forma de relacionar componente com o APP/sistema
    // 2 - Comunicar com a aplicação
    // 3 - Classe abstrata
    // 4 - Classe ACTIVITY é uma filha de CONTEXT(Casse PAI de todos), só olhar  a bibioteca la em cima ^^
    // 5 - Contexto de atividades
    // 6 - Tudo de interface gráfica e ACTIVITY a gente usa o contexto THIS = "ACTIVITY CONTEXT"

    // 7 - ONDE USAR applicationContext? = "APP CONTEXT"
    // 8 - Somente em contexto de aplicação global durante toda a execussão.
    // 8 - Abrir banco de dados,
    

}
