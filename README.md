**O que é SOLID?**
	
O acrônimo **SOLID** representa os cinco princípios que facilitam o processo de desenvolvimento — o que facilita a manutenção e a expansão do software.
	
Estes princípios são fundamentais na programação orientada a objetos e podem ser aplicados em qualquer linguagem que adote este paradigma.
	
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
  
Exemplo: no pacote openClosedPrinciple, a classe Animal é extendida pela classe Cachorro e Passaro, onde os métodos declarados dentro de Animal, são herdados pelas *Classes filhas.*
Cachorro e Passaro, implementam os métodos de Animal de diferentes formas, dessa maneira abrimos a classe Animal para "extensão"

```
public abstract class Animal {
	protected float peso;
	protected int idade;
	protected int membros;
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();


}
```
```
	public class Cachorro extends Animal {

	@Override
	public void locomover() {
		System.out.println("Andando");		
		
	}

	@Override
	public void alimentar() {
		System.out.println("Ração");		
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Late");		
		
	}

}
```
```
 public class Passaro extends Animal{

	@Override
	public void locomover() {
		System.out.println("Voar");		
		
	}

	@Override
	public void alimentar() {
		System.out.println("Sementes e grãos");		
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Inato");		
		
	}

}
```



Aberto para extensão significa que, ao receber um novo requerimento, é possível adicionar um novo comportamento. Fechado para modificação significa que, para introduzir um novo comportamento (extensão), não é necessário modificar o código existente

**_L - Liskov Substitution Principle (LSP)_**

“Classes derivadas (ou classes-filhas) devem ser capazes de substituir suas classes-base (ou classes-mães)”.
Ou seja, uma classe-filha deve ser capaz de executar tudo que sua classe-mãe faz. Esse princípio se conecta com o polimorfismo e reforça esse pilar da POO.

 ```
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
 ```
```
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
```
	  
No código acima, podemos ver a Classe base **mãe - Aluno** sendo estendida para a Classe **filha - NivelSuperior**, nota-se que a classe *filha* herda todos os atributos e comportamentos da Classe da *mãe - Aluno*. Observe que o método imprimirDados(), declarado na Classe **mãe - Aluno**, é sobreposto na Classe **filha - NivelSuperior** tendo um comportamento completamente diferente do comportamento do mesmo método da Classe mãe. Esse comportamento, lembra o conceito de POLIMORFISMO, onde um objeto/classe/método pode se comportar de diferentes formas.

 Observe:

O metódo imprimirDados() da Classe Aluno é o mesmo da Classe NivelSuperior, porém a Classe NivelSuperior estende a Classe Aluno com isto, podemos ver o mesmo metódo se comportando de forma diferente.
 ```
 public abstract class Aluno {
	private String nome;
	private int matricula;
	private String curso;
 	public void imprimirDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Nome: "+this.matricula);
		System.out.println("Nome: "+this.curso);
	}
}
```

```
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
```
	
Também, é de se notar que na classe **Main**, é possível ver a Classe base **mãe - Aluno** sendo substituída, como diz no conceito de LISKOV.
```
public class Main {

	public static void main(String[] args) {
		Aluno nivelSuperior1 = new NivelSuperior("Chiquinho", 6977968, "Medicina","Graduação","01/02/2005");
		Aluno nivelSuperior2 = new NivelSuperior("Francisco", 2514326, "Odontologia","Graduação","01/02/2005");
		nivelSuperior1.imprimirDados();
		nivelSuperior2.imprimirDados();

		
		

	}

}
```
	  	  
**_I - Interface Segregation Principle - Principio da segregação de interface (ISP)_**

Basicamente, este principio diz que uma Classe não deve ser forçada a implementar um método que não faça sentido para ela. Ao invés de ter uma Interface única, faz sentido ter Interfaces especificas para cada Classe, assim evita-se de implementar um método em uma Classe que não irá utiliza-lo.

```
package interfaceSegregationPrinciple;

public class Carro implements InterfaceCarro {
	private String ano;
	private String modelo;
	private String fabricante;
	
	public Carro(String ano, String modelo, String fabricante) {
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
```
Observe que a Classe Carro implementa a interface InterfaceCarro.
O que isso significa? InterfaceCarro tem comportamentos que um carro convencional tem logo, a Classe Carro implementa InterfaceCarro. Por outro lado, temos a Classe CarroEletrico mas, um carro eletrico existem um comportamento diferente que é, trocarFonte() logo, se faz necessario a Classe CarroEletrico implementar uma interface especifica, por isso, temos a InterfaceCarro.

A Classe Carro, não poderia implementar InterfaceCarro, pois estaria implementando um metodo que nao faz sentido a ela.

É de se notar, que a Classe CarroEletrico, estende a Classe Carro mas, porque isso acontece? Um Carro Eletrico tem os mesmos comportamentos de um carro convencional portanto a classe CarroEletrico herda todos os atributos e Comportamentos de Carro, mas a Classe Carro não tem todos os comportamentos de CarroEletrico,
	
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




