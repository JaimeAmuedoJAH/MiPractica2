package com.jah.mipractica2;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity extends AppCompatActivity {

    SwitchCompat swOscuro;
    EditText txtNombre, txtApellidos, txtEdad;
    ImageButton imgBtnBorrar, imgBtnMostrar;
    TextView txtResultado, lblNombre, lblApellido, lblEdad;
    View layoutMain;
    Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        swOscuro = findViewById(R.id.swOscuro);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellidos = findViewById(R.id.txtApellidos);
        txtEdad = findViewById(R.id.txtEdad);
        imgBtnBorrar = findViewById(R.id.imgBtnBorrar);
        imgBtnMostrar = findViewById(R.id.imgBtnMostrar);
        txtResultado = findViewById(R.id.txtResultado);
        lblNombre = findViewById(R.id.lblNombre);
        lblApellido = findViewById(R.id.lblApellido);
        lblEdad = findViewById(R.id.lblEdad);
        layoutMain = findViewById(R.id.layoutMain);
        btnSalir = findViewById(R.id.btnSalir);

        txtNombre.requestFocus();

        imgBtnBorrar.setOnClickListener(view -> borrarContenido());
        imgBtnMostrar.setOnClickListener(view -> mostrarContenido());
        btnSalir.setOnClickListener(view -> salir());
        swOscuro.setOnCheckedChangeListener((compoundButton, checked) -> modoOsucro(checked));
    }

    private void modoOsucro(Boolean checked) {
        if(checked){
            layoutMain.setBackgroundColor(Color.BLACK);
            lblNombre.setTextColor(Color.WHITE);
            lblApellido.setTextColor(Color.WHITE);
            lblEdad.setTextColor(Color.WHITE);
            txtResultado.setTextColor(Color.WHITE);
            txtResultado.setHintTextColor(Color.WHITE);
            txtNombre.setTextColor(Color.WHITE);
            txtNombre.setHintTextColor(Color.WHITE);
            txtApellidos.setTextColor(Color.WHITE);
            txtApellidos.setHintTextColor(Color.WHITE);
            txtEdad.setTextColor(Color.WHITE);
            txtEdad.setHintTextColor(Color.WHITE);
            swOscuro.setTextColor(Color.WHITE);
        }else{
            layoutMain.setBackgroundColor(Color.WHITE);
            lblNombre.setTextColor(Color.BLACK);
            lblApellido.setTextColor(Color.BLACK);
            lblEdad.setTextColor(Color.BLACK);
            txtResultado.setTextColor(Color.BLACK);
            txtResultado.setHintTextColor(Color.BLACK);
            txtNombre.setTextColor(Color.BLACK);
            txtNombre.setHintTextColor(Color.BLACK);
            txtApellidos.setTextColor(Color.BLACK);
            txtApellidos.setHintTextColor(Color.BLACK);
            txtEdad.setTextColor(Color.BLACK);
            txtEdad.setHintTextColor(Color.BLACK);
            swOscuro.setTextColor(Color.BLACK);
        }

    }

    private void mostrarContenido() {
        String str = "Tu nombre es " + txtNombre.getText() + " " + txtApellidos.getText() + " y tu edad es " + txtEdad.getText();
        txtResultado.setText(str);
    }

    private void borrarContenido() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        txtResultado.setText("");
    }

    private void salir() {
        finishAffinity();
    }
}