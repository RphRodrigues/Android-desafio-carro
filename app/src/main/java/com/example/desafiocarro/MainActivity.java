package com.example.desafiocarro;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Carro carro = null;

    private EditText nomeCarro;
    private EditText marcaCarro;
    private EditText modeloCarro;
    private EditText anoCarro;
    private Button btnCriarCarro;
    private Button btnAcelerar;
    private Button btnFrear;

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private TextView tv9;
    private TextView tv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeCarro = findViewById(R.id.edtNomeId);
        marcaCarro = findViewById(R.id.edtMarcaId);
        modeloCarro = findViewById(R.id.edtModeloId);
        anoCarro = findViewById(R.id.edtAnoId);
        btnCriarCarro = findViewById(R.id.criaCarroId);
        btnAcelerar = findViewById(R.id.acelerarId);
        btnFrear = findViewById(R.id.frearId);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);

        btnCriarCarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nomeCarro.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Insira o nome", Toast.LENGTH_SHORT).show();
                    return;
                } else if (marcaCarro.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Insira a marca", Toast.LENGTH_SHORT).show();
                    return;
                } else if (modeloCarro.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Insira o modelo", Toast.LENGTH_SHORT).show();
                    return;
                } else if (anoCarro.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Insira o ano", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (carro == null) {
                    carro = new Carro();

                    carro.setName(nomeCarro.getText().toString());
                    carro.setMarca(marcaCarro.getText().toString());
                    carro.setModelo(modeloCarro.getText().toString());

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Parabéns")
                            .setMessage("Você obteve um " + carro.getMarca() + " do modelo " + carro.getModelo())
                            .setPositiveButton("OK", null)
                            .create()
                            .show();
                } else {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Aviso")
                            .setMessage("O carro já existe")
                            .setPositiveButton("OK", null)
                            .create()
                            .show();
                }
            }
        });

        btnAcelerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (carro != null) {
                    carro.acelerar();
                    if (carro.getVelocidade() <= 10) {
                        tv1.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 20) {
                        tv2.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 30) {
                        tv3.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 40) {
                        tv4.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 50) {
                        tv5.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 60) {
                        tv6.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 70) {
                        tv7.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 80) {
                        tv8.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 90) {
                        tv9.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    } else if (carro.getVelocidade() <= 100) {
                        tv10.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.DodgerBlue));
                    }

                } else {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Aviso")
                            .setMessage("Crie um carro")
                            .setPositiveButton("OK", null)
                            .create()
                            .show();
                }
            }
        });


        btnFrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (carro != null) {
                    carro.frear();
                    if (carro.getVelocidade() >= 90) {
                        tv10.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 80) {
                        tv9.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 70) {
                        tv8.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 60) {
                        tv7.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 50) {
                        tv6.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 40) {
                        tv5.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 30) {
                        tv4.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 20) {
                        tv3.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 10) {
                        tv2.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    } else if (carro.getVelocidade() >= 0) {
                        tv1.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.branco));
                    }
                } else {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Aviso")
                            .setMessage("Crie um carro")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .create()
                            .show();
                }
            }
        });
    }
}
