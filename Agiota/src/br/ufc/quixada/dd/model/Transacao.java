package br.ufc.quixada.dd.model;

public class Transacao {
    private float valor;
    private String idCliente;

    public Transacao(int id, float valor, String idCliente){
        this.valor = valor;
        this.idCliente = idCliente;
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
        return this.valor + ":" + this.idCliente;
    }
}
