import java.util.Scanner; //utilizando o import scanner para deixar o codigo mais dinamico

public class teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //implementando o scan para teste de scanner com o while e for
        System.out.println("Seja bem-vindo ao meu teste de while e for");

        System.out.println("Primeiro, digite um numero para o teste de while...");
        System.out.println("O numero deve ser menor que 15! Vamos la!");

        int contador = scan.nextInt(); //entrada da pergunta ao cliente

        while (contador <= 15) {   //teste do while aqui
            System.out.println(contador + 1); //utilizando o +1 para nao repetir  o codigo quando for perguntado ao cliente
            contador++;
        }

        System.out.println("Vamos inciar o teste de for agora...");

        System.out.println("Diga um numero menor que 5...");

        for (int contador2 = scan.nextInt(); contador2 < 5; contador2++){ //iniciando o metodo for com a dinamica de perguntar ao cliente
            System.out.println(contador2 + 1); //utlizando o +1 para nao repetir o numero quando for perguntado
        }
    }
}
