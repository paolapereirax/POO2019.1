package br.ufc.quixada.poo.model;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private int maxDiarias;
    private int qtdDiarias;
    private double bonus;

    public Funcionario(String nome){
        this.nome = nome;
        this.qtdDiarias = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMaxDiarias() {
        return maxDiarias;
    }

    public void setMaxDiarias(int maxDiarias) {
        this.maxDiarias = maxDiarias;
    }

    public int getQtdDiarias() {
        return qtdDiarias;
    }

    public void setQtdDiarias(int qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public abstract void addDiaria();
    public abstract void calculoSalario();
}
