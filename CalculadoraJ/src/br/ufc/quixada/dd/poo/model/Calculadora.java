package br.ufc.quixada.dd.poo.model;

public class Calculadora {
    public int bateria;
    public int bateriaMax;

    public Calculadora (int bateriaMax){
        this.bateriaMax = bateriaMax;
    }

    public int getBateria(){
        return this.bateria;
    }

    public void carregar(int valor){
        if(valor > this.bateriaMax - this.bateria){
            this.bateria = this.bateriaMax;
        }else{
            this.bateria += valor;
        }
    }

    public void gastarBateria(){
        this.bateria -= 1;
    }

    public String soma(int n1, int n2){
        if(this.bateria == 0){
            return "Bateria Insuficiente";
        }else{
            int soma = n1 + n2;
            this.bateria--;
            return "O resultado da soma é: " + soma;
        }
    }

    public String dividir(int n1, int n2){
        if(this.bateria == 0){
            return "Bateria Insuficiente";
        }else{
            int divisao = n1 / n2;
            this.bateria--;
            return "O resultado da divisão é: " + divisao;
        }
    }
}
