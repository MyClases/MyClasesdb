package com.example.user.myclases;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class Menus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
        setupMessageButton();
        Button Registrarse = (Button) findViewById(R.id.Buscarbutton);
        Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menus.this,
                        Buscar.class);
                startActivity(intent);}});
        Button Registrar = (Button) findViewById(R.id.Perfilbutton);
        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menus.this,
                        MyPerfil.class);
                startActivity(intent);}});
        Button Registra = (Button) findViewById(R.id.Clasesbutton);
        Registra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menus.this,
                        Agendatuclase.class);
                startActivity(intent);}});
        Button Regist = (Button) findViewById(R.id.Notificacionesbutton);
        Regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menus.this,
                        Notificaciones.class);
                startActivity(intent);}});}






    private void    setupMessageButton() {

        Button messageButton = (Button) findViewById(R.id.btnDisplayMessage);

        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("DemoButtonApp", "You clicked the button!");
                Toast.makeText(
                        Menus.this,
                        "You clicked it!",
                        Toast.LENGTH_LONG
                ).show();
            }

        });
    }

}