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

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Pessoa> buscarPessoaPorId (@PathVariable Long id) {

        List<Pessoa> pessoa = pessoaService.buscarPessoa();

        for (int i = 0; i < pessoa.size(); i++) {
            if (pessoa.get(i).getId() == id) {
                return ResponseEntity
                        .status(HttpStatus.OK)
                        .body(pessoa.get(i));
            }
        }

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build();

    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarPessoaPorId (@PathVariable Long id) {

        List<Pessoa> pessoa = pessoaService.buscarPessoa();

        for (int i = 0; i < pessoa.size(); i++) {
            if (pessoa.get(i).getId() == id) {
                pessoaService.deletarPessoaPorId(id);
                return ResponseEntity
                        .status(HttpStatus.OK)
                        .build();
            }
        }

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build();

    }

}
