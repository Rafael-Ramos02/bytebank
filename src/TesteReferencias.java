public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeriaConta = new Conta();
        primeriaConta.saldo = 300;

        System.out.println("saldo da primeira conta: " + primeriaConta.saldo);

    }
}
