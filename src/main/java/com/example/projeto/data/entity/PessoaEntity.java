package com.example.projeto.data.entity;

import jakarta.persistence.Entity;

@Entity
public class PessoaEntity {
    private String nome;
    private int idade;
    private String telefone;
    private String email;
    private String cpf;

    public PessoaEntity() {
    }

    public PessoaEntity(String nome, int idade, String telefone, String email, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
