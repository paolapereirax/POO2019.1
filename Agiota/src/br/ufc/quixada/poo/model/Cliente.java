package br.ufc.quixada.poo.model;

public class Cliente {
    String id;
    String nome;
    float saldo;

    public Cliente(String id, String nome){
        this.id = id;
        this.nome = nome;
        this.saldo = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "id: " + this.id + " | nome: " + this.nome + " | saldo: " + this.saldo;
    }
}
