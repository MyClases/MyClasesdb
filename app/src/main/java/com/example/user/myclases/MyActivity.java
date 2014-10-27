package com.example.user.myclases;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;
import android.view.View.OnClickListener;
import android.database.Cursor;

import com.example.user.myclases.data.MyProfeDbHelper;

public class MyActivity extends Activity {
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Button boton = (Button) findViewById(R.id.ButtonEnviar);
        Button btn = (Button) findViewById(R.id.ButtonResetear);
        MyProfeDbHelper usdbh =
                new MyProfeDbHelper(this);

        db = usdbh.getWritableDatabase();


        boton.setOnClickListener(new View.OnClickListener() {
            EditText nombre = (EditText) findViewById(R.id.editTextFecha);
            EditText apellido=(EditText)findViewById(R.id.editTextCelular);
            @Override
            public void onClick(View arg0) {
                if(agregar(nombre, apellido)){
                        Intent intent = new Intent(MyActivity.this,
                                MyActivity.class);
                        startActivity(intent);}
                if(!agregar(nombre,apellido)){
                Intent intent = new Intent(MyActivity.this,
                        MyActivity.class);
                startActivity(intent);}}






        });
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                EditText nom = (EditText) findViewById(R.id.editTextFecha);
                //Alternativa 1: método rawQuery()
                Cursor c = db.rawQuery("SELECT nombre FROM MyProfe", null);

                //Alternativa 2: método delete()
                //String[] campos = new String[] {"codigo", "nombre"};
                //Cursor c = db.query("Usuarios", campos, null, null, null, null, null);

                //Recorremos los resultados para mostrarlos en pantalla
                String texto = "";
                if (c.moveToFirst()) {
                    //Recorremos el cursor hasta que no haya más registros
                    do {
                        String cod = c.getString(0);


                        texto=texto + " " + cod +"\n";
                    } while(c.moveToNext());
                }
                rq(texto);



    }});}




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
    public boolean  agregar(EditText nome , EditText apet){
        //Declaramos variables
        String a,b;

        //Obtenemos Texto de los TextEdit
        a=nome.getText().toString();
        b=apet.getText().toString();

       // Creamos el Objeto para acceder a la BD
        MyProfeDbHelper ObjCnx = new MyProfeDbHelper(this);



        //Ejecuta el método para Insertar Datos
        if(ObjCnx.insertar(a, b)){
            String texto ="Elemento Agregado Corectamente";
            Toast toast = Toast.makeText(this, texto, Toast.LENGTH_LONG);
            toast.show();

            return true;
        }
        else{
           String texto ="Error al Agregar Elemento";
            Toast toast = Toast.makeText(this, texto, Toast.LENGTH_LONG);
            toast.show();

            return false;
        }



        //Cerramos Conexión


  }
   public void  rq(String a){
       Toast toast = Toast.makeText(this, a, Toast.LENGTH_LONG);
       toast.show();
   }
}
