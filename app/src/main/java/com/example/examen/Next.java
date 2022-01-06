package com.example.examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Next extends AppCompatActivity implements View.OnClickListener {
    private TextView tx3;
    private Button btn2;
    private String login;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);
        tx3=findViewById(R.id.txt);
        login=getIntent().getStringExtra("login");
        tx3.setText("Bienvenue , votre login est "+login);
        btn2=findViewById(R.id.button);


        }
        @Override
    public void onClick(View v){
        Intent i=new Intent(Next.this,MainActivity.class);

        startActivity(i);
        }








        }





