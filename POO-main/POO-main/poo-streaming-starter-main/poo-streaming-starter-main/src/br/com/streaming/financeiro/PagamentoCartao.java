package br.com.streaming.financeiro;


public class PagamentoCartao implements lPagamento {
        @Override
        public void efetuarPagamento(double valor) {
        System.out.println("Conectando com a adquirente...");
        System.out.println("Aprovando transação de R$ " + valor + " no Cartão de Crédito.");
    }
}
