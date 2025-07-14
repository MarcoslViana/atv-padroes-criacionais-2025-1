package atv2.Gateway.impl;

import atv2.Gateway.PagamentoGateway;
import atv2.Mock.PagSeguroAPI;

public class PagSeguroGateway implements PagamentoGateway {

    private final PagSeguroAPI api = new PagSeguroAPI();

    @Override
    public void pagar(String idVenda, double valor) {
        api.pagar(idVenda, valor);
    }

}
