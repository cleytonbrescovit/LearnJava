package main;

/**
 * Created by cleyton on 20/04/16.
 */
public class Pessoas {
    private String nome;
    private String partido;
    private String estado;
    private String voto;

    public Pessoas(String nome, String partido, String estado, String voto) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.voto = voto;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }
}
