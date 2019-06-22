package br.ufc.quixada.poo.exec;

import java.util.Scanner;
import br.ufc.quixada.poo.model.*;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
	    Agiota agiota = new Agiota(0);

	    while(true){
			System.out.println("Digite: init + saldo, cadastrar + id + nome, emprestar + id + valor, receber + id + valor, historico, show, end");
	        String line = ler.nextLine();
	        String[] uInput = line.split(" ");

	        if(uInput[0].equals("end")){
	            break;
            }
	        else if(uInput[0].equals("init")){
	            agiota = new Agiota(Float.parseFloat(uInput[1]));
            }
	        else if(uInput[0].equals("show")){
                System.out.println(agiota);
            }
	        else if(uInput[0].equals("emprestar")){
	            agiota.emprestimo(uInput[1], Float.parseFloat(uInput[2]));
            }
	        else if(uInput[0].equals("historico")){
				System.out.println(agiota.retornaHistorico());
            }
	        else if(uInput[0].equals("cadastrar")){
	            agiota.cadastrarCliente(new Cliente(uInput[1], uInput[2]));
            }
	        else if(uInput[0].equals("receber")){
	        	agiota.receber(uInput[1], Float.parseFloat(uInput[2]));
			}
	        else{
                System.out.println("Digite um comando válido!");
            }
        }
    }
}
