package com.oskr.curso.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private Button bSumar;
        private Button bRestar;
        private Button bMultiplicar;
        private Button bDividir;
        private EditText num1;
        private EditText num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        bSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int suma = Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
                showMessage("La suma de los dos numeros es: "+String.valueOf(suma));
            }
        });

        bRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resta = Integer.parseInt(num1.getText().toString())-Integer.parseInt(num2.getText().toString());
                showMessage("La resta numero1 - numero2 es: "+String.valueOf(resta));
                resta = Integer.parseInt(num2.getText().toString())-Integer.parseInt(num1.getText().toString());
                showMessage("La resta numero2 - numero1 es: "+String.valueOf(resta));
            }
        });

        bMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int multiplicaion = Integer.parseInt(num1.getText().toString())*Integer.parseInt(num2.getText().toString());
                showMessage("La multiplicación de los dos numeros es: "+String.valueOf(multiplicaion));
            }
        });

        bDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float division = 0;
                if(!"".equals(num1.getText().toString()) && !"0".equals(num1.getText().toString())){
                    division = Integer.parseInt(num2.getText().toString())/Integer.parseInt(num1.getText().toString());
                    showMessage("La division num2 / num1 es: "+String.valueOf(division));
                }
                if(!"".equals(num2.getText().toString()) && !"0".equals(num2.getText().toString())) {
                    division = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
                    showMessage("La division num1 / num2 es: "+String.valueOf(division));
                }
            }
        });
    }

    private void showMessage(String msj){
        Toast.makeText(MainActivity.this, msj , Toast.LENGTH_SHORT).show();
    }

    private void init(){
        bSumar = (Button) findViewById(R.id.bSumar);
        bRestar = (Button) findViewById(R.id.bRestar);
        bMultiplicar = (Button) findViewById(R.id.bMultiplicar);
        bDividir = (Button) findViewById(R.id.bDividir);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
    }
}
