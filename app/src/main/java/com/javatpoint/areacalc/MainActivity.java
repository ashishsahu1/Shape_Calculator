package com.javatpoint.areacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void squareArea(View view){
        //communication using intent, to open another another activity

        Intent sqintent=new Intent(this,SquareArea.class);
        startActivity(sqintent);

    }

    public void circleArea(View view){
        //communication using intent, to open another another activity

        Intent crintent=new Intent(this,CircleArea.class);
        startActivity(crintent);

    }

    public void triangleArea(View view){
        //communication using intent, to open another another activity

        Intent trintent=new Intent(this,TriangleArea.class);
        startActivity(trintent);

    }

    public void cubeArea(View view){
        //communication using intent, to open another another activity

        Intent cbintent=new Intent(this,CubeArea.class);
        startActivity(cbintent);

    }

    public void cylinderArea(View view){
        //communication using intent, to open another another activity

        Intent cyintent=new Intent(this,CylinderArea.class);
        startActivity(cyintent);

    }

    public void sphereArea(View view){
        //communication using intent, to open another another activity

        Intent spintent=new Intent(this,SphereArea.class);
        startActivity(spintent);

    }

}
