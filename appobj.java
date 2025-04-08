package com.example.petvitalle;

import java.io.Serializable;

public class appobj implements Serializable {
    private Integer ID; //classe privada, apenas para agenda_obj
    private String Nome;
    private String Email;
    private String Cpf;
    private String Telefone;
    private String Senha;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTele(String telefone) {
        Telefone = telefone;
    }

    public String getCpf(){
        return Cpf;
    }

    public void setCpf(String cpf){
        Cpf = cpf;
    }

    public String getSenha(){
        return Senha;
    }

    public void setSenha(String senha){
        Senha = senha;
    }

}
