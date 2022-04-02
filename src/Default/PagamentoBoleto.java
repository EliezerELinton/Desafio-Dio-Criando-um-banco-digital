package Default;

public class PagamentoBoleto extends Pagamentos {
	public PagamentoBoleto(String favorecido, String pagador, double valor) {
		super(favorecido, pagador, valor);
						
	}

	@Override
	public void efetuarPagamentos() {
		double valorTotal = super.valor + (super.valor * 0.02);
		System.out.println ("pagamento efetuado com juros de2%" + valorTotal);
				
	}

}


