package dependencyInversionPrinciple;


public class PedidoService {
	
    private InterfacePedidoRepository repository;

    public PedidoService(InterfacePedidoRepository repository) {
        this.repository = repository;
    }

    public void processarPedido(Pedido pedido) {
        // Lógica de processamento do pedido
        repository.salvarPedido(pedido);
    }
}
	


