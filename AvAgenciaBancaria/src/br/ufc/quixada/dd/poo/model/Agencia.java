package br.ufc.quixada.dd.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    public List <ContaBancaria> contas = new ArrayList<>();

    public void inserirConta(ContaBancaria conta){
        contas.add(conta);
    }

    public ContaBancaria procurarConta(int numeroConta){
        boolean encontrou = false;

        for(ContaBancaria conta : contas){
            if(conta.getId() == numeroConta){
                encontrou = true;
                return conta;
            }
        }
        if(encontrou == false){
            return null;
        }

        return null;
    }

    public void removerConta(ContaBancaria conta){
        contas.remove(conta);
    }

    @Override
    public String toString(){
        String saida = "";
        for(ContaBancaria conta : contas){
            saida += conta.imprime() + "\n";
        }
        return saida;
    }
}
