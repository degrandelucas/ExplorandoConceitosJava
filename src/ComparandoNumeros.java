import java.util.Scanner;

public class ComparandoNumeros {
    public static void ComparandoDoisNumeros() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Escolha o primeiro número inteiro para comparação.");
        int numero1 = leitura.nextInt();
        System.out.println("Escolha o segundo número inteiro para comparação.");
        int numero2 = leitura.nextInt();
        if (numero1 > numero2) {
            System.out.println(String.format("O número %d é maior que o número %d", numero1, numero2));
        } else if (numero1 < numero2) {
            System.out.println(String.format("O número %d é menor que o número %d", numero1, numero2));
        } else
            System.out.println(String.format("Os números %d e %d são iguais", numero1, numero2));
    }
}
