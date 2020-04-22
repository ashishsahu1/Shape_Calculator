package com.javatpoint.areacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SphereArea extends AppCompatActivity {
    EditText t1;
    TextView area,per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_area);
    }

    public  void dev(View view)
    {
        Intent i=new Intent(this,Dev.class);
        startActivity(i);
    }

    public void calc(View View)
    {
        t1=(EditText)findViewById(R.id.editText4);
        area=(TextView)findViewById(R.id.AreaAns);
        per=(TextView)findViewById(R.id.textView8);

        double x=Double.parseDouble(t1.getText().toString());
        area.setText(Double.toString(4*3.14*x*x));
        per.setText(Double.toString(2*3.14*x));
    }
}
