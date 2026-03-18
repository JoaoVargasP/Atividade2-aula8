public class Retangulo extends Forma {
    double largura;
    double altura;

    public Retangulo(String cor, boolean preenchida, double largura, double altura){
        super(cor, preenchida);
        this.largura = largura;
        this.altura = altura;
    }

    public void calculararea(){
        double area = largura * altura;
        System.out.println("Area do retangulo: " + area);
    }
}
