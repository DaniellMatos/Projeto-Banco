/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class ContaCorrente extends ContaBancaria implements Imprimivel  {

    private double saldo;
    private double txopera;

    @Override
    public double sacar(double valor) {
        
        double descontar = txopera * valor;
        saldo = saldo - valor - descontar;
        this.setSaldo(saldo);

        return this.getSaldo();
    }

    @Override
    public double depositar(double valor) {
        
        double descontar = txopera * valor;
        saldo = saldo + valor - descontar;
        this.setSaldo(saldo);

        return this.getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTxopera() {
        return txopera;
    }

    public void setTxopera(double txopera) {
        this.txopera = txopera;
    }
    @Override
    public void mostrarDados(){
        System.out.println("Numero da conta: " + getConta() + "Saldo: " + getSaldo() + "\n" + "Taxa de operação: " + getTxopera());
    }
}