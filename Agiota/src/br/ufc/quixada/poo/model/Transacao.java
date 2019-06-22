package br.ufc.quixada.poo.model;

public class Transacao {
    int id;
    float valor;
    String idCliente;

    public Transacao(int id, float valor, String idCliente){
        this.id = id;
        this.valor = valor;
        this.idCliente = idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String toString(){
        return "id: " + this.id + " | valor: " + this.valor + " | idCliente: " + this.idCliente;
    }
}
