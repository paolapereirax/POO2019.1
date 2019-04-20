package br.ufc.quixada.dd.model;

import java.util.ArrayList;

public class Topic {
    public ArrayList <Passageiro> cadeiras;
    public int capacidade;
    public int cadeiraPrefs;

    public Topic(int capacidade, int cadeiraPrefs){
        cadeiras = new ArrayList<Passageiro>();
        for(int i = 0; i < capacidade; i++){
            cadeiras.add(null);
        }
        this.capacidade = capacidade;
        this.cadeiraPrefs = cadeiraPrefs;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCadeiraPrefs() {
        return cadeiraPrefs;
    }

    public void setCadeiraPrefs(int cadeiraPrefs) {
        this.cadeiraPrefs = cadeiraPrefs;
    }

    public String toString(){
        String line = "[";
        String end = " ]";
        for(int i = 0; i < cadeiras.size(); i++){
            if(i < cadeiraPrefs){
                line += " @";
            }
            else{
                line += " =";
            }
            if(cadeiras.get(i) != null){
                line += cadeiras.get(i);
            }
        }
        return line + end;
    }

    public boolean inserir(int init, int end, Passageiro p){
        for(int i = init; i < end; i++){
            if(cadeiras.get(i) == null){
                cadeiras.set(i, p);
                return true;
            }
        }
        return false;
    }

    public void inserir(Passageiro p){
            if(p.idoso()){
                inserir(0, this.capacidade, p);
            }
            else {
                if (!inserir(this.cadeiraPrefs, this.capacidade, p)) {
                    inserir(0, this.cadeiraPrefs, p);
                }
            }
    }

    public void  remover(String nome){
        for(int i = 0; i < cadeiras.size(); i++){
            if(cadeiras.get(i) != null){
                if(cadeiras.get(i).nome.equals(nome)){
                    cadeiras.set(i, null);
                }
            }
        }
    }
}
