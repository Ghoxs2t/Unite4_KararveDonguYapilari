package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Avtivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);

    }

    @Override
    protected void onResume() {
        super.onResume();
        for (int i=1;i<=50;i++){
            System.out.println(i);
        }
    }
}
