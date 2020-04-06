package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        final String admin = "admin";
        final int passwordnya = 123;
        final EditText Username,Password;
        Username = findViewById(R.id.editUN);
        Password = findViewById(R.id.editPassword);
        btn = findViewById(R.id.btnDaftar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Username.equals(admin)&&Password.equals(passwordnya))
                {
                    Intent GMenu = new Intent(getApplicationContext(),MainMenu.class);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Username dan Password Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
