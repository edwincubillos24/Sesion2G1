package com.edwinacubillos.sesion2g1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eCorreo, eNombre;
 //   Button bGuardar;
    CheckBox cCine, cNadar, cGym;
    String nombre, correo, data="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eCorreo = findViewById(R.id.eCorreo);
        eNombre = findViewById(R.id.eNombre);
        cCine = findViewById(R.id.cCine);
        cNadar = findViewById(R.id.cNadar);
        cGym = findViewById(R.id.cGym);

   /*     bGuardar = findViewById(R.id.bGuardar);

        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = eNombre.getText().toString();
                eCorreo.setText(nombre);
            }
        });*/
    }

    public void guardar(View view) {

        int id = view.getId();

        if (id == R.id.bGuardar) {
            data = data + eNombre.getText().toString();
            eCorreo.setText(data);
        }
    }
//Metodo de los radioButton
    public void onRadioButtonClicked(View view) {

        int id = view.getId();

        if (id == R.id.rMasculino){
            data = data  + " sexo: Masculino";
        } else {
            data = data  + " sexo: Femenino";
        }
    }

    //metodo para los CheckBox
    public void onCheckBoxClicked(View view) {
        int id = view.getId();

        switch (id){
            case R.id.cCine:
                if (cCine.isChecked()) {
                    data = data + " pasatiempo: cine";
            }
                break;
        }
    }
}
