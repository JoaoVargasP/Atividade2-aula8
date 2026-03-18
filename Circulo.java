public class Circulo extends Forma {
    double raio;

    public Circulo(String cor, String preenchida, double raio){
        super(cor, preenchida);
        this.raio = raio;
    }

    public void calculararea(){
        double area = 3.14 * (raio * raio);
        System.out.println("Area do circulo: " + area);
    }
}
