package com.example.projeto.service.impl;

import com.example.projeto.data.dto.Pessoa;
import com.example.projeto.data.entity.PessoaEntity;
import com.example.projeto.mapper.PessoaMapper;
import com.example.projeto.repository.PessoaRepository;
import com.example.projeto.service.PessoaService;
import org.springframework.stereotype.Service;

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


}
