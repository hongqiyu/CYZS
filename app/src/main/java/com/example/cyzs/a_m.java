package com.example.cyzs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

public class a_m extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_m);
        ImageButton bu=(ImageButton) findViewById(R.id.imageButton8);
        bu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(a_m.this,a_c.class);
                startActivity(intent);
            }
        });

    }

}