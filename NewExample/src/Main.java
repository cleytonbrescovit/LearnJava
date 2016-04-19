/**
 * Created by cleyton on 18/04/16.
 */
public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());

        ContaCorrente ff = new ContaCorrente();
        ff.deposita(100);
        System.out.println(ff.calculaTributos());

        Tributavel t = ff;
        System.out.println(t.calculaTributos());
    }
}