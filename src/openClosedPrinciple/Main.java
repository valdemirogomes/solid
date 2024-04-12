package openClosedPrinciple;

public class Main {

	public static void main(String[] args) {
		Exame e = new Exame("RAIO X", 100.00);
		RaioX r = new RaioX(e);
		r.aprovarSolicitacaoExame(e);
	}

}
