package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    EditText txtKulAdi, txtSifre;

    final String kullaniciAdi = "Ekrem";
    final String sifre = "123";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);

        txtKulAdi = findViewById(R.id.txtKulAdi);
        txtSifre = findViewById(R.id.txtSifre);
    }


    public void button(View view) {
        String kuladi = txtKulAdi.getText().toString();
        String sifre = txtSifre.getText().toString();

        if (kullaniciAdi.equals(kuladi) && sifre.equals(sifre)) {
            Toast.makeText(this, "Giriş Başarılı", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "BAŞARISIZ", Toast.LENGTH_LONG).show();
        }
    }
}
