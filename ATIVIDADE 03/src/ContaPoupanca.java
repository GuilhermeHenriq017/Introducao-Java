public class ContaPoupanca extends Conta{
    void atualiza(double taxa) {
        super.saldo += super.saldo * taxa * 3;
    }
}
