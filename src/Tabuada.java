import java.util.Scanner;

public class Tabuada {
    public static void NumeroTabuada() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Digite o número inteiro para tabuada");
        int numero = leitura.nextInt();
        for (int i = 0; i <= 10; i++) {
            int multiplicacao = numero * i;
            System.out.println(String.format("%d x %d = %d", numero, i, multiplicacao));
        }
    }
}
