package Dominio;

import java.time.LocalDate;

public class ClasseProduto extends BaseDominio {
    private String nome;
    private LocalDate dataDeInclusao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }
    public ClasseProduto(Long codigo, String nome, LocalDate dataDeInclusao) {
        super(codigo);
        this.nome = nome;
        this.dataDeInclusao = dataDeInclusao;
    }
}
