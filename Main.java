import java.util.Scanner;

// executar
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraFormas geometriaPlana = new CalculadoraFormas();
        FormaGeometricaEspacial geometriaEspacial = new FormaGeometricaEspacial();
        //CalculadoraFormas calculadoraFormas = new CalculadoraFormas();
        //FormaGeometrica formaGeometrica = new FormaGeometrica();
        //FormaGeometricaEspacial formaGeometricaEspacial = new FormaGeometricaEspacial();
        //FormaGeometricaPlana formaGeometricaPlana = new FormaGeometricaPlana();
        System.out.println("\nSeja bem vindo a calculadora de geoometria plana e espacial!");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Calcular área de forma geométrica plana");
            System.out.println("2. Calcular área e volume de forma geométrica espacial");
            System.out.println("3. Encerrar o programa\n");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("\nEscolha a forma geométrica plana:");
                System.out.println("1. Quadrado");
                System.out.println("2. Retângulo");
                System.out.println("3. Triângulo");
                System.out.println("4. Triângulo equilátero");
                System.out.println("5. Trapézio");
                System.out.println("6. Losango");
                System.out.println("7. Paralelogramo");
                System.out.println("8. Círculo");
                int opcao1 = scanner.nextInt();
                System.out.println("\nForma escolhida: "+opcao1+".");


                switch (opcao1) {
                    case 1:
                    System.out.println("\nDigite o valor do lado:");
                    double lado = scanner.nextDouble();

                    CalculadoraFormas calcularAreaQuadrado = new CalculadoraFormas();
                        System.out.println("A área da forma plana é: " + geometriaPlana.calcularAreaQuadrado(lado));
                        break;

        
                    case 2:
                    System.out.print("\nDigite a base do retângulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                        System.out.println("Área do retângulo: " + geometriaPlana.calcularAreaRetangulo(base, altura));
                        break;

                    case 3:
                    System.out.print("\nDigite a base do triângulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área do triângulo: " + geometriaPlana.calcularAreaTriangulo(base, altura));
                        break;
                    
                    case 4:
                    System.out.print("\nDigite o lado do triângulo equilátero: ");
                    lado = scanner.nextDouble();
                    System.out.println("Área do triângulo equilátero: " + geometriaPlana.calcularAreaTrianguloEquilatero(lado));
                        break;

                    case 5:
                    System.out.print("\nDigite a base maior do trapézio: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a base menor do trapézio: ");
                    double baseMenor = scanner.nextDouble();
                    System.out.print("Digite a altura do trapézio: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área do trapézio: " + geometriaPlana.calcularAreaTrapezio(base, baseMenor, altura));

                    case 6:
                    System.out.print("\nDigite a diagonal maior do losango: ");
                    double diagonalMaior = scanner.nextDouble();
                    System.out.print("Digite a diagonal menor do losango: ");
                    double diagonalMenor = scanner.nextDouble();
                    System.out.println("Área do losango: " + geometriaPlana.calcularAreaLosango(diagonalMaior, diagonalMenor));
                    break;

                    case 7:
                    System.out.print("\nDigite a base do paralelogramo: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a altura do paralelogramo: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área do paralelogramo: " + geometriaPlana.calcularAreaParalelogramo(base, altura));
                    break;

                    case 8: 
                    System.out.println("\nDigite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    System.out.println("Área do círculo: " + geometriaPlana.calcularAreaCirculo(raio));

                    default:
                    System.err.println("\nOpção inválida!");
                        break;
                }
                    break;

                case 2:
                System.out.println("\nEscolha a forma geométrica especial:");
                System.out.println("1. Prismas");
                System.out.println("2. Cilindro");
                System.out.println("3. Pirâmide");
                System.out.println("4. Esfera");
                System.out.println("5. Cone");
                System.out.println("6. Tronco de cone");
                
                int opcaoFormaEspecial = scanner.nextInt();

                switch (opcaoFormaEspecial) {
                    case 1:
                        System.out.print("\nDigite a base do prisma: ");
                        double basePrisma = scanner.nextDouble();
                        System.out.print("Digite a altura do prisma: ");
                        double alturaPrisma = scanner.nextDouble();
                        System.out.print("Digite a profundidade do prisma: ");
                        double profundidadePrisma = scanner.nextDouble();
                        double volumePrisma = geometriaEspacial.calcularVolumePrisma(basePrisma, alturaPrisma, profundidadePrisma);
                        double areaSuperficiePrisma = geometriaEspacial.calcularAreaSuperficiePrisma(basePrisma, alturaPrisma, profundidadePrisma);
                        System.out.println("Área da superfície do prisma: " + areaSuperficiePrisma);
                        System.out.println("Volume do prisma: " + volumePrisma);
                    break;
                        
                    case 2:
                        System.out.print("\nDigite o raio do cilindro: ");
                        double raioCilindro = scanner.nextDouble();
                        System.out.print("Digite a altura do cilindro: ");
                        double alturaCilindro = scanner.nextDouble();
                        double volumeCilindro = geometriaEspacial.calcularVolumeCilindro(raioCilindro, alturaCilindro);
                        double areaSuperficieCilindro = geometriaEspacial.calcularAreaSuperficieCilindro(raioCilindro, alturaCilindro);
                        System.out.println("Área da superfície do cilindro: " + areaSuperficieCilindro);
                        System.out.println("Volume do cilindro: " + volumeCilindro);
                    break;

                    case 3:
                        System.out.print("\nDigite a base da pirâmide: ");
                        double basePiramide = scanner.nextDouble();
                        System.out.print("Digite a altura da pirâmide: ");
                        double alturaPiramide = scanner.nextDouble();
                        System.out.print("Digite a apotema da pirâmide: ");
                        double apotemaPiramide = scanner.nextDouble();
                        double volumePiramide = geometriaEspacial.calcularVolumePiramide(basePiramide, alturaPiramide);
                        double areaSuperficiePiramide = geometriaEspacial.calcularAreaSuperficiePiramide(basePiramide, alturaPiramide, apotemaPiramide);
                        System.out.println("Área da superfície da pirâmide: " + areaSuperficiePiramide);
                        System.out.println("Volume da pirâmide: " + volumePiramide);
                    break;

                    case 4:
                        System.out.print("\nDigite o raio da esfera: ");
                        double raioEsfera = scanner.nextDouble();
                        double volumeEsfera = geometriaEspacial.calcularVolumeEsfera(raioEsfera);
                        double areaSuperficieEsfera = geometriaEspacial.calcularAreaSuperficieEsfera(raioEsfera);
                        System.out.println("Área da superfície da esfera: " + areaSuperficieEsfera);
                        System.out.println("Volume da esfera: " + volumeEsfera);
                    break;

                    case 5:
                        System.out.print("\nDigite o raio do cone: ");
                        double raioCone = scanner.nextDouble();
                        System.out.print("Digite a altura do cone: ");
                        double alturaCone = scanner.nextDouble();
                        double volumeCone = geometriaEspacial.calcularVolumeCone(raioCone, alturaCone);
                        double areaSuperficieCone = geometriaEspacial.calcularAreaSuperficieCone(raioCone, alturaCone);
                        System.out.println("Área da superfície do cone: " + areaSuperficieCone);
                        System.out.println("Volume do cone: " + volumeCone);
                    break;

                    case 6:
                        System.out.print("\nDigite o raio maior do tronco de cone: ");
                        double raioMaiorTronco = scanner.nextDouble();
                        System.out.print("Digite o raio menor do tronco de cone: ");
                        double raioMenorTronco = scanner.nextDouble();
                        System.out.print("Digite a altura do tronco de cone: ");
                        double alturaTronco = scanner.nextDouble();
                        double volumeTronco = geometriaEspacial.calcularVolumeTronco(raioMaiorTronco, raioMenorTronco, alturaTronco);
                        double areaSuperficieTronco = geometriaEspacial.calcularAreaSuperficieTronco(raioMaiorTronco, raioMenorTronco, alturaTronco);
                        System.out.println("Área da superfície do tronco de cone: " + areaSuperficieTronco);
                        System.out.println("Volume do tronco de cone: " + volumeTronco);
                    break;
                        
                    default:
                        System.err.println("\nOpção inválida!");
                    break;
                }

            case 3:
            System.out.println("\nFinalizando programa!");
            }
        }
    }
}