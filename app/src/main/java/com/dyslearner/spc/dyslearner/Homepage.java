package com.dyslearner.spc.dyslearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Homepage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button EngButton = (Button) findViewById(R.id.eng);

        EngButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Homepage.this, English.class));
            }
        });

        Button ChiButton = (Button) findViewById(R.id.chi);

        ChiButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Homepage.this, Chinese.class));
            }
        });
    }

}
