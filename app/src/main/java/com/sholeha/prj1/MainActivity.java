package com.sholeha.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama;
    TextView txtTtl;
    TextView txtHobi;
    TextView txtCita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("sholeha");
        txtTtl = (TextView) findViewById(R.id.txtTtl);
        txtTtl.setText("Segalamider, 28 Mei 1999");
        txtHobi = (TextView) findViewById(R.id.txtHobi);
        txtHobi.setText("Menonton");
        txtCita = (TextView) findViewById(R.id.txtCita);
        txtCita.setText("Sukses dunia akhirat");

    }
}