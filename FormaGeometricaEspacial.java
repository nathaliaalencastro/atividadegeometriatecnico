// Classe filha para formas geométricas espaciais

class FormaGeometricaEspacial {

    // Volume PRISMA
    public double calcularVolumePrisma(double base, double altura, double profundidade) {
        double volume = base * altura * profundidade;
        return volume;
    }

    // Área PRISMA
    public double calcularAreaSuperficiePrisma(double base, double altura, double profundidade) {
        double areaBase = base * altura;
        double areaLateral = 2 * (base * profundidade + altura * profundidade);
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }
 
    // Volume CILINDRO
    public double calcularVolumeCilindro(double raio, double altura) {
        double volume = Math.PI * raio * raio * altura;
        return volume;
    }
 
    // Área CILINDRO
    public double calcularAreaSuperficieCilindro(double raio, double altura) {
        double areaBase = Math.PI * raio * raio;
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }
 
    // Volume PIRÂMIDE 
    public double calcularVolumePiramide(double base, double altura) {
        double volume = (1.0 / 3.0) * base * altura;
        return volume;
    }
 
    // Área PIRÂMIDE
    public double calcularAreaSuperficiePiramide(double base, double altura, double apotema) {
        double areaBase = base * base;
        double areaLateral = 2 * base * apotema;
        double areaTotal = areaBase + areaLateral;
        return areaTotal;
    }
 
    // Volume ESFERA
    public double calcularVolumeEsfera(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        return volume;
    }
 
    // Área ESFERA
    public double calcularAreaSuperficieEsfera(double raio) {
        double area = 4 * Math.PI * Math.pow(raio, 2);
        return area;
    }
 
    // Volume CONE
    public double calcularVolumeCone(double raio, double altura) {
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 3) * altura;
        return volume;
    }
 
    // Área CONE
    public double calcularAreaSuperficieCone(double raio, double altura) {
        double areaBase = Math.PI * Math.pow(raio, 2);
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        double areaLateral = Math.PI * raio * geratriz;
        double areaTotal = areaBase + areaLateral;
        return areaTotal;
    }
 
    // Volume CONE
    public double calcularVolumeTronco(double raioMaior, double raioMenor, double altura) {
        double volume = (1.0 / 3.0) * Math.PI * altura * (Math.pow(raioMaior, 2) + Math.pow(raioMenor, 2) + raioMaior * raioMenor);
        return volume;
    }
 
    // Área CONE
    public double calcularAreaSuperficieTronco(double raioMaior, double raioMenor, double altura) {
        double geratriz = Math.sqrt(Math.pow((raioMaior - raioMenor), 2) + Math.pow(altura, 2));
        double areaBaseMaior = Math.PI * Math.pow(raioMaior, 2);
        double areaBaseMenor = Math.PI * Math.pow(raioMenor, 2);
        double areaLateral = Math.PI * geratriz * (raioMaior + raioMenor);
        double areaTotal = areaBaseMaior + areaBaseMenor + areaLateral;
        return areaTotal;
    }
}