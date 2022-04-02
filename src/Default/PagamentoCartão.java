package Default;

public class PagamentoCartão extends Pagamentos {
	public PagamentoCartão(String favorecido, String pagador, double valor) {
		super(favorecido, pagador, valor);
	}

	@Override
	public void efetuarPagamentos() {
		double valorTotal = super.valor + (super.valor * 0.15);
		System.out.println ("pagamento efetuado com juros de 1.5% " + valorTotal);
		
	}
}
