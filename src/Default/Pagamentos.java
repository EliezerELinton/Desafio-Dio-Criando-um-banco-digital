package Default;

public abstract class Pagamentos implements IPagamentos{
	protected String favorecido;
	protected String pagador;
	protected double valor;
	
	public Pagamentos(String favorecido, String pagador, double valor) {	
		this.favorecido = favorecido;
		this.pagador = pagador;
		this.valor = valor;
		
	}
	
	@Override
	public void imprimirValor() {
		// TODO Auto-generated method stub
		System.out.println("O valor a pagar é: " + this.valor);
		System.out.println("O nome do favorecido: " + this.favorecido);
		System.out.println("O nome do pagador é: " + this.pagador);
	}

}
