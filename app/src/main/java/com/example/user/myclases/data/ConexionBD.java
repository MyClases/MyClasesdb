package com.example.user.myclases.data;

/**
 * Created by user on 23-10-14.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
public class ConexionBD {
    private SQLiteDatabase db;
    private Context nContext;
    private MyProfeDbHelper objBD;


    //Constructor de la Clase
    //Recibe como parámetro una variable de Tipo contexto
    // Esto debido a que Para acceder o crear la BD lo pide la Clase SQLiteOpenHelper
    public ConexionBD(Context c){
        nContext=c;

    }

    public void abrirConexion(){
        objBD =new MyProfeDbHelper(nContext);
        db=objBD.getWritableDatabase();
    }

    public void cerrarConexion(){
        db.close();
    }

    public boolean insertar(String nombre,String telefono){
        boolean resultado=false;

        try{
            String query="INSERT INTO MyProfe(nombre, telefono) VALUES('"+nombre+"','"+telefono+"')";


            db.execSQL(query);
            resultado=true;
            return resultado;
        }
        catch (Exception e){
            resultado=false;
            return resultado;
        }
    }
}