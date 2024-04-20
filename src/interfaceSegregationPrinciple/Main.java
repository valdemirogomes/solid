package interfaceSegregationPrinciple;

public class Main {

	public static void main(String[] args) {
		Veiculo a = new Veiculo("2009", "Astra", "Chevrolet");
		a.abastecer();
		a.abrirPortas();
		a.mover();
		System.out.println("---------------------------------------------------------------");
		CarroEletrica c = new CarroEletrico("2024", "Renault Kwid e-Tech", "Renault");
		c.abastecer();
		c.abrirPortas();
		c.mover();
		c.trocarFonte();
	}

}
