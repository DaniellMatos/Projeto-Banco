/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

    private double saldo;
    private double limite;

    public ContaPoupanca(double limite) {
        this.limite = limite;
    }
    
    @Override
    public double sacar(double valor){
        if(saldo + limite > valor){
        saldo = saldo - valor;
        this.setSaldo(saldo);

        return this.getSaldo();
        }
        return 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public double depositar(double valor){
        saldo = saldo + valor;
        this.setSaldo(saldo);

        return this.getSaldo();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void mostrarDados(){
        System.out.println("Numero da Conta:"+ getConta() + "\nSaldo: " + getSaldo() );
    }

    public void setnConta(int size) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


