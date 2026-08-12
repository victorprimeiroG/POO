package br.com.streaming.financeiro;

public class ProcessadorDePagamento {
    public void finalizarCompra(lPagamento pagamento, double valor) {
        System.out.println("Iniciando processamento...");
        pagamento.efetuarPagamento(valor);
        System.out.println("Processamento finalizado com sucesso!\n");
    }
}
