/**
 * Created by cleyton on 18/04/16.
 */
public class ContaPoupanca extends Conta {

    @Override
    public void atualiza(double taxa){
        this.saldo += (this.saldo * taxa) * 3;
    }
}
