public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Bruno Staine");

        Conta cc = new ContaCorrente(cliente);

        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(cliente);

        cc.transferir(50, poupanca);

        cc.extrato();
        poupanca.extrato();
    }
}
