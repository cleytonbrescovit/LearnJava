import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cleyton on 20/04/16.
 */
public class ContaVotos {

    //Conta votos Unitarios
    public void contaVotos(List<Pessoas> bd) {
        int sim=0, nao=0;

        for (int c = 0; c < bd.size() ; c++) {

            if(bd.get(c).getVoto().equals("sim")){
                sim += 1;
            }else {
                nao += 1;
            }
        }

        System.out.println("Total de Votos Sim: "+sim+ " | Total de Votos Não: "+nao);
    }

    //Conta votos por estado
    public void contaVotosEstado(List<Pessoas> bd) {
        Map<String, Integer> map = new HashMap<>();

        int maior = 0;
        String estado = "";

        for (Pessoas pessoa : bd) {

            Integer aux = map.get(pessoa.getEstado());

            if (aux == null) {
                map.put(pessoa.getVoto(), 1);
            }else{
                map.put(pessoa.getVoto(), aux + 1);
            }

            //if(maior < map.get(pessoa.getEstado())){
            //    maior = map.get(pessoa.getEstado());
            //    estado = pessoa.getEstado();
            //}

            System.out.println(map.get(pessoa.getEstado()));
        }
        //System.out.println("O estado de "+estado.toUpperCase()+" teve "+maior+" votos a favor. Foi o estado com maior quantidade de votos.");
    }
}
