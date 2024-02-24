package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText tomateCantidad, cebollaCantidad;
    TextView precioTotal;

    int precioTomate = 500;
    int precioCebolla = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton backButton = findViewById(R.id.imageBackButton);
        TextView nombreUsuario = findViewById(R.id.nombreUsuario);
        tomateCantidad = findViewById(R.id.tomateCantidad);
        cebollaCantidad = findViewById(R.id.cebollaCantidad);
        precioTotal = findViewById(R.id.precioTotal);
        Button calcularButton = findViewById(R.id.button);

        backButton.setOnClickListener(v -> finish());
        calcularButton.setOnClickListener(v -> mostrarTotal());

        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");

        nombreUsuario.setText(nombre + " " + apellido);
    }

    private void mostrarTotal() {
        int cantidadTomate = Integer.parseInt(tomateCantidad.getText().toString());
        int totalTomate = cantidadTomate * precioTomate;

        int cantidadCebolla = Integer.parseInt(cebollaCantidad.getText().toString());
        int totalCebolla = cantidadCebolla * precioCebolla;

        int total = calcularTotal(totalTomate, totalCebolla);

        precioTotal.setText(String.valueOf(total));
    }

    public static int calcularTotal(int totalTomate, int totalCebolla) {
        return totalTomate + totalCebolla;
    }
}
