package atv2.Config;

import atv2.Gateway.PagamentoGateway;
import atv2.Gateway.impl.PagSeguroGateway;
import atv2.Gateway.impl.PayPalGateway;
import atv2.Gateway.impl.StripeGateway;
import com.google.inject.AbstractModule;
public class GatewayModule extends AbstractModule {

    private final String tipoGateway;

    public GatewayModule(String tipoGateway) {
        this.tipoGateway = tipoGateway.toUpperCase();
    }

    @Override
    protected void configure() {
        switch (tipoGateway) {
            case "PAYPAL":
                bind(PagamentoGateway.class).to(PayPalGateway.class);
                break;
            case "STRIPE":
                bind(PagamentoGateway.class).to(StripeGateway.class);
                break;
            case "PAGSEGURO":
                bind(PagamentoGateway.class).to(PagSeguroGateway.class);
                break;
            default:
                throw new IllegalArgumentException("Gateway não suportado: " + tipoGateway);
        }
    }
}
