package com.example.my_semester_homework;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.text.DecimalFormat;

public class SubActivity8 extends AppCompatActivity {

    private EditText editText1;
    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView result5;
    private TextView result6;

    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private CheckBox check4;
    private CheckBox check5;

    private CheckBox check6;
    private CheckBox check7;
    private CheckBox check8;

    private double value;
    private double tariff;
    private double progressive;
    private double amount;

    private double progressive2;
    private double amount2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //뒤로가기 버튼 생성
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        editText1 = (EditText) findViewById(R.id.editText1);
        //editText1.addTextChangedListener(new CustomTextWatcher(editText1));

        check1 = (CheckBox) findViewById(R.id.check1);
        check2 = (CheckBox) findViewById(R.id.check2);
        check3 = (CheckBox) findViewById(R.id.check3);
        check4 = (CheckBox) findViewById(R.id.check4);
        check5 = (CheckBox) findViewById(R.id.check5);

        check6 = (CheckBox) findViewById(R.id.check6);
        check7 = (CheckBox) findViewById(R.id.check7);
        check8 = (CheckBox) findViewById(R.id.check8);


        result1 = (TextView) findViewById(R.id.result1);
        result2 = (TextView) findViewById(R.id.result2);
        result3 = (TextView) findViewById(R.id.result3);
        result4 = (TextView) findViewById(R.id.result4);
        result5 = (TextView) findViewById(R.id.result5);
        result6 = (TextView) findViewById(R.id.result6);



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            //뒤로가기 버튼 눌렀을 때, 발동.
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


    public void set_text(View view) {
        value = 0;
        tariff = 0;
        progressive = 0;
        amount = 0;

        value += Double.parseDouble(editText1.getText().toString());

        if (check1.isChecked()) { if (value > 1500000) value -= 1500000; };
        if (check2.isChecked()) { if (value > 1500000) value -= 1500000; };
        if (check3.isChecked()) { if (value > 1500000) value -= 1500000; };
        if (check4.isChecked()) { if (value > 1000000) value -= 1000000; };
        if (check5.isChecked()) { if (value > 2000000) value -= 2000000; };

        //세 자리마다 콤마를 찍고, 소수점을 0범위까지 표시.
        result1.setText("과세표준: " + String.format("%,.0f", value)+ "원");

        if (value <= 12000000) { tariff = 6; }
        else if (value > 12000000 && value <= 46000000) { tariff = 15; progressive=1260000; }
        else if (value > 46000000 && value <= 88000000) { tariff = 24; progressive=5760000; }
        else if (value > 88000000 && value <= 150000000) { tariff = 35; progressive=15440000; }
        else if (value > 150000000 && value <= 300000000) { tariff = 38; progressive=19940000; }
        else if (value > 300000000 && value <= 500000000) { tariff = 40; progressive=25940000;}
        else if (value > 500000000 && value <= 1000000000) { tariff = 42; progressive=35940000; }
        else if (value > 1000000000) { tariff = 45; progressive=65940000; }
        else {tariff = 0; };

        result2.setText("세율: " + String.format("%.0f", tariff) + "%");

        result3.setText("누진공제: " + String.format("%,.0f", progressive)+ "원");

        amount =  value * (tariff/100);
        amount -= progressive;

        result4.setText("산출세액: " + String.format("%,.0f", amount)+ "원");
    }

    public void set_text2(View view) {
        progressive2 = 0;
        amount2 = 0;

        if (check6.isChecked()) { if (amount > 70000) progressive2 += 70000; };
        if (check7.isChecked()) { if (amount > 300000) progressive2 += 300000; };
        if (check8.isChecked()) { if (amount > 150000) progressive2 += 150000; };

        result5.setText("세액공제: " + String.format("%,.0f", progressive2)+ "원");

        amount2 = amount;
        amount2 -= progressive2;

        result6.setText("종합소득세: " + String.format("%,.0f", amount2)+ "원");

    }
}
