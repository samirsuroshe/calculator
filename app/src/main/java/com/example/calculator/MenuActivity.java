package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
        TextView optionMenu, contextMenu;
        LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activty);

        optionMenu = findViewById(R.id.optionMenu);
        contextMenu = findViewById(R.id.contextMenu);
        linearLayout = findViewById(R.id.linearLayout);
        registerForContextMenu(contextMenu);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.red1){
            linearLayout.setBackgroundColor(Color.parseColor("#ff0000"));
            return true;
        }
        else if(item.getItemId()==R.id.green1){
            linearLayout.setBackgroundColor(Color.parseColor("#00ff00"));
            return true;
        }else if(item.getItemId()==R.id.blue1){
            linearLayout.setBackgroundColor(Color.parseColor("#0000ff"));
            return true;
        }else{
            linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
            return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.red){
            linearLayout.setBackgroundColor(Color.parseColor("#ff0000"));
            return true;
        }
        else if(item.getItemId()==R.id.green){
            linearLayout.setBackgroundColor(Color.parseColor("#00ff00"));
            return true;
        }else if (item.getItemId()==R.id.blue){
            linearLayout.setBackgroundColor(Color.parseColor("#0000ff"));
            return true;
        }else{
            linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
            return true;
        }
    }
}