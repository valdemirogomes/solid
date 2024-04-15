package openClosedPrinciple;

public class Cachorro extends Animal {

	@Override
	public void locomover() {
		System.out.println("Andando");		
		
	}

	@Override
	public void alimentar() {
		System.out.println("Ração");		
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Late");		
		
	}

}
