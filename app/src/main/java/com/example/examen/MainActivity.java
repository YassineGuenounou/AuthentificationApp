package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt1=(TextView) findViewById(R.id.textView2);
        EditText eT1=(EditText) findViewById(R.id.editText1);
        EditText eT2=(EditText) findViewById(R.id.editText2);
        Button btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eT1.getText().toString().length()==0 || eT1.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Veuillez inserer votre login et mot de passe",Toast.LENGTH_SHORT).show();

                } else if (((eT1.getText().toString().compareTo("FSG"))!=0) || (((eT2.getText().toString().compareTo("FSG2021")))!=0)) {
                    Toast.makeText(getApplicationContext(),"Veuillez verifier votre login et mot de passe",Toast.LENGTH_SHORT).show();

                } else if ((eT1.getText().toString().compareTo("FSG")==0) && (eT2.getText().toString().compareTo("FSG2021")==0))

            {
                Intent i = new Intent(MainActivity.this,Next.class);
                i.putExtra("login", eT1.getText().toString());

                startActivity(i);


            }}
        });
    }
}