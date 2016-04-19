/**
 * Created by cleyton on 19/04/16.
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        List<Pessoa> db = new ArrayList<Pessoa>();
        String dbtemp[] = new String[3];

        String s = br.readLine();

        for (int c = 0 ; s != null ; c++) {
            dbtemp = s.split(";");

            Pessoa pessoa = new Pessoa();

            pessoa.setNome(dbtemp[0]);
            pessoa.setValor(Integer.parseInt(dbtemp[1]));

            db.add(pessoa);

            s = br.readLine();

            System.out.println(db.get(c).getNome() + "," + db.get(c).getValor());
        }

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (Pessoa pessoa: db) {

            Integer aux = map.get(pessoa.getNome());

            if(aux == null){
                map.put(pessoa.getNome(), pessoa.getValor());
            } else {
                map.put(pessoa.getNome(), aux + pessoa.getValor());
            }
        }

        int maior = 0;
        String nome = null;
        for (Pessoa pessoa: db) {


            if(map.get(pessoa.getNome()) > maior){
                maior = map.get(pessoa.getNome());
                nome = pessoa.getNome();
            }
        }

        System.out.println("O maior vendedor foi " +  nome + " com " + maior);


        br.close();
    }
}