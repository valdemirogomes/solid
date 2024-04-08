package openClosedPrinciple;

public class Agua {
	String marca;
	int quantidadeEmML;
	double preco;
	
	public Agua(String marca, int quantidade, int quantidadeEmML, double preco) {
		this.marca = marca;
		this.quantidadeEmML = quantidadeEmML;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getQuantidadeEmML() {
		return quantidadeEmML;
	}

	public void setQuantidadeEmML(int quantidadeEmML) {
		this.quantidadeEmML = quantidadeEmML;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
