package atv2.Gateway.impl;

import atv2.Gateway.PagamentoGateway;
import atv2.Mock.StripeAPI;

public class StripeGateway implements PagamentoGateway {

    private final StripeAPI api = new StripeAPI();

    @Override
    public void pagar(String idVenda, double valor) {
        api.pagar(idVenda, valor);
    }

}
