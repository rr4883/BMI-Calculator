package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText a,b,c;
        Button but;
        TextView fin;

        a=findViewById(R.id.in1);
        b=findViewById(R.id.in2);
        c=findViewById(R.id.in3);
        but=findViewById(R.id.in4);
        fin=findViewById(R.id.in5);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ft=Integer.parseInt(a.getText().toString());
                int in=Integer.parseInt(b.getText().toString());
                int wt=Integer.parseInt(c.getText().toString());
                int totalin=ft*12+in;
                double totalcm = totalin*2.53;
                double totalm=totalcm/100;

                double bmi=wt/(totalm*totalm);

                if(bmi>25){
                    fin.setText("YOU ARE OVERWEIGHT");
                }
                else if(bmi<18){
                    fin.setText("YOU ARE UNDERWEIGHT");
                }
                else{
                    fin.setText("YOU ARE HEALTHY");
                }
            }
        });


    }
}
