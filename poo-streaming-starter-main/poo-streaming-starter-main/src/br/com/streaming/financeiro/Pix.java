package br.com.streaming.financeiro;

    public class Pix implements lPagamento {
        @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Gerando chave PIX Copia e Cola...");
        System.out.println("Aguardando transferência de R$ " + valor + ".");
    }
}
