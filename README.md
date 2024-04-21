**_Single Responsiblity Principle (SRP)_**     

“Cada classe deve ter um, e somente um, motivo para mudar.”    

Se uma classe tem várias responsabilidades, mudar um requisito do projeto pode trazer várias razões para modificar a classe. Por isso, as classes devem ter responsabilidades únicas.    

Usando esse princípio no projeto, pode-se dizer que a classe Compra, realiza as responsabilidades da classe Compra, ou seja, o metódo de imprimirCompra() imprimi todos os dados de uma compra.

**_Open/Closed Principle (OCP)_**
  
O princípio de Aberto/Fechado propõe que entidades (classes, funções, módulos, etc.) devem ser abertas para extensão, mas fechadas para modificação.  
  
Exemplo: no pacote openClosedPrinciple, a classe Animal é extendida pela classe Cachorro e Passaro, onde os métodos  declarados dentro de Animal, são herdados por Cachorro e Passaro.
Cachorro e Passaro, implementam os métodos de Animal de diferentes formas. Dessa maneira, abrimos a classe Animal para "extensão"

Aberto para extensão significa que, ao receber um novo requerimento, é possível adicionar um novo comportamento. Fechado para modificação significa que, para introduzir um novo comportamento (extensão), não é necessário modificar o código existente

**_Liskov Substitution Principle (LSP)_**
  
Dentro do pacote liscovSubstitutionPrinciple tem a classe base “mãe” Aluno, onde a classe “filha” NivelSuperior herda todos os atributos e comportamentos da classe Aluno. Observe que o método imprimirDados(), declarado na classe Aluno, é sobreposto na classe NivelSuperior tendo um comportamento completamente diferente do comportamento do mesmo método da classe mãe. Esse comportamento, lembra o conceito de POLIMORFISMO, onde um objeto/classe/método pode se comportar de diferentes formas.

Também, é de se notar que na classe MAIN, é possível ver a classe base “mãe” sendo substituída, como diz no conceito de LISKOV.
  
Exemplo: Aluno nivelSuperior2 = new NivelSuperior("Francisco", 2514326, "Odontologia");
  
**_I - Interface Segregation Principle - Principio da segregação de interface_**

Basicamente, este principio diz que uma Classe não deve ser forçada a implementar um método que não faça sentido para ela. Ao invés de ter uma Interface única, faz sentido ter Interfaces especificas para cada Classe, assim evita-se de implementar um método em uma Classe que não irá utiliza-lo



