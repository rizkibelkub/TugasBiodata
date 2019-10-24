package com.example.appbiodata;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_bio extends Activity {

    TextView tampilData;
    public static String EXTRA_DATA = "extra_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        tampilData = (TextView)findViewById(R.id.tampil);
        bioku tampung = getIntent().getParcelableExtra(EXTRA_DATA);
        String text = "NIM : "+tampung.getNim()+" Nama : "+tampung.getNama()+" Kelas : "+tampung.getKelas()+
                " Tanggal Lahir : "+tampung.getTanggal();
        tampilData.setText(text);

    }
}
