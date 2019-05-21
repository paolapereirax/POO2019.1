package br.ufc.quixada.dd.poo.model;

public abstract class ContaBancaria {
    private static int cont = 0;
    private int id;
    private String nome;
    private double saldo;

    public ContaBancaria(String nome){
        this.id = cont++;
        this.nome = nome;
        this.saldo = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract void transferir(ContaBancaria b, double valor);

    public abstract void atualizarMensal();

    public abstract String imprime();
}
