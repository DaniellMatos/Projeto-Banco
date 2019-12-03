/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;


public class Banco implements Imprimivel{
     public ArrayList<ContaBancaria> listaContas = new ArrayList<>();

    public void inserir(ContaBancaria conta) {

        listaContas.add(conta);
        System.out.println(listaContas.size());
        mostrarDados();

    }

    public void remover(int conta) {

        listaContas.remove(conta);

    }

    public ContaBancaria procurarConta(int index) {

        return listaContas.get(index);

    }

    @Override
    public void mostrarDados() {

        for (int i = 0; i < listaContas.size(); i++) {
            
            System.out.println("********" + i);
            System.out.println(listaContas.get(i).toString());

        }
    }

}

