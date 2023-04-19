package com.marcelotinoco.aabrcombustivelideal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private EditText editPrecoGas;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        editPrecoGas = findViewById(R.id.editGas);
        textResultado = findViewById(R.id.textResultado);
        Button b = (Button) findViewById(R.id.calcular);

    }

    public void calcularPreco(View view){

        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());
        Double precoGas = Double.parseDouble(editPrecoGas.getText().toString());
        Double resultado = precoAlcool/precoGasolina;
        Double resultado1 = (precoAlcool/10);
        Double resultado2 = (precoGas/17);
        Double resultado3 = (precoGasolina/10);
        Double resultado4 = (precoGas/12);

        if ((resultado2 < resultado1) && (resultado4 < resultado3) && (precoGas != 0.0D))
        {
            textResultado.setText("UTILIZE GNV");

        }else{
            if (resultado >=0.7){
                textResultado.setText("UTILIZE GASOLINA");
            }else{
                textResultado.setText("UTILIZE ÁLCOOL");
            }
        }
    }
}