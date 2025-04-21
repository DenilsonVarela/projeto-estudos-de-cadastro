package com.example.projeto.controller;

import com.example.projeto.data.dto.Pessoa;
import com.example.projeto.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/salvar")
    public ResponseEntity<Pessoa> salvarPessoa (@RequestBody Pessoa pessoa) {

        Pessoa pessoaSalva = pessoaService.salvarPessoa(pessoa);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(pessoaSalva);

    }
    @GetMapping("/buscar")
    public ResponseEntity<List<Pessoa>> buscarPessoa () {

        List<Pessoa> pessoa = pessoaService.buscarPessoa();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(pessoa);

    }

}
