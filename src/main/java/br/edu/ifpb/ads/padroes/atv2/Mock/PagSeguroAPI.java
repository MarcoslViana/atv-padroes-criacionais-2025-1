package br.edu.ifpb.ads.padroes.atv2.Mock;

public class PagSeguroAPI {

    public void pagar(String idVenda, double valor) {
        System.out.println("PagSeguro | ID Venda: " + idVenda + " | Valor: " + valor);
    }

}
