package br.ufc.quixada.dd.model;

public class Passageiro {
    public String nome;
    public int idade;

    public Passageiro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString(){
        return this.nome + ":" + this.idade;
    }

    public boolean idoso(){
        if(this.idade >= 60){
            return true;
        }
        else{
            return false;
        }
    }
}
