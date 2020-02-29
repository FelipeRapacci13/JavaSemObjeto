public class Main {
    public static void main(String[] args) {
        Cliente clienteIvan = new Cliente("ivanildo", "crizza");
        Conta contaDeIvan = new Conta("29022020", -112.64f, clienteIvan);
        contaDeIvan.deposito(200.64f);
        contaDeIvan.saque(88);
    }

}


