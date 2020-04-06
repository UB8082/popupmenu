package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.PopupMenu;

import static com.example.exercisemenu.R.layout.mainmenu;

public class MainMenu extends AppCompatActivity {
    TextView Persegi=findViewById(R.id.Persegi);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mainmenu);
    Persegi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            PopupMenu PopPers = new PopupMenu(MainMenu.this,view);
            PopPers.setOnMenuItemClickListener(MainMenu.this);
            PopPers.inflate(R.menu.popupmenu1);
            PopPers.show();
        }
    });
    }


}

public  boolean onMenuItemClick(MenuItem.menuItem){}

