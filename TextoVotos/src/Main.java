/**
 * Created by cleyton on 20/04/16.
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        List<Pessoas> bancoDeDados = new ArrayList<>();
        String temp[] = new String[4];

        String s = br.readLine();

        for (int c = 0 ; s != null ; c++) {
            temp = s.split(";");

            Pessoas pessoa = new Pessoas(temp[0], temp[1], temp[2].toLowerCase().trim(), temp[3].toLowerCase().trim());
            bancoDeDados.add(pessoa);

            s = br.readLine();
        }
        //1.Quantos disseram sim e quantos disseram nao?
        int sim=0, nao=0;

        for (int c = 0; c < bancoDeDados.size() ; c++) {

            if(bancoDeDados.get(c).getVoto().equals("sim")){
                sim += 1;
            }else {
                nao += 1;
            }
        }

        //2.Qual estado com mais sim e o estado com mais nao?
        int cont = 0;
        for percorre o bancoDeDados
                se mapAuxiliar ja contains(bancoDeDados.get(i).getEstado())
                    cont++
                    mapAuxiliar.put(bancoDeDados.get(i).getEstado(), contador)



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








        /*String estado;
        int rssim=0, rsnao=0,spsim=0, spnao=0,scsim=0, scnao=0;
        int fora = 0;

        for(int j = 0; j < 6 ; j++){
            if (bancoDeDados.get(j).getEstado().equals("rs")) {
                if (bancoDeDados.get(j).getVoto().equals("sim")) {
                    rssim += 1;
                } else {
                    rsnao += 1;
                }
            }else if(bancoDeDados.get(j).getEstado().equals("sp")) {
                if (bancoDeDados.get(j).getVoto().equals("sim")) {
                    spsim += 1;
                } else {
                    spnao += 1;
                }
            }else if(bancoDeDados.get(j).getEstado().equals("sc")) {
                if (bancoDeDados.get(j).getVoto().equals("sim")) {
                    scsim += 1;
                } else {
                    scnao += 1;
                }
            }
        }

        System.out.println("Quantidade de Votos Sim: "+sim+", Quantidade de Votos Não: "+nao);

        if(rssim > spsim && rssim > scsim){
            System.out.println("Rs tem mais votos sim: "+rssim);

        }else if(spsim > rssim && spsim > scsim){
            System.out.println("SP tem mais votos sim: "+spsim);

        }else if(scsim > rssim && scsim > spsim){
            System.out.println("Sc tem mais votos sim: "+scsim);

        }else if((rssim == spsim) || rssim == scsim){
            if (rssim == spsim){
                System.out.println("rs e sp estão empatados com "+rssim+" votos sim");
            }else if (rssim == scsim){
                System.out.println("rs e sc estão empatados com "+rssim+" votos sim");
            }else {
                System.out.println("sp e sc estão empatados com "+spsim+" votos sim");
            }
        }else{
            System.out.println("deu treta");
        }

        if(rsnao > spnao && rsnao > scnao){
            System.out.println("Rs tem mais votos nao: "+rsnao);

        }else if(spnao > rsnao && spnao > scnao){
            System.out.println("SP tem mais votos nao: "+spnao);

        }else if(scnao > rsnao && scnao > spnao){
            System.out.println("Sc tem mais votos nao: "+scnao);

        }else if((rsnao == spnao) || rsnao == scnao){
            if (rsnao == spnao){
                System.out.println("rs e sp estão empatados com o"+rsnao+" votos nao");
            }else if (rsnao == scnao){
                System.out.println("rs e sc estão empatados com "+rsnao+" votos nao");
            }else {
                System.out.println("sp e sc estão empatados com "+spnao+" votos nao");
            }
        }else{
            System.out.println("deu treta");
        }
    }*/
}
