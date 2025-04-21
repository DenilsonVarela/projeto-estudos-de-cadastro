package com.example.projeto.service.impl;

import com.example.projeto.data.dto.Pessoa;
import com.example.projeto.data.entity.PessoaEntity;
import com.example.projeto.mapper.PessoaMapper;
import com.example.projeto.repository.PessoaRepository;
import com.example.projeto.service.PessoaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    private PessoaMapper pessoaMapper;
    private PessoaRepository pessoaRepository;

    public PessoaServiceImpl (PessoaRepository pessoaRepository, PessoaMapper pessoaMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaMapper = pessoaMapper;
    }

    @Override
    public Pessoa salvarPessoa (Pessoa pessoa) {

        PessoaEntity pessoaEntity = pessoaMapper.convertePessoaParaPessoaEntity(pessoa);

        PessoaEntity pEntity = pessoaRepository.save(pessoaEntity);

        Pessoa pessoa1 = pessoaMapper.convertePessoaEntityParaPessoa(pEntity);

        return pessoa1;
    }

    @Override
    public List<Pessoa> buscarPessoa () {

        List<PessoaEntity> pEntity = pessoaRepository.findAll();
        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < pEntity.size(); i++) {

          Pessoa pessoa = pessoaMapper.convertePessoaEntityParaPessoa(pEntity.get(i));
          pessoas.add(pessoa);

        }

        return pessoas;

    }


}
