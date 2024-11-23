import java.util.Scanner;

public class Area {
    public static void AreaQuadradoECirculo() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Escolha qual área deseja calcular.");
        System.out.println("1 - Área Quadrado");
        System.out.println("2 - Área Circulo");
        int escolha = leitura.nextInt();
        if (escolha == 1){
            System.out.println("Digite a medida do lado do quadrado");
            double ladoQuadrado = leitura.nextDouble();
            double areaQuadrado = ladoQuadrado * ladoQuadrado;
            System.out.println(String.format("O área do Quadrado para lado %.2f é %.2f", ladoQuadrado, areaQuadrado));
        } else if (escolha == 2) {
            System.out.println("Digite o raio do circulo");
            double raioCirculo = leitura.nextDouble();
            double areaCirculo = 3.14 * 2 * raioCirculo;
            System.out.println(String.format("O área do círculo para raio %.2f é %.2f", raioCirculo, areaCirculo));
        } else
            System.out.println("Opção não disponível!");
    }
}
