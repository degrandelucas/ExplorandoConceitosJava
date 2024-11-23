import java.util.Scanner;

public class ExplorandoConceitosJava {
    public static void main(String[] args) {
        int escolha = 0;
        Scanner leitura = new Scanner(System.in);
        do {
            System.out.println("----------------------------------------------");
            System.out.println("Menu de Explorando Conceitos da Linguagem Java");
            System.out.println("----------------------------------------------");
            System.out.println("Escolha uma Opção");
            System.out.println("1 - Seu número é posítivo ou negativo?");
            System.out.println("2 - Comparando dois números.");
            System.out.println("3 - Calcular área do quadrado ou Calcular área do círculo.");
            System.out.println("4 - Tabuada de um número.");
            System.out.println("5 - Seu número é par ou ímpar?");
            System.out.println("6 - Fatorial de um número.");
            System.out.println("0 - Sair");
            escolha = leitura.nextInt();
            if (escolha >= 0 && escolha <= 6) {
                switch (escolha) {
                    case 1:
                        PositivoOuNegativo.NumeroPositivoOuNegativo();
                        break;
                    case 2:
                        ComparandoNumeros.ComparandoDoisNumeros();
                        break;
                    case 3:
                        Area.AreaQuadradoECirculo();
                        break;
                    case 4:
                        Tabuada.NumeroTabuada();
                        break;
                    case 5:
                        ParOuImpar.NumeroParOuImpar();
                        break;
                    case 6:
                        Fatorial.NumeroFatorial();
                        break;
                    default: //Como se fosse a opção 0
                        System.out.println("Saindo...");
                        break;
                }
            } else {
                System.out.printf("Escolha uma opção válida;\n");
            }
        } while (escolha != 0);
        leitura.close();
    }
}