// Classe para cálculos de formas geométricas especiais

class CalculadoraFormas {
    static final double PI = 3.14;

    // calcular área de um quadrado
    static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular área de um retângulo
    static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular área de um triângulo
    static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para calcular área de um trapézio
    static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    // Método para calcular área de um losango
    static double calcularAreaLosangulo(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    // Método para calcular área de um paralelogramo
    static double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }
}