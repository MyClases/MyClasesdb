package com.example.user.myclases;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class Prueba extends Activity {
    Spinner lista;
    String[] datos = {"Filtro Monetario", "<=$10.000","<=$15.000","<=$20.000"};
    Spinner filtro;
    String[] datos1 = {"Filtro Horario", "00:00-05:59", "06:00-11:59", "12:00-17:59", "18:00-23:59"};
    Spinner comuna;
    String[] datos2 = {"Comuna", "Las Condes", "Vitacura", "Providencia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        lista = (Spinner)findViewById(R.id.lista1);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos); //es un adaptador que toma la vista en que se va a mostrar,
        //el Recurso dentro de la clase R que se ecarga de colocar nuestros datos de forma visual
        //y los datos que queremos que se vean

        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast to = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to.show();
                        break;
                    case 2:
                        Toast t = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        t.show();
                        break;
                    case 3:
                        Toast fo = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        fo.show();
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        filtro = (Spinner)findViewById(R.id.lista2);

        ArrayAdapter<String> adaptador1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos1);
        filtro.setAdapter(adaptador1);

        filtro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast yo = Toast.makeText(getApplicationContext(), datos1[i], Toast.LENGTH_LONG);
                        yo.show();
                        break;
                    case 2:
                        Toast yu = Toast.makeText(getApplicationContext(), datos1[i], Toast.LENGTH_LONG);
                        yu.show();
                        break;
                    case 3:
                        Toast ya = Toast.makeText(getApplicationContext(), datos1[i], Toast.LENGTH_LONG);
                        ya.show();
                        break;
                    case 4:
                        Toast yi = Toast.makeText(getApplicationContext(), datos1[i], Toast.LENGTH_LONG);
                        yi.show();
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        comuna = (Spinner)findViewById(R.id.lista3);
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos2);
        comuna.setAdapter(adaptador2);
        comuna.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast ri = Toast.makeText(getApplicationContext(), datos2[i], Toast.LENGTH_LONG);
                        ri.show();
                        break;
                    case 2:
                        Toast ra = Toast.makeText(getApplicationContext(), datos2[i], Toast.LENGTH_LONG);
                        ra.show();
                        break;
                    case 3:
                        Toast re = Toast.makeText(getApplicationContext(), datos2[i], Toast.LENGTH_LONG);
                        re.show();
                        break;
                    case 4:
                        Toast ro = Toast.makeText(getApplicationContext(), datos2[i], Toast.LENGTH_LONG);
                        ro.show();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.prueba, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }
}