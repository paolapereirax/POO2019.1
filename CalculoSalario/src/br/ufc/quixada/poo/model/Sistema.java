package br.ufc.quixada.poo.model;

import java.util.ArrayList;

public class Sistema {
    ArrayList <Funcionario> funcionarios = new ArrayList<>();

    public void addProf(String nome, char classe){
        Professor p = new Professor(nome, classe);
        funcionarios.add(p);
        p.calculoSalario();
    }

    public void addSta(String nome, int nivel){
        STA s = new STA(nome, nivel);
        s.calculoSalario();
        funcionarios.add(s);
    }

    public void addTer(String nome, int horas, String insalubre){
        Terceirizado t = new Terceirizado(nome, horas, insalubre);
        t.calculoSalario();
        funcionarios.add(t);
    }

    public void removeFunc(String nome){
        for(Funcionario func : funcionarios){
            if(func.getNome().equals(nome)){
                funcionarios.remove(func);
                break;
            }
        }
    }

    public void mostraFunc(String nome){
        for(Funcionario func : funcionarios){
            if(func.getNome().equals(nome)){
                System.out.println(func);
            }
        }
    }

    public void diaria(String nome){
        for(Funcionario func : funcionarios){
            if(func.getNome().equals(nome)){
                func.addDiaria();
            }
        }
    }

    public void bonus(double bonus){
        double bonusFunc = bonus / funcionarios.size();
        for(Funcionario func : funcionarios){
            func.setSalario(func.getSalario() + bonusFunc);
        }
    }
}
