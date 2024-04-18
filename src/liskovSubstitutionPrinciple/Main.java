package liskovSubstitutionPrinciple;

public class Main {

	public static void main(String[] args) {
		Aluno nivelSuperior1 = new NivelSuperior("Chiquinho", 6977968, "Medicina");
		Aluno nivelSuperior2 = new NivelSuperior("Francisco", 2514326, "Odontologia");
		nivelSuperior1.imprimirDados();
		nivelSuperior2.imprimirDados();

		
		

	}

}
