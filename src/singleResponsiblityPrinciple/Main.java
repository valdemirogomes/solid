package singleResponsiblityPrinciple;

public class Main {

	public static void main(String[] args) {
		Produto a = new Produto("Agua Mineral Indaia", "Bebida", 2.50);

	Compra c = new Compra(a, 10, 0.5, 0.3, 10);
	c.calcularTotal();

	c.imprimirCompra();
	
	}

}
