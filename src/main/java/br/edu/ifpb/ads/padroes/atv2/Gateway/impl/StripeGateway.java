package br.edu.ifpb.ads.padroes.atv2.Gateway.impl;

import br.edu.ifpb.ads.padroes.atv2.Gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.Mock.StripeAPI;

public class StripeGateway implements PagamentoGateway {

    private final StripeAPI api = new StripeAPI();

    @Override
    public void pagar(String idVenda, double valor) {
        api.pagar(idVenda, valor);
    }

}
