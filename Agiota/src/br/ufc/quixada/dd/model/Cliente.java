package br.ufc.quixada.dd.model;

public class Cliente {
    private String nome;
    private float saldo;

    public Cliente(String nome){
        this.nome = nome;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return this.nome + ":" + this.saldo;
    }
}
