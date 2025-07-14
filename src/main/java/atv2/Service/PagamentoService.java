package atv2.Service;

import atv2.Gateway.PagamentoGateway;
import jakarta.inject.Inject;

public class PagamentoService {

    private final PagamentoGateway gateway;
    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void pagar(String idVenda, double valor) {
        System.out.println("Iniciando pagamento para venda ID: " + idVenda);
        gateway.pagar(idVenda, valor);
    }

}
