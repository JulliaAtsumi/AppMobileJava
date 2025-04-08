package com.example.petvitalle;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class appdao {

    private conexaodb conexaodb;
    private SQLiteDatabase Banco;

    public appdao(Context context){
        conexaodb = new conexaodb(context);
        Banco = conexaodb.getWritableDatabase();

    }

    public long cadastro(appobj appobj){
        ContentValues Valores = new ContentValues();
        Valores.put("Nome", appobj.getNome());
        Valores.put("Email", appobj.getEmail());
        Valores.put("Cpf", appobj.getCpf());
        Valores.put("Telefone", appobj.getTelefone());
        Valores.put("Senha", appobj.getSenha());
        return Banco.insert("pessoa", null,Valores);


    }

}
