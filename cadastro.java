package com.example.petvitalle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class cadastro extends AppCompatActivity {

    private EditText Nome;
    private EditText Email;
    private EditText Cpf;
    private EditText Telefone;
    private EditText Senha;
    private appdao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Nome = findViewById(R.id.txtnome);
        Telefone = findViewById(R.id.txttelefone);
        Email = findViewById(R.id.txtemail2);
        Senha = findViewById(R.id.txtsenha2);
        Cpf = findViewById(R.id.txtcpf);
        dao = new appdao(this);
    }
    public void voltarlogin(View view){
        Intent acao = new Intent(this, MainActivity.class);
        startActivity(acao);
        finish();
    }
    public void btncadastro (View view){
        appobj dado = new appobj();

        dado.setNome(Nome.getText().toString());
        dado.setEmail(Email.getText().toString());
        dado.setEmail(Cpf.getText().toString());
        dado.setTele(Telefone.getText().toString());
        dado.setEmail(Senha.getText().toString());
        Long ID = dao.cadastro(dado);

        Toast.makeText(this,"Adicionado ao Banco"+ ID , Toast.LENGTH_SHORT).show();

    }

}