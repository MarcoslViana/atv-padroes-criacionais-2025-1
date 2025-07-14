package br.edu.ifpb.ads.padroes.atv1.rpg.atv2.Mock;

public class StripeAPI {

    public void pagar(String idVenda, double valor) {
        System.out.println("Stripe | ID Venda: " + idVenda + " | Valor: " + valor);
    }

}
