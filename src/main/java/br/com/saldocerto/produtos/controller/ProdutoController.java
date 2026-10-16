package br.com.saldocerto.produtos.controller;

import br.com.saldocerto.produtos.model.Produto;
import br.com.saldocerto.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {


    // Instancia automaticamente o objeto produtos injetado diretamente do ProdutoService
    @Autowired
    private ProdutoService produtoService;


    // Metodo responsavel por buscar todos os produto no banco de dados
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> buscarTodos() {
        return produtoService.buscarTodos();
    }


    // Metodo responsavel por buscar um produto em especifico no banco de dados
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto buscarId(@PathVariable Long id) {
        return produtoService.buscarId(id);
    }


    // Metodo responsavel por criar um novo produto no banco de dados
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }


    // Metodo responsavel por excluir um produto no banco de dados
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id) {
        produtoService.excluir(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.atualizar(id, produto);
    }

}