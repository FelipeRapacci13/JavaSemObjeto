public class Conta {
    private String numeroDaConta;
    private float saldo;
    private Cliente titular;

    public Conta() {
    }

    public Conta(String numeroDaConta, float saldo, Cliente titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void deposito(float quantia) {
        saldo = saldo + quantia;
        System.out.println("Depósito: " + quantia + "\nSaldo: " + saldo);
    }

    public void saque(int quantDeDinheiro) {
        saldo = saldo - quantDeDinheiro;
        if (quantDeDinheiro < saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("saque:" + "\nsaldo:" + saldo);
        }
    }

}






