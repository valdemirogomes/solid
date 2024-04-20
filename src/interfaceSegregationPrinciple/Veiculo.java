package interfaceSegregationPrinciple;

public class Veiculo implements InterfaceVeiculo {
	private String ano;
	private String modelo;
	private String fabricante;
	
	public Veiculo(String ano, String modelo, String fabricante) {
		this.ano = ano;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	@Override
	public void mover() {
		System.out.println(this.modelo+ " está em movimento");
		
	}
	@Override
	public void abrirPortas() {
		System.out.println(this.modelo+ " abriu a porta do motorista");
		
	}
	@Override
	public void abastecer() {
		System.out.println(this.modelo+ " abasteceu com gasolina");
		
	}
	
	

}
