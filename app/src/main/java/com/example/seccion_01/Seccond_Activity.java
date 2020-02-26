package com.example.seccion_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Seccond_Activity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccond_);
        textView=(TextView)findViewById(R.id.textViewMain);
        //tomar los datos del intent//
        Bundle bundle= getIntent().getExtras();
        if (bundle!=null){
            String greeter = bundle.getString("greeter");
            Toast.makeText(Seccond_Activity.this,greeter,Toast.LENGTH_LONG).show();
            textView.setText(greeter);
        }else{
            Toast.makeText(Seccond_Activity.this,"esta vacio man",Toast.LENGTH_LONG).show();
        }
    }
}
