// Classe filha da geométrica, agora somente plana
class FormaGeometricaPlana extends FormaGeometrica {
    double base;
    double altura;

    // construtor
    public FormaGeometricaPlana(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //  método para calcular a área
    double calcularArea() {
        return base * altura;
    }

    //  método para calcular o volume para figuras espaciais
    double calcularVolume() {
        return 0; // sem volume para formas planas
    }
}