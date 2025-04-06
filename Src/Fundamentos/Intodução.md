# ☕ Introdução à Linguagem Java
###### Estudante: [Francisco Porfirio](https://github.com/Porfirio24)
- O que é o Java

Java é uma linguagem de programação e também uma plataforma de desenvolvimento criada em 1995 pela Sun Microsystems. Ela é usada para criar programas que funcionam em diversos dispositivos, como computadores, celulares, servidores, caixas eletrônicos, e até Smart TVs.

A linguagem Java é composta por um conjunto de funcionalidades (Features) bem definidas, o que acaba se tornando excelentes para quem busca entrar no mundo de programação obtendo diversos conhecimentos na area.

Com seu foco sendo voltado a Programção Orientada ao Objeto tudo é escrito em termos de classes e Objetos.

# Caracteristicas Principais:

- Orientada a Objetos: usa o conceito de classes e objetos para organizar o código.

- Portável: escreva o código uma vez e execute em qualquer lugar com a JVM (Java Virtual Machine).

- Segura: possui recursos que ajudam a evitar falhas e invasões.

- Multiplataforma: funciona no Windows, Mac, Linux e mais.

- Robusta: trata erros e gerencia a memória automaticamente (garbage collector).

‼️Vale lembra que no Java existem algumas palavras reservadas para apresentação dos tipos de dados basicos que precisam ser manipulados para a contrução do programa que são conhecidos como (Primitive Types)

Que São : Int,byte,short,long,float,double,boolean e char - esses tipos representam valores brutos, por tanto não são consideros objetos

# Introção Inicial

 **Declaração de Variavel:**
 Variável é uma área da mémoria associada a um nome que pode armazenar valores de um determinado tipo. No java é utilizado identificadores que representam um valor na mémoria, e essa referência pode ser redirecionada a outro valor portanto essa é a causa do nome "variável" pois o valor pode variar.Onde seguindo a linguagem de programação é composta por: Tipo de dado + Identificação + Valor Atribuido (opsional)

- Exemplos:
 ```java
  int idade;// Tipo "int", nome "idade", com nenhum valor atribuido 
  int AnoFabricação = 2021; // Tipo "int",nome "AnoFabricação", com o valor atribuido de 2021
  double Salario = 2.500 // Tipo "doubler", nome "Salario", com o valor atribuido de 2.500
 ```
‼️E importante lembrar que no exemplo do salário não e necessario colocar o ponto pois o sistema ja entende que o valor é 2500 reias, a menos que você queira colocar os centavos ai pode se adicionar o ".".

 ```java
 double salario = 2500.34// então agora o sistema entende como dois e quinhentos reais e trinta e quatro centavos
 ```

**📝Algumas peculiaridades sobre tipos específicos:**
```java
public class TipoDados{
   public static void main(String[] args){
     byte idade = 123;
     short ano = 2021;
     int cep = 29865000;//se começar com zero, talvez tenha que mudar o tipo
     long cpf = 98765432109L;//se começar com zero, talvez tenha que mudar o tipo
     float pi = 3.14F;
     double salario = 1275.33;
   }

}
```
‼️Uma observação e que o tipo Long precisa se colocar o "L" no final da declaração, assim como o tipo Float que precisa colocar o "F" no final da sua declaração

**Constantes**
As constantes são valores armazenados na memória que não podem ser modificados depois de serem declarados. Em java, esses valores são representados pela palavra reservada final, seguida do tipo. Por convenção as Constantes são escrita em Caixa Alto

- Exemplo:
```java
double Valor_DE_PI= 3.14;

Valor_DE_PI = 10.75;
```
Nesse exemplo o valor de PI está sendo alterado.

```java
final double valor_DE_PI = 3.14;

Valor_DE_PI = 10.75
```
Ao adicionar o "Final" faz com que o valor de PI não possa mais ser alterado.

‼️Compreendesse que para declarar uma variável como uma constante, utilizando a palavra Final, mas por convenção, esta variavel deverá ser escrita toda em caixa alta