package br.edu.ifpb.ads.padroes.atv2.Mock;

public class PayPalAPI {

    public void pagar(String idVenda, double valor) {
        System.out.println("PayPal | ID Venda: " + idVenda + " | Valor: " + valor);
    }

}
