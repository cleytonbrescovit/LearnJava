import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cleyton on 20/04/16.
 */
public class ContaVotos {

    //Conta votos Unitarios
    public void contaVotos(List<Pessoas> bd) {
        int sim = 0, nao = 0;

        for (int c = 0; c < bd.size(); c++) {

            if (bd.get(c).getVoto().equals("sim")) {
                sim += 1;
            } else {
                nao += 1;
            }
        }
        System.out.println("Total de Votos Sim: " + sim + " | Total de Votos Não: " + nao);
    }

    //Conta votos por estado
    public void contaVotosEstado(List<Pessoas> bd) {
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        Map<String, Integer> m2 = new HashMap<String, Integer>();

        int maiorVotoSim = 0, maiorVotoNao = 0;
        String estadoSim = "", estadoNao = "";

        for (Pessoas pessoa : bd) {

            Integer aux1 = m1.get(pessoa.getEstado());
            Integer aux2 = m2.get(pessoa.getEstado());


            if (aux1 == null) {
                if (pessoa.getVoto().equals("sim")) {
                    m1.put(pessoa.getEstado(), 1);
                }

            } else {
                if (pessoa.getVoto().equals("sim")) {
                    m1.put(pessoa.getEstado(), aux1 + 1);
                    if(m1.get(pessoa.getEstado()) > maiorVotoSim){
                        maiorVotoSim = m1.get(pessoa.getEstado());
                        estadoSim = pessoa.getEstado();
                    }
                }
            }

            if (aux2 == null) {
                if (pessoa.getVoto().equals("nao")) {
                    m2.put(pessoa.getEstado(), 1);
                }

            } else {
                if (pessoa.getVoto().equals("nao")) {
                    m2.put(pessoa.getEstado(), aux2 + 1);
                    if(m2.get(pessoa.getEstado()) > maiorVotoNao){
                        maiorVotoNao = m2.get(pessoa.getEstado());
                        estadoNao = pessoa.getEstado();
                    }
                }
            }
        }
        System.out.println("O estado de " + estadoSim.toUpperCase() + " teve " + maiorVotoSim + " votos SIM. | O estado de " + estadoNao.toUpperCase() + " teve " + maiorVotoNao + " votos NÃO.");
    }
}
