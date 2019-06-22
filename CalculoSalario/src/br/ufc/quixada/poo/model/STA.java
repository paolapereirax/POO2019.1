package br.ufc.quixada.poo.model;

public class STA extends Funcionario {
    private int nivel;

    public STA(String nome, int nivel){
        super(nome);
        this.nivel = nivel;
        setMaxDiarias(1);
    }

    @Override
    public void addDiaria(){
        if(getQtdDiarias() < getMaxDiarias()){
            setSalario(getSalario() + 100);
            setQtdDiarias(getQtdDiarias() + 1);
        }
        else {
            System.out.println("Limite maximo de diarias atingido");
        }
    }

    @Override
    public void calculoSalario(){
        setSalario(3000 + 300 * this.nivel);
    }

    public String toString(){
        return "Sta " + getNome() + " nivel " + this.nivel + "\nsalario " + getSalario();
    }
}
