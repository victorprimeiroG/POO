package br.com.streaming.model;

public class Video {
    private String titulo;
    private int duracaoEmMinutos;
    
    // TODO: Associação 1:1 - Adicionar atributo do tipo Categoria
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Video(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    // TODO: Gerar Getters, Setters, equals(), hashCode() e toString()
}
