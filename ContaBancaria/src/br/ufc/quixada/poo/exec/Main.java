package br.ufc.quixada.poo.exec;

import br.ufc.quixada.poo.model.*;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Conta conta = new Conta();

        while(true){
            String line = ler.nextLine();
            String uInput[] = line.split(" ");

            if(uInput[0].equals("init")){
                conta = new Conta(Integer.parseInt(uInput[1]));
            }
            else if(uInput[0].equals("depositar")){
                conta.depositar(Float.parseFloat(uInput[1]));
            }
            else if(uInput[0].equals("sacar")){
                conta.sacar(Float.parseFloat(uInput[1]));
            }
            else if(uInput[0].equals("extornar")){
                conta.extorno(Integer.parseInt(uInput[1]));
            }
            else if(uInput[0].equals("show")){
                conta.retornaExtrato();
            }
            else{
                System.out.println("Digite um comando valido");
            }
        }
    }
}
