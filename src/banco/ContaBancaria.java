package banco;

public abstract class ContaBancaria extends Banco {

    private float conta;
    private double saldo;

    public abstract double sacar(double valor);

    public abstract double depositar(double valor);

    public float getConta() {
        return conta;
    }

    public void setConta(float conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDados() {
        System.out.println("Teste");
        
    }

     public void transferir(double valor, ContaBancaria x) {

        sacar(valor);
        x.depositar(valor);
    }

}
