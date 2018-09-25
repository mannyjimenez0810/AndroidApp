package com.example.manny.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grab view by id and create a method onclick that happens when you click it
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Log.i("Manny", "Button clicked");

                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        //Button 2 to change background to purple
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.purple));
            }

        });

        //Button 3 to change text
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if(TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Manny");
                }
                else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        //Reset everything
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));

                    findViewById(R.id.rootView).setBackgroundColor(
                            getResources().getColor(R.color.colorAccent));
                    ((TextView) findViewById(R.id.textView))
                            .setText("Hello from Manny");
            }
        });




    }


}
