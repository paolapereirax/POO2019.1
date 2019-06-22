package br.ufc.quixada.poo.model;

public class Terceirizado extends Funcionario {
    private int horasTrabalhadas;
    private boolean insalubre;

    public Terceirizado(String nome, int horas, String einsalubre){
        super(nome);
        this.horasTrabalhadas = horas;
        if(einsalubre == "sim"){
            this.insalubre = true;
        }
        else if(einsalubre == "nao") {
            this.insalubre = false;
        }
    }

    @Override
    public void addDiaria(){
        System.out.println("Funcionarios terceirizados nao possuem diaria");
    }

    @Override
    public void calculoSalario(){
        if(this.insalubre == true){
            setSalario((4 * this.horasTrabalhadas) + 500);
        }
        else{
            setSalario(4 * this.horasTrabalhadas);
        }
    }

    public String toString(){
        if(this.insalubre == true){
            return "Ter " + getNome() +  " " + this.horasTrabalhadas + "h" + " insalubre" + "\nsalario " + getSalario();
        }
        else{
            return "Ter " + getNome() +  " " + this.horasTrabalhadas + "h" + " nao insalubre" + "\nsalario " + getSalario();
        }

    }
}
