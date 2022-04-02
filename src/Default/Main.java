package Default;


public class Main {

	public static void main(String[] args) {
//		Conta cc = new ContaCorrente();
//		cc.depositar(100);
//		
//		Conta poupanca = new ContaPoupanca();
//		
//		cc.transferir(100, poupanca);
//		
//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();
//		
		Pagamentos pag1 =  new PagamentosPix("Rock", "Yuri", 1000);
		Pagamentos pag2 =  new PagamentoBoleto("Mariano", "cabral", 1200);
		Pagamentos pag3 =  new PagamentoCartão("Evilin", "Malvick", 1800);
		
		
		pag1.efetuarPagamentos();
		pag1.imprimirValor();
		
		pag2.efetuarPagamentos();
		pag2.imprimirValor();
		
		pag2.efetuarPagamentos();
		pag2.imprimirValor();
	
	}

}
