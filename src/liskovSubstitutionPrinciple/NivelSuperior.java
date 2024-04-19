package liskovSubstitutionPrinciple;

public class NivelSuperior extends Aluno {
	private String formacao;
	private String dataInicio;
	

	public NivelSuperior(String nome, int matricula, String curso, String formacao, String dataInicio) {
		super(nome, matricula, curso);
		this.formacao = formacao;
		this.dataInicio = dataInicio;
	}

	@Override
	public void imprimirDados() {
		System.out.println("Nome: "+super.getNome());
		System.out.println("Nome: "+super.getMatricula());
		System.out.println("Nome: "+super.getCurso());
		System.out.println("Nome: "+this.formacao);
		System.out.println("Nome: "+this.dataInicio);
	}


}
