package br.ufc.quixada.poo.model;

public class Professor extends Funcionario {
    private char classe;

    public Professor(String nome, char classe){
        super(nome);
        this.classe = classe;
        setMaxDiarias(2);
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
        if(this.classe == 'A'){
            setSalario(3000);
        }
        else if(this.classe == 'B'){
            setSalario(5000);
        }
        else if(this.classe == 'C'){
            setSalario(7000);
        }
        else if(this.classe == 'D'){
            setSalario(9000);
        }
        else if(this.classe == 'E'){
            setSalario(11000);
        }
    }

    public String toString(){
        return "Prof " + getNome() + " classe " + this.classe + "\nsalario " + getSalario();
    }
}
