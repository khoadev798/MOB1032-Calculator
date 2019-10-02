package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNum = null;
    private Button one= null;
    private Button two= null;
    private Button three= null;
    private Button four= null;
    private Button five= null;
    private Button six= null;
    private Button seven= null;
    private Button eight= null;
    private Button nine= null;
    private Button plus= null;
    private Button subtract= null;
    private Button multi= null;
    private Button divi= null;
    private Button deci= null;
    private Button zero= null;
    private Button dblZero= null;
    private Button equal= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapComp();
    }
    private void mapComp(){
        if(txtNum == null)
            txtNum = findViewById(R.id.txtNum);
        if(one==null)
            one=findViewById(R.id.one);
        if(two==null)
            two=findViewById(R.id.two);
        if(three==null)
            three=findViewById(R.id.three);
        if(four==null)
            four =findViewById(R.id.four);
        if(five==null)
            five=findViewById(R.id.five);
        if(six==null)
            six=findViewById(R.id.six);
        if(seven==null)
            seven=findViewById(R.id.seven);
        if(eight==null)
            eight=findViewById(R.id.eight);
        if(nine==null)
            nine=findViewById(R.id.nine);
        if(plus==null)
            plus=findViewById(R.id.plus);
        if(subtract==null)
            subtract=findViewById(R.id.subtract);
        if(multi==null)
            multi=findViewById(R.id.multi);
        if(divi==null)
            divi=findViewById(R.id.divi);
        if(zero==null)
            zero=findViewById(R.id.zero);
        if(dblZero==null)
            dblZero=findViewById(R.id.dblZero);
        if(deci==null)
            deci=findViewById(R.id.deci);
        if(equal==null)
            equal=findViewById(R.id.equal);
    }
}
