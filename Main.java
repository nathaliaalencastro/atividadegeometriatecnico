import java.util.Scanner;

// executar
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //CalculadoraFormas calculadoraFormas = new CalculadoraFormas();
        //FormaGeometrica formaGeometrica = new FormaGeometrica();
        //FormaGeometricaEspacial formaGeometricaEspacial = new FormaGeometricaEspacial();
        //FormaGeometricaPlana formaGeometricaPlana = new FormaGeometricaPlana();
        

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Calcular área de forma geométrica plana");
            System.out.println("2. Calcular área e volume de forma geométrica espacial");
            System.out.println("3. Calcular área de formas geométricas especiais");
            System.out.println("4. Encerrar o programa\n");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor da base da forma plana:");
                double base = scanner.nextDouble();
                System.out.println("Digite o valor da altura da forma plana:");
                double altura = scanner.nextDouble();

                FormaGeometricaPlana formaPlana = new FormaGeometricaPlana(base, altura);
                System.out.println("A área da forma plana é: " + formaPlana.calcularArea());
            } else if (opcao == 2) {
                System.out.println("Digite a base da forma espacial:");
                double base = scanner.nextDouble();
                System.out.println("Digite a altura da forma espacial:");
                double altura = scanner.nextDouble();
                System.out.println("Digite a profundidade da forma espacial:");
                double profundidade = scanner.nextDouble();

                FormaGeometricaEspacial formaEspacial = new FormaGeometricaEspacial(base, altura, profundidade);
                System.out.println("A área da forma espacial é: " + formaEspacial.calcularArea());
                System.out.println("O volume da forma espacial é: " + formaEspacial.calcularVolume());
            } else if (opcao == 3) {
                System.out.println("Escolha a forma geométrica especial:");
                System.out.println("1. Quadrado");
                System.out.println("2. Retângulo");
                System.out.println("3. Triângulo");
                System.out.println("4. Trapézio");
                System.out.println("5. Losango");
                System.out.println("6. Paralelogramo");

                int opcaoFormaEspecial = scanner.nextInt();

                switch (opcaoFormaEspecial) {
                    case 1:
                        System.out.println("Digite o lado do quadrado:");
                        double ladoQuadrado = scanner.nextDouble();
                        System.out.println("A área do quadrado é: " + CalculadoraFormas.calcularAreaQuadrado(ladoQuadrado));
                        break;
                    case 2:
                        System.out.println("Digite a base do retângulo:");
                        double baseRetangulo = scanner.nextDouble();
                        System.out.println("Digite a altura do retângulo:");
                        double alturaRetangulo = scanner.nextDouble();
                        System.out.println("A área do retângulo é: " + CalculadoraFormas.calcularAreaRetangulo(baseRetangulo, alturaRetangulo));
                        break;
                    case 3:
                        System.out.println("Digite a base do triângulo:");
                        double baseTriangulo = scanner.nextDouble();
                        System.out.println("Digite a altura do triângulo:");
                        double alturaTriangulo = scanner.nextDouble();
                        System.out.println("A área do triângulo é: " + CalculadoraFormas.calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
                        break;
                    case 4:
                        System.out.println("Digite a base maior do trapézio:");
                        double baseMaiorTrapezio = scanner.nextDouble();
                        System.out.println("Digite a base menor do trapézio:");
                        double baseMenorTrapezio = scanner.nextDouble();
                        System.out.println("Digite a altura do trapézio:");
                        double alturaTrapezio = scanner.nextDouble();
                        System.out.println("A área do trapézio é: " + CalculadoraFormas.calcularAreaTrapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio));
                        break;
                    case 5:
                        System.out.println("Digite a diagonal maior do losango:");
                        double diagonalMaiorLosango = scanner.nextDouble();
                        System.out.println("Digite a diagonal menor do losango:");
                        double diagonalMenorLosango = scanner.nextDouble();
                        System.out.println("A área do losango é: " + CalculadoraFormas.calcularAreaLosangulo(diagonalMaiorLosango, diagonalMenorLosango));
                        break;
                    case 6:
                        System.out.println("Digite a base do paralelogramo:");
                        double baseParalelogramo = scanner.nextDouble();
                        System.out.println("Digite a altura do paralelogramo:");
                        double alturaParalelogramo = scanner.nextDouble();
                        System.out.println("A área do paralelogramo é: " + CalculadoraFormas.calcularAreaParalelogramo(baseParalelogramo, alturaParalelogramo));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}