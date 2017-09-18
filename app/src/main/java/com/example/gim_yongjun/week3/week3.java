package com.example.gim_yongjun.week3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class week3 extends AppCompatActivity {
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3);
        t1 = (TextView) findViewById(R.id.t1);
        registerForContextMenu(t1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m1:
                t1.setTextColor(Color.BLUE);
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,week3_1.class);
                startActivity(intent);
                break;
            case R.id.m2:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("이전");
        menu.add("다음");
    }

    @Override

    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m1:
                t1.setTextColor(Color.BLUE);
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.m2:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }
}
