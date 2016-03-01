package com.studio.ijj.spoline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void pulse (View view){
        switch(view.getId())
        {
            case R.id.button:
                Intent intent= new Intent(MainActivity.this,RutaActivity.class);
                /*Bundle extras = getIntent().getExtras();
                usuario=extras.getString("usuario");
                intent.putExtra("usuario",usuario);
                startActivityForResult(intent,1235);*/
                startActivity(intent);
                break;
        }
    }
}
