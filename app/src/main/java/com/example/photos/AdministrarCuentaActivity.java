package com.example.photos;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdministrarCuentaActivity extends AppCompatActivity {
    Button btnBack5,btnConf5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_administrar_cuenta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnBack5 = (Button) findViewById(R.id.btnBackAdmC);
        btnConf5 = (Button) findViewById(R.id.btnConfAdmC);

        btnBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigActivity = new Intent(AdministrarCuentaActivity.this, ConfigurationActivity.class );
                startActivity(ConfigActivity);
            }
        });

        btnConf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigActivity = new Intent(AdministrarCuentaActivity.this, ConfigurationActivity.class);
                startActivity(ConfigActivity);
            }
        });
    }
}