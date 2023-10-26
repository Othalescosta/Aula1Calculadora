package br.ulbra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText editNumero1, editNumero2;
    TextView txtResultado;
    Button btnSoma, btnSub, btnDiv, btnMulti;
    double v1, v2, soma, sub, div, multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumero1 = (EditText) findViewById(R.id.editNumero1);
        editNumero2 = (EditText) findViewById(R.id.editNumero2);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMulti = (Button) findViewById(R.id.btnMulti);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                soma = v1 + v2;
                txtResultado.setText("Resultado: " + soma);
            }

        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                sub = v1 - v2;
                txtResultado.setText("Resultado: " + sub);
            }

        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                multi = v1 * v2;
                txtResultado.setText("Resultado: " + multi);
            }

        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                div = v1 / v2;
                txtResultado.setText("Resultado: " + div);
            }

    });
    }
}




