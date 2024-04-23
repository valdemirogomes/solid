package dependencyInversionPrinciple;

public class Pedido {
	private String pedido;
	private double valor;
	private int quantidade;
	
	public Pedido(String pedido, double valor, int quantidade) {
		this.pedido = pedido;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
