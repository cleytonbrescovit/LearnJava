import java.io.*;
import java.util.*;

/**
 * Created by cleyton on 20/04/16.
 */
public class LeitorDeArquivos {
    public static void main(String[] args) throws IOException{
        InputStream is = new FileInputStream("src/arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        List<Pessoas> bancoDeDados = new ArrayList<>();
        String temp[] = new String[4];

        String s = br.readLine();

        for (int c = 0 ; s != null ; c++){
            temp = s.split(";");

            Pessoas pessoa = new Pessoas(temp[0], temp[1], temp[2].toLowerCase().trim(), temp[3].toLowerCase().trim());
            bancoDeDados.add(pessoa);

            s = br.readLine();
        }

        ContaVotos cv = new ContaVotos();

        cv.contaVotos(bancoDeDados);
        cv.contaVotosEstado(bancoDeDados);
    }
}
