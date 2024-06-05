// Classe filha para formas geométricas espaciais

class FormaGeometricaEspacial extends FormaGeometrica {
    double base;
    double altura;
    double profundidade;

    // construtor
    public FormaGeometricaEspacial(double base, double altura, double profundidade) {
        this.base = base;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    // Método para calcular a área
    double calcularArea() {
        // Área paralelepípedo
        return 2 * (base * altura + base * profundidade + altura * profundidade);
    }

    // Método para calcular o volume
    double calcularVolume() {
        return base * altura * profundidade;
    }
}