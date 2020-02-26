package com.example.seccion_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      btn=(Button) findViewById(R.id.buttonMain);//hacemos un cast para poder acceder a los metodos cada vez que haga click deberia hacer al go
      btn.setOnClickListener(new View.OnClickListener() {// metodo on click que se está sobreescribiendo//
          @Override
          public void onClick(View v) {
              Toast.makeText(MainActivity.this,"button clicked",Toast.LENGTH_LONG).show();

          }
      });
    }



}
