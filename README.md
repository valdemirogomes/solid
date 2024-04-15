**_Single Responsiblity Principle (SRP)_**     

“Cada classe deve ter um, e somente um, motivo para mudar.”    

Se uma classe tem várias responsabilidades, mudar um requisito do projeto pode trazer várias razões para modificar a classe. Por isso, as classes devem ter responsabilidades únicas.    

Usando esse princípio no projeto, pode-se dizer que a classe Compra, realiza as responsabilidades da classe Compra, ou seja, o metódo de imprimirCompra() imprimi todos os dados de uma compra.

**_Open/Closed Principle (OCP)_**
  
O princípio de Aberto/Fechado propõe que entidades (classes, funções, módulos, etc.) devem ser abertas para extensão, mas fechadas para modificação.  
  
Exemplo: no pacote openClosedPrinciple, a classe Animal é extendida pela classe Cachorro e Passaro, onde os métodos  declarados dentro de Animal, são herdados por Cachorro e Passaro.
Cachorro e Passaro, implementam os métodos de Animal de diferentes formas. Dessa maneira, abrimos a classe Animal para "extensão"

Aberto para extensão significa que, ao receber um novo requerimento, é possível adicionar um novo comportamento. Fechado para modificação significa que, para introduzir um novo comportamento (extensão), não é necessário modificar o código existente
