package atv2.Mock;

public class StripeAPI {

    public void pagar(String idVenda, double valor) {
        System.out.println("Stripe | ID Venda: " + idVenda + " | Valor: " + valor);
    }

}
