package dependencyInversionPrinciple;

public class ControllerPedido {
	
	public PedidoService service;
	
	public ControllerPedido(PedidoService service ) {
		this.service = service;
		
	}
	
    public void adicionarPedido(Pedido pedido) {
    	
    	this.service.processarPedido(pedido);
    	
}
    
}
