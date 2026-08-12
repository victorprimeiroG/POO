package br.com.streaming.financeiro;

public class CartaoDeCredito {
    private String numero;
    private double limite;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public CartaoDeCredito(String numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }
}
