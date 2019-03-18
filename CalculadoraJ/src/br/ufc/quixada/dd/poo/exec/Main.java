package br.ufc.quixada.dd.poo.exec;

import br.ufc.quixada.dd.poo.model.Calculadora;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Digite: init _cM, status, carregar _qtd, soma _n1 _n2, dividir _n1 _n2, end");
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(0);

        while(true){
            System.out.println("Digite: init _cM, status, carregar _qtd, soma _n1 _n2, dividir _n1 _n2, end");
            String linha = entrada.nextLine();
            String[] ui = linha.split(" ");
            if(ui[0].equals("end")){
                break;
            }
            else if(ui[0].equals("init")){
                calculadora = new Calculadora(Integer.parseInt(ui[1]));
            }
            else if(ui[0].equals("status")){
                System.out.println("A bateria é: " + calculadora.getBateria());
            }
            else if(ui[0].equals("carregar")){
                calculadora.carregar(Integer.parseInt(ui[1]));
            }
            else if(ui[0].equals("soma")){
                System.out.println(calculadora.soma(Integer.parseInt(ui[1]), Integer.parseInt(ui[2])));
            }
            else if(ui[0].equals("dividir")){
                System.out.println(calculadora.dividir(Integer.parseInt(ui[1]), Integer.parseInt(ui[2])));
            }
            else{
                System.out.println("Comando Inválido");
            }
        }
    }
}
