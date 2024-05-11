package Dominio;

import java.time.LocalDate;

public class Produto extends BaseDominio{
    private Long codigoSubclasse;
    private String nome;
    private Double valor;
    private LocalDate dataDeInclusao;
    public Long getCodigoSubclasse() {
        return codigoSubclasse;
    }
    public void setCodigoSubclasse(Long codigoSubclasse) {
        this.codigoSubclasse = codigoSubclasse;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }
    public Produto(Long codigo, Long codigoSubclasse, String nome, Double valor, LocalDate dataDeInclusao) {
        super(codigo);
        this.codigoSubclasse = codigoSubclasse;
        this.nome = nome;
        this.valor = valor;
        this.dataDeInclusao = dataDeInclusao;
    }
}
