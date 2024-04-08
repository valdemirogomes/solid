package singleResponsiblityPrinciple;

public class Compra {
	
	private Produto produto;
	private int quantidade;
	private double porcDesconto;
	private double porcImposto;
	private double total;
		
	public Compra(Produto produto, int quantidade, double porcDesconto, double porcImposto, double total) {
		
		this.produto = produto;
		this.quantidade = quantidade;
		this.porcDesconto = porcDesconto;
		this.porcImposto = porcImposto;
		this.total = total;
	}
	
	public Produto getAgua() {
		return produto;
	}
	public void setAgua(Produto produto) {
		this.produto = produto;
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
	
	public double calcularTotal() {
		double preco = ((produto.preco - produto.preco * this.porcDesconto)*this.quantidade);
		return preco;
	}
	public void imprimirCompra() {
		System.out.println("Produto: " + produto.produto);
		System.out.println("Tipo do Produto: " + produto.tipo);
		System.out.println("Preço Unitário R$: " +  produto.preco);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Porcentagem de desconto: " + this.porcDesconto);
		System.out.println("Procentagem de imposto: " + this.porcImposto);
		System.out.println("Valor Total R$: " + calcularTotal());
	}

}
