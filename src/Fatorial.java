import java.util.Scanner;

public class Fatorial {
    public static void NumeroFatorial() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Digite o número para cálculo fatorial");
        int numero = leitura.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(String.format("o fatorial do número %d é %d.", numero, fatorial));
    }
}
