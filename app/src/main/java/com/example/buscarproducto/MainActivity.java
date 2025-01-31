package com.example.buscarproducto;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

     EditText txtProducto;
     Spinner spinnerCategoria;
     Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        txtProducto = findViewById(R.id.txtProducto);
        spinnerCategoria = findViewById(R.id.spinnerCategoria);
        btnBuscar = findViewById(R.id.btnBuscar);

        // Configurar el Spinner con las categorías
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                new String[]{"Electrónica", "Ropa", "Hogar"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategoria.setAdapter(adapter);

        // Configurar el clic del botón "Buscar"
        btnBuscar.setOnClickListener(v -> {

                // Obtener el nombre del producto y la categoría seleccionada
                String nombreProducto = txtProducto.getText().toString();
                String categoria = spinnerCategoria.getSelectedItem().toString();

                // Mostrar un Toast con la información
                String mensaje = "Buscando: " + nombreProducto + "\nCategoría: " + categoria;
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_LONG).show();

        });
    }
}