package openClosedPrinciple;

public class Passaro extends Animal{

	@Override
	public void locomover() {
		System.out.println("Voar");		
		
	}

	@Override
	public void alimentar() {
		System.out.println("Sementes e grãos");		
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Inato");		
		
	}

}
