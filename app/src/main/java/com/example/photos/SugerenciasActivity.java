package com.example.photos;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SugerenciasActivity extends AppCompatActivity {
    Button btnBack6,btnConf6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sugerencias);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnBack6 = (Button) findViewById(R.id.btnBackSugC);
        btnConf6 = (Button) findViewById(R.id.btnConfSugC);

        btnBack6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigActivity = new Intent(SugerenciasActivity.this, ConfigurationActivity.class );
                startActivity(ConfigActivity);
            }
        });

        btnConf6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigActivity = new Intent(SugerenciasActivity.this, ConfigurationActivity.class);
                startActivity(ConfigActivity);
            }
        });
    }
}