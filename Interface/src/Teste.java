/**
 * Created by cleyton on 18/04/16.
 */
public class Teste {
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());

        AreaCalculavel b = new Quadrado(3);
        System.out.println(b.calculaArea());
    }
}