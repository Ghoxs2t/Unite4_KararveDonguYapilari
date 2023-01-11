package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
EditText number;
Button button;
TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    number = findViewById(R.id.editTextNumber_Ay);
    button = findViewById(R.id.button_Onayla);
    textView = findViewById(R.id.textView_Ay);
    }
public void onayla(View view){
        int sayiAy =Integer.parseInt(number.getText().toString());
        String ay="";
        number.setText("");
        switch (sayiAy) {
            case 1:
                ay = "OCAK";
                break;
            case 2:
                ay = "ŞUBAT";
                break;
            case 3:
                ay = "MART";
                break;
            case 4:
                ay = "NİSAN";
                break;
            case 5:
                ay = "MAYIS";
                break;
            case 6:
                ay = "HAZİRAN";
                break;
            case 7:
                ay = "TEMMUZ";
                break;
            case 8:
                ay = "AĞUSTOS";
                break;
            case 9:
                ay = "EYLÜL";
                break;
            case 10:
                ay = "EKİM";
                break;
            case 11:
                ay = "KASIM";
                break;
            case 12:
                ay = "ARALIK";
                break;
        }
        textView.setText(ay);
        }
}
