package com.example.android_tut_12;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class OpenedClass extends Activity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    TextView question,test;
    Button returnData;

    RadioGroup selectionList;

    String gotBread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send);
        initializer();
        //do after initializer
        Bundle gotBasket = getIntent().getExtras();

        //passing reference
        gotBread = gotBasket.getString("key");
        question.setText(gotBread);
    }

    private void initializer() {

        question = (TextView) findViewById(R.id.tvQuestion);
        test = (TextView) findViewById(R.id.tvText);
        returnData = (Button) findViewById(R.id.bReturn);
        returnData.setOnClickListener(this);
        selectionList = (RadioGroup) findViewById(R.id.rgAnswer);

        //if any radio button is clicked this method will run
        selectionList.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View view) {

    }

    //for radioGroup

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        switch (i){

            case R.id.rCrazy:

                break;

            case R.id.rCoder:

                break;

            case R.id.rBoth:

                break;

        }

    }
}
