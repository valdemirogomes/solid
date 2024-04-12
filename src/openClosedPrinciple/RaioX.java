package openClosedPrinciple;

public class RaioX implements AprovarExame{
	
	private Exame exame;
	
	public RaioX(Exame exame) {
		this.exame = exame;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}
	
	//Verifica se o retorno da função verificaCondicoesExame é true
	@Override
	public void aprovarSolicitacaoExame(Exame exame) {
        if(verificaCondicoesExame(exame)) {
            System.out.println("Exame sanguíneo aprovado!");
	}
	System.out.println("Exame não aprovado");
	}
	@Override
	public boolean verificaCondicoesExame(Exame exame) {
		if(exame.tipoExame =="RAIOX") {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

		

	
	
}
