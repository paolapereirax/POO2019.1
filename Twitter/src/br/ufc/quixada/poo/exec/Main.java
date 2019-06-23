package br.ufc.quixada.poo.exec;

import java.util.Arrays;
import java.util.Scanner;
import br.ufc.quixada.poo.model.*;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
	    Sistema sistema = new Sistema();
		System.out.println("Digite: addUser _usuario, seguir _usuario1 _usuario2, tweetar _usuario _mensagem, " +
				"like _usuario _idTweet, timeline _usuario, show, end");
	    while(true){
	        String line = ler.nextLine();
	        String uInput[] = line.split(" ");

	        if(uInput[0].equals("end")){
	            break;
            }
	        else if(uInput[0].equals("addUser")){
	            sistema.addUsuario(uInput[1]);
            }
	        else if(uInput[0].equals("seguir")){
	            sistema.seguirUsuario(uInput[1], uInput[2]);
            }
	        else if(uInput[0].equals("tweetar")){
	        	String[] subarray = Arrays.copyOfRange(uInput, 2, uInput.length);
	        	String mensagem = String.join(" ", subarray);
	            sistema.userTweetar(uInput[1], mensagem);
            }
	        else if(uInput[0].equals("like")){
	            sistema.darLike(uInput[1], Integer.parseInt(uInput[2]));
            }
	        else if(uInput[0].equals("timeline")){
	        	sistema.verTimeline(uInput[1]);
			}
	        else if(uInput[0].equals("show")){
	        	sistema.mostraUsuarios();
			}
	        else{
                System.out.println("Digite um comando valido");
            }
        }
    }
}
