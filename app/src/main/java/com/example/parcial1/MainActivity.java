package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nombre = findViewById(R.id.nombre);
        EditText apellido = findViewById(R.id.apellido);

        Button nextButton = findViewById(R.id.button);
        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("nombre", nombre.getText().toString());
            intent.putExtra("apellido", apellido.getText().toString());
            startActivity(intent);
        });
    }
}