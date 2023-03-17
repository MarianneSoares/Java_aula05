package entities;

public class ContaCorrente {

    private int numeroConta;
    private double saldo;
    private Titular titular;

    public ContaCorrente(int numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            System.out.println("S - Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor){
        if (valor>0){
            this.saldo +=valor;
            System.out.println("D - Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Valor não corresponde a deposito.");
        }
    }

    public double verificarSaldo(){
        return this.saldo;
    }

}


