package openClosedPrinciple;

public class Compra {
	
	private Agua agua;
	private int quantidade;
	private double porcDesconto;
	private double porcImposto;
	private double total;
		
	public Compra(Agua agua, int quantidade, double porcDesconto, double porcImposto, double total) {
		super();
		this.agua = agua;
		this.quantidade = quantidade;
		this.porcDesconto = porcDesconto;
		this.porcImposto = porcImposto;
		this.total = total;
	}
	
	public Agua getAgua() {
		return agua;
	}
	public void setAgua(Agua agua) {
		this.agua = agua;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPorcDesconto() {
		return porcDesconto;
	}
	public void setPorcDesconto(double porcDesconto) {
		this.porcDesconto = porcDesconto;
	}
	public double getPorcImposto() {
		return porcImposto;
	}
	public void setPorcImposto(double porcImposto) {
		this.porcImposto = porcImposto;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void calcularTotal() {
		double preco = ((agua.preco - agua.preco * this.porcDesconto)*this.quantidade);
	}

}
