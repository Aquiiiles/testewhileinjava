
# Teste de Estruturas de Repetição em Java

Este projeto é um exemplo simples de uso das estruturas de repetição `while` e `for` em Java, com a adição de entrada do usuário por meio da classe `Scanner`. O objetivo é demonstrar como criar loops dinâmicos que interagem com o usuário.

## Descrição do Código

O código realiza os seguintes passos:

1. **Importação da Classe Scanner**
   - O código começa importando a classe `Scanner` do pacote `java.util` para permitir a leitura de entradas do usuário.
   - `import java.util.Scanner;`

2. **Estrutura Principal (`main`)**
   - A função `main` é onde o código é executado.
   - `Scanner scan = new Scanner(System.in);` cria um objeto `Scanner` para ler entradas do usuário.

3. **Teste do Loop `while`**
   - O programa solicita ao usuário que insira um número menor que 15.
   - O loop `while` incrementa o valor inserido e imprime os números subsequentes até que o valor seja igual ou superior a 15.
   - `while (contador < 15) {...}`

4. **Teste do Loop `for`**
   - O programa então solicita ao usuário que insira um número menor que 5.
   - O loop `for` imprime os números subsequentes até que o valor seja igual a 5.
   - `for (int contador2 = scan.nextInt(); contador2 < 5; contador2++) {...}`

## Como Executar o Código

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Aquiiiles/testewhileinjava.git
   cd testewhileinjava
   ```

2. **Compile o código:**
   ```bash
   javac teste.java
   ```

3. **Execute o código:**
   ```bash
   java teste
   ```

4. **Siga as instruções:**
   - O programa solicitará que você insira dois números, um para o teste `while` e outro para o teste `for`.
   - O primeiro número deve ser menor que 15, e o segundo menor que 5.

## Explicações Adicionais

- **Scanner:**
  - A classe `Scanner` é utilizada para capturar a entrada do usuário no console. Isso torna o código mais interativo e dinâmico.
  - Exemplo de uso:
    ```java
    Scanner scan = new Scanner(System.in);
    int numero = scan.nextInt();
    ```

- **Loop `while`:**
  - O loop `while` continua a execução enquanto a condição for verdadeira. No código, ele imprime valores incrementais até que o número atinja 15.

- **Loop `for`:**
  - O loop `for` é utilizado para um número conhecido de iterações. Ele imprime valores incrementais até atingir 5.

## Conclusão

Este exemplo simples demonstra como utilizar loops em Java para criar interações dinâmicas com o usuário. A combinação de `Scanner` com `while` e `for` oferece uma base sólida para entender estruturas de repetição e captura de entradas em Java.
