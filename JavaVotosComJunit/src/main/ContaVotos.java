package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cleyton on 20/04/16.
 */
public class ContaVotos {

    //Conta votos Unitarios SIM
    public Integer contaVotosSim(List<Pessoas> bd) {
        int votosContados = 0;

        for (int c = 0; c < bd.size(); c++) {

            if (bd.get(c).getVoto().toLowerCase().trim().equals("sim")) {
                votosContados += 1;
            }
        }
        System.out.println("Total de Votos Sim: " + votosContados);
        return votosContados;
    }

    //Conta votos Unitarios NAO
    public Integer contaVotosNao(List<Pessoas> bd) {
        int votosContados = 0;

        for (int c = 0; c < bd.size(); c++) {

            if (bd.get(c).getVoto().toLowerCase().trim().equals("nao")) {
                votosContados += 1;
            }
        }
        System.out.println("Total de Votos Não: " + votosContados);
        return votosContados;
    }

    //Conta votos por estado SIM
    public Integer contaVotosEstadoSim(List<Pessoas> bd) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        int maiorVoto = 0;
        String estado = "";

        for (Pessoas pessoa : bd) {

            Integer aux = map.get(pessoa.getEstado().toLowerCase().trim());

            if (aux == null) {
                if (pessoa.getVoto().toLowerCase().trim().equals("sim")) {
                    map.put(pessoa.getEstado().toLowerCase().trim(), 1);
                }
            } else {
                if (pessoa.getVoto().toLowerCase().trim().equals("sim")) {
                    map.put(pessoa.getEstado().toLowerCase().trim(), aux + 1);
                    if(map.get(pessoa.getEstado().toLowerCase().trim()) > maiorVoto){
                        maiorVoto = map.get(pessoa.getEstado().toLowerCase().trim());
                        estado = pessoa.getEstado();
                    }
                }
            }
        }
        System.out.println("O estado de " + estado.toUpperCase() + " teve " + maiorVoto + " votos SIM.");
        return maiorVoto;
    }

    //Conta votos por estado Nao
    public Integer contaVotosEstadoNao(List<Pessoas> bd) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        int maiorVoto = 0;
        String estado = "";

        for (Pessoas pessoa : bd) {

            Integer aux = map.get(pessoa.getEstado().toLowerCase().trim());

            if (aux == null) {
                if (pessoa.getVoto().toLowerCase().trim().equals("nao")) {
                    map.put(pessoa.getEstado().toLowerCase().trim(), 1);
                }

            } else {
                if (pessoa.getVoto().toLowerCase().trim().equals("nao")) {
                    map.put(pessoa.getEstado().toLowerCase().trim(), aux + 1);
                    if(map.get(pessoa.getEstado().toLowerCase().trim()) > maiorVoto){
                        maiorVoto = map.get(pessoa.getEstado().toLowerCase().trim());
                        estado = pessoa.getEstado();
                    }
                }
            }
        }
        System.out.println("O estado de " + estado.toUpperCase() + " teve " + maiorVoto + " votos NÃO.");
        return maiorVoto;
    }
}
