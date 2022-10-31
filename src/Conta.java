public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if (isSaldoValido(valor)) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }

    }

    public boolean transfere(double valor, Conta destino) {
        if (isSaldoValido(valor)){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;

    }

    private boolean isSaldoValido(double valor){
        return this.saldo >= valor;

    }
}
