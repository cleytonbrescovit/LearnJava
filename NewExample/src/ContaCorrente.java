/**
 * Created by cleyton on 18/04/16.
 */
public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += (this.saldo * taxa) * 2;
    }

    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
