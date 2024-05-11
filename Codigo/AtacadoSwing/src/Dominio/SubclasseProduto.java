package Dominio;

import java.time.LocalDate;

public class SubclasseProduto extends BaseDominio {
    private Long codigoClasse;
    private String nome;
    private LocalDate dataDeInclusao;
    public Long getCodigoClasse() {
        return codigoClasse;
    }
    public void setCodigoClasse(Long codigoClasse) {
        this.codigoClasse = codigoClasse;
    }
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
    public SubclasseProduto(Long codigo, Long codigoClasse, String nome, LocalDate dataDeInclusao) {
        super(codigo);
        this.codigoClasse = codigoClasse;
        this.nome = nome;
        this.dataDeInclusao = dataDeInclusao;
    }
}
