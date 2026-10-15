package br.com.saldocerto.produtos.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "T_EXC_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_PRODUTOS")
    @SequenceGenerator(
            name = "SEQ_PRODUTOS",
            sequenceName = "SEQ_PRODUTOS",
            allocationSize = 1)
    private long id;

    @Column(length = 100, nullable = false)
    private String nome;

    private Double valor;

    private int quantidade;

    @Column(name = "data_fabricacao")
    private LocalDate dataFabricacao;


    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
