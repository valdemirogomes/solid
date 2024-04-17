package liskovSubstitutionPrinciple;

public abstract class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	
	
	public Aluno(String nome, int matricula, String curso) {

		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void imprimirDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Nome: "+this.matricula);
		System.out.println("Nome: "+this.curso);
	}
	
	

}
