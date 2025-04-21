package com.example.projeto.mapper;

import com.example.projeto.data.dto.Pessoa;
import com.example.projeto.data.entity.PessoaEntity;
import org.springframework.stereotype.Component;

@Component
public class PessoaMapper {

    // pessoa -> pessoaEntity
    public PessoaEntity convertePessoaParaPessoaEntity (Pessoa pessoa) {

        PessoaEntity pessoaEntity = new PessoaEntity();

        pessoaEntity.setNome(pessoa.getNome());
        pessoaEntity.setIdade(pessoa.getIdade());
        pessoaEntity.setTelefone(pessoa.getTelefone());
        pessoaEntity.setEmail(pessoa.getEmail());
        pessoaEntity.setCpf(pessoa.getCpf());

        return pessoaEntity;

    }

    public Pessoa convertePessoaEntityParaPessoa (PessoaEntity pessoaEntity) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome(pessoaEntity.getNome());
        pessoa.setIdade(pessoaEntity.getIdade());
        pessoa.setTelefone(pessoaEntity.getTelefone());
        pessoa.setEmail(pessoaEntity.getEmail());
        pessoa.setCpf(pessoaEntity.getCpf());

        return pessoa;


    }


}
