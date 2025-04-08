package com.example.petvitalle;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class conexaodb extends SQLiteOpenHelper{

    private static final String nome = "banco.db";
    private static final int version = 1;

    public conexaodb(Context context){
        super(context, nome, null, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db){

        db.execSQL("create table pessoa(ID Integer primary key autoincrement, " +
                "Nome varchar (68), Email varchar (70), Cpf varchar (11), Telefone varchar (11), Senha varchar (20))" );
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il){

    }

}
