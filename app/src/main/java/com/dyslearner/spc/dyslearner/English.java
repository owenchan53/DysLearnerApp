package com.dyslearner.spc.dyslearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        Button preprimer = (Button) findViewById(R.id.preprimer);

        preprimer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(English.this, Preprimer.class));
            }
        });
    }
}
