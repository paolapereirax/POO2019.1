package br.ufc.quixada.dd.exec;

import java.util.Scanner;
import br.ufc.quixada.dd.model.*;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Programa programa = new Programa(0);

        while(true){
            String line = ler.nextLine();
            String[] uInput = line.split(" ");

            if(uInput[0].equals("end")){
                break;
            }
            else if(uInput[0].equals("init")){
                programa = new Programa(Float.parseFloat(uInput[1]));
            }
            else if(uInput[0].equals("show")){
                System.out.println(programa);
            }
            else if(uInput[0].equals("emprestar")){
                programa.emprestarDinheiro(uInput[1], Float.parseFloat(uInput[2]));
            }
            else if(uInput[0].equals("historico")){
                for(int i = 0; i < programa.getTransacoes().size(); i++){
                    System.out.println(programa.getTransacoes().get(i));
                }
            }
            else if(uInput[0].equals("cadastrar")){
                String nome = uInput[1];
                programa.cadastrarCliente(nome, new Cliente(nome));
            }
            else{
                System.out.println("Comando não existe!");
            }
        }
    }
}
