**_S - Single Responsiblity Principle (SRP)_**     

“Cada classe deve ter um, e somente um, motivo para mudar.”    

Se uma classe tem várias responsabilidades, mudar um requisito do projeto pode trazer várias razões para modificar a classe. Por isso, as classes devem ter responsabilidades únicas.    

Usando esse princípio no projeto, pode-se dizer que a classe Compra, realiza as responsabilidades da classe Compra.

Em resumo, uma Classe não deve fazer algo que não é de sua responsabilidade.
```
public class Compra {
	
	private Produto produto;
	private int quantidade;
	private double porcDesconto;
	private double porcImposto;
	private double total;
		}
```
Dentro da Classe Compra temos:
```
 	public double calcularTotal() {
		double preco = ((produto.preco - produto.preco * this.porcDesconto)*this.quantidade);
		return preco;
	}
```
Esse método é responsável por calcular o total de uma compra. Não seria correto esse método está dentro da Classe Produto. Produto representa um produto, e Compra representa uma compra, logo o método calcularTotal() está em Compra, por realizar o cálculo total de uma compra.

Também, temos o método imprimirCompra(), que faz a impressão dos dados de uma compra, logo ele está na Classe Compra.
```
	public void imprimirCompra() {
		System.out.println("Produto: " + produto.produto);
		System.out.println("Tipo do Produto: " + produto.tipo);
		System.out.println("Preço Unitário R$: " +  produto.preco);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Porcentagem de desconto: " + this.porcDesconto);
		System.out.println("Procentagem de imposto: " + this.porcImposto);
		System.out.println("Valor Total R$: " + calcularTotal());
	}
```
		
**_O - Open/Closed Principle (OCP)_**
  
O princípio de Aberto/Fechado propõe que entidades (classes, funções, módulos, etc.) devem ser abertas para extensão, mas fechadas para modificação.  
  
Exemplo: no pacote openClosedPrinciple, a classe Animal é extendida pela classe Cachorro e Passaro, onde os métodos  declarados dentro de Animal, são herdados por Cachorro e Passaro.
Cachorro e Passaro, implementam os métodos de Animal de diferentes formas. Dessa maneira, abrimos a classe Animal para "extensão"

Aberto para extensão significa que, ao receber um novo requerimento, é possível adicionar um novo comportamento. Fechado para modificação significa que, para introduzir um novo comportamento (extensão), não é necessário modificar o código existente

**_L - Liskov Substitution Principle (LSP)_**
  
Dentro do pacote liscovSubstitutionPrinciple tem a classe base “mãe” Aluno, onde a classe “filha” NivelSuperior herda todos os atributos e comportamentos da classe Aluno. Observe que o método imprimirDados(), declarado na classe Aluno, é sobreposto na classe NivelSuperior tendo um comportamento completamente diferente do comportamento do mesmo método da classe mãe. Esse comportamento, lembra o conceito de POLIMORFISMO, onde um objeto/classe/método pode se comportar de diferentes formas.

Também, é de se notar que na classe MAIN, é possível ver a classe base “mãe” sendo substituída, como diz no conceito de LISKOV.
  
Exemplo: Aluno nivelSuperior2 = new NivelSuperior("Francisco", 2514326, "Odontologia");
  
**_I - Interface Segregation Principle - Principio da segregação de interface (ISP)_**

Basicamente, este principio diz que uma Classe não deve ser forçada a implementar um método que não faça sentido para ela. Ao invés de ter uma Interface única, faz sentido ter Interfaces especificas para cada Classe, assim evita-se de implementar um método em uma Classe que não irá utiliza-lo
  
**_D - Dependency Inversion Principle - Principio da Inversão de Dependencia (DIP)_**
  
O Princípio da Inversão de Dependência diz: “dependa de abstrações e não de implementações concretas”.
Assim, é recomendado que os módulos de alto nível não dependam diretamente dos detalhes de implementação de módulos de baixo nível.
Em vez disso, eles devem depender de abstrações ou interfaces que definem contratos de funcionamento. Isso promove maior flexibilidade e facilita a manutenção do sistema.
  
Dentro do pacote  dependencyInversionPrinciple
Temos o seguinte exemplo: 
  ```
public interface InterfacePedidoRepository {
	
	void salvarPedido(Pedido pedido); 

}
```
  
Temos a interface InterfacePedidoRepository que define um contrato, mas qual?
O contrato de salvarPedido(), note, que não existe nenhuma implementação, mas sim a definição de um método “Contrato”

 ```    
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
```
  
  
Note que na classe PedidoService temos a abstração da InterfacePedidoRepository, dessa forma temos a dependência da abstração e não da implementação concreta
Podemos ver de forma clara, a abstração de salvarPedido(), sem nos preocupar com a implementação.

  ```
public class ControllerPedido {
	
	public PedidoService service;
	
	public ControllerPedido(PedidoService service ) {
		this.service = service;
		
	}
	
    public void adicionarPedido(Pedido pedido) {
    	
    	service.processarPedido(pedido);
    	
}
    
}
  ```
Podemos ver também, o princípio da inversão de dependência no ControllerPedido, onde temos a injeção do PedidoService.
Dessa maneira, com o conceito da inversão de dependência, podemos ver novamente a abstração do método processarPedido(), sem nos preocupar com a implementação.




