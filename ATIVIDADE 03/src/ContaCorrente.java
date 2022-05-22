public class ContaCorrente extends Conta{
    void atualiza(double taxa) {
        super.saldo += super.saldo * taxa * 2;
    }
    void deposita(double valor) {
        this.saldo += valor - 0.10;}
}
