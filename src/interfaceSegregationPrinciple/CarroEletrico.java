package interfaceSegregationPrinciple;

public class CarroEletrico extends Veiculo implements CarroEletrica{

	public CarroEletrico(String ano, String modelo, String fabricante) {
		super(ano, modelo, fabricante);
	}

	@Override
	public void mover() {
		System.out.println(super.getModelo()+ " esta se movendo");
		
	}

	@Override
	public void abrirPortas() {
		System.out.println(super.getModelo()+ " abriu a porta do passageiro");

		
	}

	@Override
	public void abastecer() {
		System.out.println(super.getModelo()+" esta carregando Bateria");
		
	}

	@Override
	public void trocarFonte() {
		System.out.println("Trocando fonte de carga do carro "+super.getModelo());

		
	} 

}
