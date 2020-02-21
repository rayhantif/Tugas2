package com.example.calculatorapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angkat_pertama, angka_kedua;
    Button tambah, bersihkan;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkat_pertama=(EditText) findViewById(R.id.angka_pertama);
        angka_kedua=(EditText)findViewById(R.id.angka_kedua);
        tambah=(Button)findViewById(R.id.tambah);
        bersihkan=(Button)findViewById(R.id.bersihkan);
        hasil=(TextView)findViewById(R.id.hasil);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkat_pertama.getText().length()>0)&&(angka_kedua.getText().length()>0))
                {
                    double angka1=Double.parseDouble(angkat_pertama.getText().toString());
                    double angka2=Double.parseDouble(angka_kedua.getText().toString());
                    double result=angka1+angka2;
                    hasil.setText(Double.toString(result));
                }
                else
                {
                    Toast toast=Toast.makeText(MainActivity.this, "Mohon Masukan Angka pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
    }

}
