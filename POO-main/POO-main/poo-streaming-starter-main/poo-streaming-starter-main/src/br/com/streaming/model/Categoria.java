package br.com.streaming.model;

public class Categoria {
    private String nome;
    private int classificacaoIdade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassificacaoIdade() {
        return classificacaoIdade;
    }

    public void setClassificacaoIdade(int classificacaoIdade) {
        this.classificacaoIdade = classificacaoIdade;
    }

    public Categoria(String nome, int classificacaoIdade) {
        this.nome = nome;
        this.classificacaoIdade = classificacaoIdade;
    }
    // TODO: Gerar Getters, Setters e toString()
}
