/**
 * Created by cleyton on 19/04/16.
 */
public class Pessoa {
    private String nome;
    private int valor;

    public Pessoa(){}

    public Pessoa(String nome, int valor){
        this.nome=nome;
        this.valor=valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
