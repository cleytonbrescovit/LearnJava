/**
 * Created by cleyton on 18/04/16.
 */
public class Retangulo implements AreaCalculavel {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calculaArea() {
        return this.largura * this.altura;
    }
}
