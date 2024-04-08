package singleResponsiblityPrinciple;

public class Produto {
	String produto;
	String tipo;
	double preco;
	
	public Produto(String produto, String tipo, double preco) {
		this.produto = produto;
		this.tipo = tipo;
		this.preco = preco;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	


}