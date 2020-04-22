package com.javatpoint.areacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SquareArea extends AppCompatActivity {
    EditText t1,t2;
    TextView area,per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_area);

        Intent intent=getIntent();
    }

    public  void dev(View view)
    {
        Intent i=new Intent(this,Dev.class);
        startActivity(i);
    }

    public void cal(View View){
        t1=(EditText)findViewById(R.id.editText4);
        t2=(EditText)findViewById(R.id.editText5);
        area=(TextView)findViewById(R.id.AreaAns);
        per=(TextView)findViewById(R.id.textView8);

        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        area.setText(Integer.toString(x*y));
        per.setText(Integer.toString(x+y));

    }
}
