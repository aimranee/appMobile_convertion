package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


  EditText text;
  Button btn;

    public void convert(){
        String dollar = text.getText().toString();
        if(dollar.equals("")){
            Toast.makeText(this,"entrez un numero valide ",Toast.LENGTH_SHORT).show();
        }else {
            Double dollars = Double.parseDouble(dollar);
            Double mad = dollars * 10;
                String madS = mad.toString();
                Toast.makeText(this,"Le prix en Dhs est "+madS,Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        text=findViewById(R.id.my_edittext);
        btn=findViewById(R.id.btn_cvrt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
            }
        });

    }

}