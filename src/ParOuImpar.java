import java.util.Scanner;

public class ParOuImpar {
    public static void NumeroParOuImpar() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Digite o número inteiro para verificar se é Par ou Ímpar");
        int numero = leitura.nextInt();
        int restoDivisao = numero % 2;
        if (restoDivisao !=0 ) {
            System.out.println(String.format("O número %d é Ímpar", numero));
        } else
            System.out.println(String.format("O número %d é Par", numero));
    }
}
