/**
 * Created by cleyton on 19/04/16.
 */
public class ValorMaior {
    private int valorMaior;
    private String pessoa;

    public int getValorMaior() {
        return valorMaior;
    }
    public String getPessoa() {
        return pessoa;
    }

    public void setValorMaior(String nome ,int valorMaior) {
        if(valorMaior > this.valorMaior){
            this.valorMaior = valorMaior;
            this.pessoa = nome;
        }
    }
}
