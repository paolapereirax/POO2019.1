package br.ufc.quixada.dd.exec;

import java.util.Scanner;
import br.ufc.quixada.dd.model.*;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
	    Topic topic = new Topic(0, 0);

	    while(true){
            System.out.println("Digite: (init) para iniciar, (show) para mostrar a topic, " +
                    "(inserir) para inserir passageiro, (remover) para remover passageiro e " +
                    "(end) para fechar programa");

	        String line = ler.nextLine();
	        String[] uInput = line.split(" ");

	        if(uInput[0].equals("end")){
	            break;
            }
	        else if(uInput[0].equals("init")){
	            topic = new Topic(Integer.parseInt(uInput[1]), Integer.parseInt(uInput[2]));
            }
	        else if(uInput[0].equals("show")){
                System.out.println(topic);
            }
	        else if(uInput[0].equals("inserir")){
	            topic.inserir(new Passageiro(uInput[1], Integer.parseInt(uInput[2])));
            }
	        else if(uInput[0].equals("Remover")){
	            topic.remover(uInput[1]);
            }
	        else{
                System.out.println("Digite um comando válido!");
            }
        }
    }
}
