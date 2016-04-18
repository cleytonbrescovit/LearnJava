/**
 * Created by cleyton on 18/04/16.
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println("Saldo Anterior: " + c.getSaldo());
        c.atualiza(0.01);
        System.out.println("Saldo Final: " + c.getSaldo());
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
