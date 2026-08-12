package br.com.streaming.financeiro;

// import br.com.streaming.model.Usuario; // Necessário import devido a pacotes diferentes!

public class Assinatura {
    private String dataInicio;
    private double valor;
    private CartaoDeCredito cartao;
    // private Usuario usuario;

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        this.cartao = cartao;
    }

    public Assinatura(String dataInicio, double valor) {
        this.dataInicio = dataInicio;
        this.valor = valor;
    }
    // TODO: Gerar Getters, Setters e toString()
}
