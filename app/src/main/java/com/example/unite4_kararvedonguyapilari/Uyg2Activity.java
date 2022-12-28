package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {

    EditText editText_sayi1;
    EditText editText_sayi2;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);
        button = findViewById(R.id.button);
        editText_sayi1 = findViewById(R.id.txtKulAdi);
        editText_sayi2 = findViewById(R.id.txt2);

    }

    public void button(View view) {
        int sayi1 = Integer.parseInt(editText_sayi1.getText().toString());
        int sayi2 = Integer.parseInt(editText_sayi2.getText().toString());
        if (sayi1 > sayi2) {
            Toast.makeText(this, "2. Sayı Daha Büyüktür.", Toast.LENGTH_LONG).show();
        }
        if (sayi1 < sayi2) {
            Toast.makeText(this, "2. Sayı Daha Büyüktür.", Toast.LENGTH_LONG).show();

        }

        if (sayi1 == sayi2) {
            Toast.makeText(this, "2. Sayı Daha Büyüktür.", Toast.LENGTH_LONG).show();
        }
    }

}
