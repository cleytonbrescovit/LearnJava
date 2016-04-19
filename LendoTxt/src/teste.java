
import java.util.*;

/**
 * Created by cleyton on 19/04/16.
 */
public class teste {


    public static void main(String[] args) {

        List<Pessoa> lista = new ArrayList<Pessoa>();

        lista.add(new Pessoa("LEO", 10));
        lista.add(new Pessoa("LEO", 20));

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (Pessoa pessoa: lista) {

            Integer aux = map.get(pessoa.getNome());

            if(aux == null){
                map.put(pessoa.getNome(), pessoa.getValor());
            } else {
                map.put(pessoa.getNome(), aux + pessoa.getValor());
            }
        }


        System.out.println(map.get("LEO"));



    }


}
