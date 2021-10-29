package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final double PRICE_WITH_TAX = 1.17;

    Button calcBTN;
    TextView lbl;
    EditText edt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcBTN = findViewById(R.id.button_BTN_calculate);
        lbl = findViewById(R.id.main_LBL_totalPrice);
        edt = findViewById(R.id.main_ET_price);

        calcBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcPrice();
            }
        });
    }
    private void calcPrice(){
        String s = edt.getText().toString();
        double d = Double.parseDouble(s);
        d *= PRICE_WITH_TAX;
        lbl.setText(""+d);
    }
}