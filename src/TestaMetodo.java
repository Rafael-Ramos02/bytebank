public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;

        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.deposita(50);
        System.out.println("O saldo da conta pós deposito é: " + contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println("O saldo da conta pós saque é: " + contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        contaDaMarcela.transfere(300, contaDoPaulo);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
    }

}
