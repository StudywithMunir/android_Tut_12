package com.example.android_tut_12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Data extends Activity implements View.OnClickListener{

    EditText sendEt;
    Button start,startFor;
    TextView gotAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recieve);
        initialzer();
    }

    private void initialzer() {
        sendEt = (EditText) findViewById(R.id.etSend);
        start = (Button) findViewById(R.id.btnStart);
        startFor =(Button) findViewById(R.id.btnResult);
        gotAnswer = (TextView) findViewById(R.id.tvGot);

        start.setOnClickListener(this);
        startFor.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnStart:

                //passing some data
                String bread = sendEt.getText().toString();

                //bundle is just like a basket
                //bundle is new bundle object
                Bundle basket = new Bundle();


                //value is what we are passing
                //key is reference like a file
                //we labeled the string file as key
                basket.putString("key",bread);

                //Data.this is our current class
                //OpenedClass.class is destination Class
                Intent a = new Intent(Data.this,OpenedClass.class);

                //setting basket within our Intent  and passing some extras i.e adding something
                a.putExtras(basket);

                startActivity(a);

                break;

            case R.id.btnResult:



                break;
        }

    }
}
