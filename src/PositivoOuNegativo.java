import java.util.Scanner;

public class PositivoOuNegativo {
    public static void NumeroPositivoOuNegativo() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Escolha um número inteiro para saber se ele é positivo ou negativo?");
        int numero = leitura.nextInt();
        if (numero > 0) {
            System.out.println(String.format("O número %d é positivo", numero));
        } else if (numero < 0) {
            System.out.println(String.format("O número %d é negativo", numero));
        } else
            System.out.println(String.format("O número %d é nulo", numero));

    }
}

