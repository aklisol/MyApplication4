package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText enternumber1,enternumber2;
    TextView result;
    String s1,s2;
    Float f1,f2;
    Integer percent;
    Button Calc;
    //this new


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enternumber1=(EditText)findViewById(R.id.editText);
        enternumber2=(EditText)findViewById(R.id.editText2);
        result=(TextView)findViewById(R.id.textView);
        Calc=(Button)findViewById(R.id.button);
        Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=enternumber1.getText().toString();
                s2=enternumber2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                percent=Math.round(f1/100*f2);
                result.setText(percent.toString());
            }
        });
    }
}
