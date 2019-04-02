package br.ufc.quixada.dd.poo.exec;

import br.ufc.quixada.dd.poo.model.Pet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pet pet = new Pet(" ", 0, 0, 0);
        while(true){
            System.out.println("Digite: init _nome _E _S _L, status, brincar, comer, banho, dormir, end");
            String linha = entrada.nextLine();
            String[] ui = linha.split(" ");
            if(ui[0].equals("end")){
                break;
            }
            else if(ui[0].equals("init")){
                pet = new Pet(ui[1], Integer.parseInt(ui[2]),
                        Integer.parseInt(ui[3]),
                        Integer.parseInt(ui[4]));


            }
            else if (ui[0].equals("status")){
                System.out.println(pet);
            }
            else if(ui[0].equals("brincar")){
                pet.brincar();
            }
            else if(ui[0].equals("comer")){
                pet.comer();
            }
            else if(ui[0].equals("banho")){
                pet.banho();
            }
            else if(ui[0].equals("dormir")){
                pet.dormir();
            }
            else{
                System.out.println("Comando Inválido.");
            }
        }
    }
}
