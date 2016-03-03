package com.studio.ijj.spoline;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.studio.ijj.spoline.Model.Usuario;

public class MainActivity extends AppCompatActivity {

    private Usuario usuario;

    //Intents -->



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!logged()){
            Intent login = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(login);
        }else{
            Toast.makeText(MainActivity.this, "Bienvenido "+ usuario.getNombre(),
                    Toast.LENGTH_LONG).show();

        }


    }

    /**
     * Método que comprueba sí se ha logeado alguna vez, sino lo ha hecho se le lanza LoginActivity
     * @return
     */
    public boolean logged(){

            //Obtenemos las preferencias.
            SharedPreferences prefs =
                    getSharedPreferences("LoginVerification", Context.MODE_PRIVATE);

            String correo = prefs.getString("email", "por_defecto@email.com");
            String nombre = prefs.getString("nombre", "nombre_por_defecto");
            Boolean logged = prefs.getBoolean("logged", false);

            if(logged){
                usuario = new Usuario(nombre, correo, "");
                return true;
            }else{
                return false;
            }
    }

    public void pulse (View view){
        switch(view.getId())
        {
            case R.id.nruta:
                Intent intent= new Intent(MainActivity.this,RutaActivity.class);
                /*Bundle extras = getIntent().getExtras();
                usuario=extras.getString("usuario");
                intent.putExtra("usuario",usuario);
                startActivityForResult(intent,1235);*/
                startActivity(intent);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item_logout) {
            if (logged()){
                boolean prefs =
                        getSharedPreferences("LoginVerification", Context.MODE_PRIVATE).edit().clear().commit();
            Toast.makeText(MainActivity.this, "Hasta pronto "+ usuario.getNombre(),
                    Toast.LENGTH_LONG).show();
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
            }


        }

        return super.onOptionsItemSelected(item);
    }
}
