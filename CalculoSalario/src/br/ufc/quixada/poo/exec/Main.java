package br.ufc.quixada.poo.exec;

import java.util.Scanner;
import br.ufc.quixada.poo.model.*;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        while(true){
            System.out.println("Digite: addProf _nome _classe, addSta _nome _nivel, addTer _nome _horas _insalubre(sim ou nao), addDiaria _nome, setBonus _bonus, show _nome, end");
            String line = ler.nextLine();
            String uInput[] = line.split(" ");


            if(uInput[0].equals("end")){
                break;
            }
            else if(uInput[0].equals("addProf")){
                sistema.addProf(uInput[1], uInput[2].charAt(0));
            }
            else if(uInput[0].equals("addSta")){
                sistema.addSta(uInput[1], Integer.parseInt(uInput[2]));
            }
            else if(uInput[0].equals("addTer")){
                sistema.addTer(uInput[1], Integer.parseInt(uInput[2]), uInput[3]);
            }
            else if(uInput[0].equals("addDiaria")){
                sistema.diaria(uInput[1]);
            }
            else if(uInput[0].equals("show")){
                sistema.mostraFunc(uInput[1]);
            }
            else if(uInput[0].equals("setBonus")){
                sistema.bonus(Double.parseDouble(uInput[1]));
            }
            else{
                System.out.println("Comando invalido");
            }
        }
    }
}
