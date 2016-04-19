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


        Pessoa[] db = new Pessoa[6];
        String dbtemp[] = new String[3];

        String s = br.readLine();

        int valorMaior = 0;
        int somaValor = 0;

        for (int c = 0 ; s != null ; c++) {
            dbtemp = s.split(";");

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(dbtemp[0]);
            pessoa.setValor(Integer.parseInt(dbtemp[1]));

            db[c] = pessoa;

            s = br.readLine();
        }
        System.out.println(db[0].getNome()+","+db[0].getValor());
        System.out.println(db[1].getNome()+","+db[1].getValor());
        System.out.println(db[2].getNome()+","+db[2].getValor());
        System.out.println(db[3].getNome()+","+db[3].getValor());
        System.out.println(db[4].getNome()+","+db[4].getValor());
        System.out.println(db[5].getNome()+","+db[5].getValor());

        System.out.println("-------------------------------------");



        br.close();
    }
}
