package com.example.conexionf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText name,materia,calificacion;
    TextView result;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.name);
        materia = (EditText)findViewById(R.id.materia);
        calificacion = (EditText)findViewById(R.id.calificacion);
        result = (TextView)findViewById(R.id.result);
        save = (Button)findViewById(R.id.save);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre = name.getText().toString();
                String mate = materia.getText().toString();
                String cali = calificacion.getText().toString();
                //int numEntero = Integer.parseInt(cali);
                insertarDatos(nombre,mate,cali);

                result.setText("nombre: "+nombre+"mate: "+"cali: "+cali);
            }
        });

    }
    private void insertarDatos(String nombre,String mate,String cali) {



        Notas usuario = new Notas (nombre,mate,cali);
        FirebaseDatabase  mDatabase = FirebaseDatabase.getInstance ();
        DatabaseReference mDatabaseReference =  mDatabase.getReference (). child ("notas");
        mDatabaseReference.setValue (usuario);


    }
}