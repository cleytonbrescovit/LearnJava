import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cleyton on 20/04/16.
 */
public class ContaVotosEstado {

    public void contaVotosSimeNao(List<Pessoas> bd) {
        for (Pessoas pessoa : bd) {
            if (pessoa.getVoto().equals("sim")) {
                System.out.println(pessoa.getEstado() + "," + pessoa.getVoto());
            } else {
                System.out.println(pessoa.getEstado() + "," + pessoa.getVoto());
            }
        }

        System.out.println("---------------------------------");

        Map<String, Integer> map = new HashMap<>();

        int maior = 0;
        String estado = "";

        for (Pessoas pessoa : bd) {

            Integer aux = map.get(pessoa.getEstado());

            if (aux == null) {
                map.put(pessoa.getEstado(), 1);
            } else {
                map.put(pessoa.getEstado(), aux + 1);
            }

            System.out.println(map.get(pessoa.getEstado())+","+pessoa.getVoto());

            if (maior < map.get(pessoa.getEstado())) {
                maior = map.get(pessoa.getEstado());
                estado = pessoa.getEstado();
            }
        }
        System.out.println("O estado de " + estado.toUpperCase() + " teve " + maior + " votos a favor. Foi o estado com maior quantidade de votos.");
    }
}
















    /*public void contaVotosSim(List<Pessoas> bd){
        Map<String, Integer> map = new HashMap<>();

        int maior = 0;
        String estado = "";

        for (Pessoas pessoa : bd) {

            Integer aux = map.get(pessoa.getEstado());

            if (aux == null) {
                map.put(pessoa.getEstado(), 1);
            }else{
                map.put(pessoa.getEstado(), aux + 1);
            }

            if(maior < map.get(pessoa.getEstado())){
                maior = map.get(pessoa.getEstado());
                estado = pessoa.getEstado();
            }
        }
        System.out.println("O estado de "+estado.toUpperCase()+" teve "+maior+" votos a favor. Foi o estado com maior quantidade de votos.");
    }
        */