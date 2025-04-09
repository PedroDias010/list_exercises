import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu
        System.out.println("Menu:");
        System.out.println("    1. Círculo");
        System.out.println("    2. Triangulo Retângulo");
        System.out.println("    3. Retângulo");
        System.out.println("--------------------------");

        // Solicita a opção
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.println("--------------------------");

        // Processa a opção escolhida
        switch (opcao) {
            case 1: // Círculo
                System.out.print("Informe o raio: ");
                double raio = scanner.nextDouble();

                double areaCirculo = Math.PI * raio * raio;
                double perimetroCirculo = 2 * Math.PI * raio;

                System.out.println("--------------------------");
                System.out.printf("Área = %.2f%n", areaCirculo);
                System.out.printf("Perímetro = %.2f%n", perimetroCirculo);
                break;

            case 2: // Triângulo Retângulo
                System.out.print("Informe a base: ");
                double base = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();

                // Área = (base * altura) / 2
                double areaTriangulo = (base * altura) / 2;
                // Perímetro = base + altura + hipotenusa
                double hipotenusa = Math.sqrt(base * base + altura * altura);
                double perimetroTriangulo = base + altura + hipotenusa;

                System.out.println("--------------------------");
                System.out.printf("Área = %.2f%n", areaTriangulo);
                System.out.printf("Perímetro = %.2f%n", perimetroTriangulo);
                break;

            case 3: // Retângulo
                System.out.print("Informe a base: ");
                double baseRet = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaRet = scanner.nextDouble();

                double areaRetangulo = baseRet * alturaRet;
                double perimetroRetangulo = 2 * (baseRet + alturaRet);

                System.out.println("--------------------------");
                System.out.printf("Área = %.2f%n", areaRetangulo);
                System.out.printf("Perímetro = %.2f%n", perimetroRetangulo);
                break;

            default:
                System.out.println("Opção inválida! Escolha um número entre 1 e 3.");
                break;
        }

        scanner.close();
    }
}