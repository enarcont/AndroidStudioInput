package com.example.inputdatamahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class data extends AppCompatActivity {
public static String EXTRA_PERSON = "extra_person";
private TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView nim1 = (TextView)findViewById(R.id.tvnim);
        TextView nama1 = (TextView)findViewById(R.id.tvnama);
        TextView kelas1 = (TextView)findViewById(R.id.tvkelas);
        TextView ttl1 = (TextView)findViewById(R.id.tvttl);

        nim1.setText(getIntent().getStringExtra("NIM"));
        nama1.setText(getIntent().getStringExtra("Nama"));
        kelas1.setText(getIntent().getStringExtra("Kelas"));
        ttl1.setText(getIntent().getStringExtra("TTL"));
    }
}
