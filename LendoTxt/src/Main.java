/**
 * Created by cleyton on 19/04/16.
 */
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        ValorMaior vm = new ValorMaior();
        Pessoa[] db = new Pessoa[6];
        String dbtemp[] = new String[3];

        String s = br.readLine();

        for (int c = 0 ; s != null ; c++) {
            dbtemp = s.split(";");

            Pessoa pessoa = new Pessoa();

            pessoa.setNome(dbtemp[0]);
            pessoa.setValor(Integer.parseInt(dbtemp[1]));

            db[c] = pessoa;
            s = br.readLine();

            vm.setValorMaior(db[c].getNome(),db[c].getValor());

            System.out.println(db[c].getNome() + "," + db[c].getValor());
        }

        System.out.println("Pessoa do Valor maior: "+ vm.getPessoa()+", Valor maior: " + vm.getValorMaior());



        br.close();
    }
}
