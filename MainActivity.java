package com.example.biodataiki;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText dknim, dknama, dkkelas, dktanggal;
    Button moving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dknim= (EditText) findViewById(R.id.c_nim);
        dknama = (EditText) findViewById(R.id.c_nama);
        dkkelas = (EditText) findViewById(R.id.c_kelas);
        dktanggal = (EditText) findViewById(R.id.c_tanggal);

        moving = (Button) findViewById(R.id.savedata);
        moving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String dnim = String.valueOf(dknim.getText());
                String dnama = String.valueOf(dknama.getText());
                String dkelas = String.valueOf(dkkelas.getText());
                String dtanggal = String.valueOf(dktanggal.getText());

                bioku tampung = new bioku();
                tampung.setNim(dnim);
                tampung.setNama(dnama);
                tampung.setKelas(dkelas);
                tampung.setTanggal(dtanggal);
                Intent intent = new Intent(MainActivity.this, bio.class);
                intent.putExtra(bio.EXTRA_DATA, tampung);
                startActivity(intent);
            }
        });
    }
}
