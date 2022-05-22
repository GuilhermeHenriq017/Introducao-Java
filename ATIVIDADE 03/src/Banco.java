public class Banco {
    private Conta[] contas;
    private int limite,
            totalContas = 0;

    public Banco(int limite) {
        this.limite = limite;
        contas = new Conta[this.limite];
    }

    public void adiciona(Conta c) {
        if (totalContas < limite) {
            contas[totalContas] = c;
            totalContas++;
        } else {
            System.out.println("Total de contas no limite");
        }

    }

    public Conta pegaConta(int x) {
        if (x < limite) {
            return contas[x];
        } else {
            System.out.println("Conta não encontrada");
            return null;
        }
    }

    public int pegaTotalDeContas() {
        return this.totalContas;
    }

}
