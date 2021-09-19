package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String proses="";
    public char operator=' ';
    int indexOperator;
    Double hasil=0.0, operan1, operan2;
    TextView lihatHasil,lihatProses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lihatProses = (TextView) findViewById(R.id.proses_id);
        lihatHasil = (TextView) findViewById(R.id.result_id);
    }

    public void startClicked(View view) {
        lihatProses.setText("");
        lihatHasil.setText("");
        proses="";
        operator=' ';
        hasil=0.0;
        operan1=0.0;
        operan2=0.0;
    }

    public void insert(String bil){
        lihatProses.setText(proses+bil);
        proses=proses+bil;
    }

    public void button0(View view) {
        insert("0");
    }
    public void button1(View view) {
        insert("1");
    }

    public void button2(View view) {
        insert("2");
    }

    public void button3(View view) {
        insert("3");
    }
    public void button4(View view) {
        insert("4");
    }
    public void button5(View view) {
        insert("5");
    }
    public void button6(View view) {
        insert("6");
    }
    public void button7(View view) {
        insert("7");
    }
    public void button8(View view){
        insert("8");
    }
    public void button9(View view) {
        insert("9");
    }

    public void buttonPercentage(View view) {
        insert("%");
        operator='%';
    }

    public void buttonDivision(View view) {
        insert(":");
        operator=':';
    }

    public void buttonMultiply(View view) {
        insert("x");
        operator='x';
    }

    public void buttonMinus(View view) {
        insert("-");
        operator='-';
    }

    public void buttonPlus(View view) {
        insert("+");
        operator='+';
    }

    public void buttonPoint(View view) {
        insert(".");
    }

    public void buttonEquals(View view) {
        indexOperator=proses.indexOf(operator);
        operan1=Double.parseDouble(proses.substring(0,indexOperator));
        operan2=Double.parseDouble(proses.substring(indexOperator,proses.length()));
        if(operator=='x'){
            hasil=operan1*operan2;
        }else if(operator=='+'){
            hasil=operan1+operan2;
        }else if(operator=='-'){
            hasil=operan1-operan2;
        }else if(operator==':'){
            hasil=operan1/operan2;
        }else {
            hasil=operan1/100;
        }
        lihatHasil.setText(""+hasil);
    }
    public void buttonBilangan(View view) {
        insert("-");
    }
    public void buttonDelete(View view) {
        lihatProses.setText(proses.substring(0,proses.length()-1));
        proses=lihatProses.getText().toString();
        lihatHasil.setText("");
        hasil=0.0;
    }
}