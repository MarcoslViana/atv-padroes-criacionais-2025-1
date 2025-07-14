package atv2.Gateway.impl;

import atv2.Gateway.PagamentoGateway;
import atv2.Mock.PayPalAPI;

public class PayPalGateway implements PagamentoGateway {

    private final PayPalAPI api = new PayPalAPI();
    @Override
    public void pagar(String idVenda, double valor) {
        api.pagar(idVenda, valor);
    }

}
