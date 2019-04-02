package br.ufc.quixada.dd.poo.model;

public class Pet {
    private String nome;
    private int energia;
    private int saciedade;
    private int limpeza;
    private int energiaMax;
    private int saciedadeMax;
    private int limpezaMax;
    private int diamantes;
    private int idade;
    private boolean vivo;

    public Pet(String nome, int energiaMax, int saciedadeMax, int limpezaMax){
        this.nome = nome;
        this.energia = energiaMax;
        this.saciedade = saciedadeMax;
        this.limpeza = limpezaMax;
        this.vivo = true;
        this.energiaMax = energiaMax;
        this.saciedadeMax = saciedadeMax;
        this.limpezaMax = limpezaMax;
    }

    public String getNome(){
        return this.nome;
    }

    public int getEnergia(){
        return this.energia;
    }

    public int getSaciedade(){
        return this.saciedade;
    }

    public int getLimpeza(){
        return this.limpeza;
    }

    public int getEnergiaMax(){
        return this.energiaMax;
    }

    public int getSaciedadeMax(){
        return this.saciedadeMax;
    }

    public int getLimpezaMax(){
        return this.limpezaMax;
    }

    public int getDiamantes(){
        return this.diamantes;
    }

    public int getIdade(){
        return this.idade;
    }

    public boolean getVivo(){return this.vivo;}

    public void setEnergia(int energia){
        if(this.energia > this.energiaMax){
            this.energia = energiaMax;
        }
        else if(energia <= 0){
            this.energia = 0;
            this.vivo = false;
        }
        else{
            this.energia = energia;
        }
    }

    public void setSaciedade(int saciedade){
        if(this.saciedade > this.saciedadeMax){
            this.saciedade = saciedadeMax;
        }
        else if(saciedade <= 0){
            this.saciedade = 0;
            this.vivo = false;
        }
        else{
            this.saciedade = saciedade;
        }
    }

    public void setLimpeza(int limpeza){
        if(this.limpeza > this.limpezaMax){
            this.limpeza = limpezaMax;
        }
        else if(limpeza <= 0){
            this.limpeza = 0;
            this.vivo = false;
        }
        else{
            this.limpeza = limpeza;
        }
    }

    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }

    public boolean testeVivo(){
        if(this.vivo){
            return true;
        }
        else{
            return false;
        }
    }

    public void brincar(){
        if(!testeVivo()){
            System.out.println("O pet está morto.");
        }
        else{
            this.setEnergia(this.getEnergia() - 2);
            this.setSaciedade(this.getSaciedade() - 1);
            this.setLimpeza(this.getLimpeza() - 3);
            this.diamantes += 1;
            this.idade += 1;
        }
    }

    public void comer(){
        if(!testeVivo()){
            System.out.println("O pet está morto.");
        }
        else{
            this.setEnergia(this.getEnergia() - 1);
            this.setSaciedade(this.getSaciedade() + 4);
            this.setLimpeza(this.getLimpeza() - 2);
            this.idade += 2;
        }
    }

    public void banho(){
        if(!testeVivo()){
            System.out.println("O pet está morto.");
        }
        else{
            this.setEnergia(this.getEnergia() - 3);
            this.setSaciedade(this.getSaciedade() - 1);
            this.setLimpeza(this.getLimpezaMax());
            this.idade += 2;
        }
    }

    public void dormir(){
        if(!testeVivo()){
            System.out.println("O pet está morto.");
        }
        else{
            if(this.energiaMax - this.energia < 5){
                System.out.println("O pet não está com sono.");
            }
            else{
                this.idade += this.energiaMax - this.energia;
                this.setEnergia(this.getEnergiaMax());
            }
        }
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nEnergia: " + this.energia + "/" + this.energiaMax +
                "\nSaciedade: " + this.saciedade + "/" + this.saciedadeMax +
                "\nLimpeza: " + this.limpeza + "/" + this.limpezaMax +
                "\nIdade: " + this.idade +
                "\nDiamantes: " + this.diamantes;
    }
}
