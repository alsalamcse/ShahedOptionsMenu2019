package com.example.shahedoptionsmenu2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.itmScreem1)
        {
            Intent intent=new Intent(this,Screen1.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.itmScreen2)
        {
            Intent intent=new Intent(this,Screen2.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.itmScreem1)
        {
            Toast.makeText(this,"ynet",Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ynet.co.il"));
            startActivity(intent);
        }

       return true;
    }
}
