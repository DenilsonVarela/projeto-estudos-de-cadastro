package com.example.projeto.service;

import com.example.projeto.data.dto.Pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa salvarPessoa (Pessoa pessoa);

    List<Pessoa> buscarPessoa ();

    Pessoa buscarPessoaPorId (Long id);

    void deletarPessoaPorId (Long id);

}
