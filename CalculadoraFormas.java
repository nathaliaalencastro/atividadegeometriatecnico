// Classe para cálculos de formas geométricas especiais

class CalculadoraFormas {

    // calcular área de um quadrado
    public double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular área de um retângulo
    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular área de um triângulo
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    //Método para calcular a área de triângulo
    public double calcularAreaTrianguloEquilatero(double altura) {
        return (Math.sqrt(3)/4)*altura*altura;
    }

    // Método para calcular área de um trapézio
    public double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    // Método para calcular área de um losango
    public double calcularAreaLosango(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    // Método para calcular área de um paralelogramo
    public double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular a área do círculo
    public double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
}