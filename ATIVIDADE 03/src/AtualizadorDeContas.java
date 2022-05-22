public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    public void roda(Conta c) {
        System.out.println("Antes da atualização: " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Depois da atualização: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
