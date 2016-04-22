package test;

import main.ContaVotos;
import main.Pessoas;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cleyton on 20/04/16.
 */
public class TesteClasses {

    @Test
    public void testeContaVotosSim(){

        ContaVotos cv = new ContaVotos();
        List<Pessoas> testeDb = new ArrayList<>();

        Pessoas p1 = new Pessoas("a","PTB","RS","SIM");
        Pessoas p2 = new Pessoas("b","PTB","RS","SIM");
        Pessoas p3 = new Pessoas("c","PTB","RS","SIM");
        Pessoas p4 = new Pessoas("d","PTB","RS","SIM");

        testeDb.add(p1);
        testeDb.add(p2);
        testeDb.add(p3);
        testeDb.add(p4);

        int result = cv.contaVotosSim(testeDb);

        Assert.assertEquals(4,result);
    }

    @Test
    public void testeContaVotosNao(){
        ContaVotos cv = new ContaVotos();
        List<Pessoas> testeDb = new ArrayList<>();

        Pessoas p1 = new Pessoas("a","PTB","RS","nao");
        Pessoas p2 = new Pessoas("b","PTB","RS","NAO");
        Pessoas p3 = new Pessoas("c","PTB","RS","NAo");
        Pessoas p4 = new Pessoas("c","PTB","RS","NAO");
        Pessoas p5 = new Pessoas("d","PTB","RS","Sim");
        Pessoas p6 = new Pessoas("d","PTB","RS","NaO");

        testeDb.add(p1);
        testeDb.add(p2);
        testeDb.add(p3);
        testeDb.add(p4);
        testeDb.add(p5);
        testeDb.add(p6);

        int result = cv.contaVotosNao(testeDb);

        Assert.assertEquals(5,result);
    }

    @Test
    public void testeContaVotosEstadoSim(){
        ContaVotos cv = new ContaVotos();
        List<Pessoas> testeDb = new ArrayList<>();

        Pessoas p1 = new Pessoas("a","PTB","RS","sim");
        Pessoas p2 = new Pessoas("b","PTB","RS","sim");
        Pessoas p3 = new Pessoas("c","PTB","RS","Sim");
        Pessoas p4 = new Pessoas("c","PTB","RS","SIM");

        Pessoas p5 = new Pessoas("d","PTB","RS","Nao");
        Pessoas p6 = new Pessoas("d","PTB","PT","SIM");

        testeDb.add(p1);
        testeDb.add(p2);
        testeDb.add(p3);
        testeDb.add(p4);
        testeDb.add(p5);
        testeDb.add(p6);

        int result = cv.contaVotosEstadoSim(testeDb);

        Assert.assertEquals(4,result);
    }

    @Test
    public void testeContaVotosEstadoNao(){
        ContaVotos cv = new ContaVotos();
        List<Pessoas> testeDb = new ArrayList<>();

        Pessoas p1 = new Pessoas("a","PTB","Sp","NAO");
        Pessoas p3 = new Pessoas("c","PTB","SP","nao");
        Pessoas p4 = new Pessoas("c","PTB","sp","nao");
        Pessoas p2 = new Pessoas("b","PTB","sp","nao");

        Pessoas p5 = new Pessoas("d","PTB","pt","Nao");
        Pessoas p6 = new Pessoas("d","PTB","PT","NAO");

        testeDb.add(p1);
        testeDb.add(p2);
        testeDb.add(p3);
        testeDb.add(p4);
        testeDb.add(p5);
        testeDb.add(p6);

        int result = cv.contaVotosEstadoNao(testeDb);

        Assert.assertEquals(4,result);
    }
}
