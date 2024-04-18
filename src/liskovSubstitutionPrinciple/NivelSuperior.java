package liskovSubstitutionPrinciple;

public class NivelSuperior extends Aluno {

	public NivelSuperior(String nome, int matricula, String curso) {
		super(nome, matricula, curso);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void imprimirDados() {
		System.out.println("Nome: "+super.getNome());
		System.out.println("Nome: "+super.getMatricula());
		System.out.println("Nome: "+super.getCurso());
	}


}
