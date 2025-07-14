package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.Config.GatewayModule;
import br.edu.ifpb.ads.padroes.atv2.Service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {

        Injector injectorPayPal = Guice.createInjector(new GatewayModule("PayPal"));
        PagamentoService servicePayPal = injectorPayPal.getInstance(PagamentoService.class);
        servicePayPal.pagar("VENDA-001", 100);

        System.out.println();

        Injector injectorStripe = Guice.createInjector(new GatewayModule("Stripe"));
        PagamentoService serviceStripe = injectorStripe.getInstance(PagamentoService.class);
        serviceStripe.pagar("VENDA-002", 200);

        System.out.println();

        Injector injectorPagSeguro = Guice.createInjector(new GatewayModule("PagSeguro"));
        PagamentoService servicePagSeguro = injectorPagSeguro.getInstance(PagamentoService.class);
        servicePagSeguro.pagar("VENDA-003", 300);

    }
}
