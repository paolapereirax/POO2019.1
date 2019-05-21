package br.ufc.quixada.dd.poo.exec;

import br.ufc.quixada.dd.poo.model.*;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {

        Agencia agencia = new Agencia();

        while(true){
            System.out.println("Digite: addCliente +nome, show, saque +conta +valor, deposito +conta +valor, " +
                    "transferencia +conta +contaFav +valor, atualizar, end");
            String line = ler.nextLine();
            String[] userInput = line.split(" ");

            if(userInput[0].equals("end")){
                break;
            }
            else if(userInput[0].equals("addCliente")){
                ContaBancaria cc = new ContaCorrente(userInput[1]);
                ContaBancaria cp = new ContaPoupanca(userInput[1]);

                agencia.inserirConta(cc);
                agencia.inserirConta(cp);
            }
            else if(userInput[0].equals("show")){
                System.out.println(agencia);
            }
            else if(userInput[0].equals("saque")){
                agencia.procurarConta(Integer.parseInt(userInput[1])).sacar(Float.parseFloat(userInput[2]));
            }
            else if(userInput[0].equals("deposito")){
                agencia.procurarConta(Integer.parseInt(userInput[1])).depositar(Float.parseFloat(userInput[2]));
            }
            else if(userInput[0].equals("transferencia")){
                agencia.procurarConta(Integer.parseInt(userInput[1])).transferir(agencia.procurarConta(Integer.parseInt(userInput[2])), Float.parseFloat(userInput[3]));
            }
            else if(userInput[0].equals("atualizar")){
                for(ContaBancaria conta : agencia.contas){
                    conta.atualizarMensal();
                }
            }
            else{
                System.out.println("Comando Inválido!");
            }
        }
    }
}
