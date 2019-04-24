package br.ufc.quixada.dd.model;

import java.util.HashMap;
import java.util.Map;

public class Programa {
    private float saldo;
    private Map <String, Cliente> clientes;
    private Map <Integer, Transacao> transacoes;
    private int proxChaveCliente;
    private int proxChaveTransacao;

    public Programa(float saldo){
        this.saldo = saldo;
        this.clientes = new HashMap<>();
        this.transacoes = new HashMap<>();
        this.proxChaveTransacao = 0;
    }

    public void  cadastrarCliente(String chaveCliente, Cliente c){
        Cliente aux = clientes.get(chaveCliente);
        if(aux == null){
            this.clientes.put(chaveCliente, c);
        }
        else{
            System.out.println("O cliente já existe!");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Map<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public Map<Integer, Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(Map<Integer, Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public int getProxChaveCliente() {
        return proxChaveCliente;
    }

    public void setProxChaveCliente(int proxChaveCliente) {
        this.proxChaveCliente = proxChaveCliente;
    }

    public int getProxChaveTransacao() {
        return proxChaveTransacao;
    }

    public void setProxChaveTransacao(int proxChaveTransacao) {
        this.proxChaveTransacao = proxChaveTransacao;
    }

    public Cliente retornaCliente(String chaveCliente){
        Cliente cliente = clientes.get(chaveCliente);
        return cliente;
    }

    public void novaTransacao(float valor, String nomeCliente){
        this.transacoes.put(proxChaveTransacao, new Transacao(proxChaveTransacao, valor, nomeCliente));
        this.proxChaveTransacao += 1;
    }

    public void emprestarDinheiro(String chaveCliente, float saldo){
        Cliente cliente = retornaCliente(chaveCliente);
        novaTransacao(-saldo, chaveCliente);
        this.saldo -= saldo;
        cliente.setSaldo(cliente.getSaldo() + saldo);
    }

    public void receberPagamento(String nomeCliente, float saldo){
        Cliente cliente = retornaCliente(nomeCliente);
        if(cliente.getSaldo() < saldo){
            System.out.println("Pagamento maior que a divida!");
            return;
        }
        novaTransacao(saldo, nomeCliente);
        cliente.setSaldo(cliente.getSaldo() - saldo);
        this.saldo += saldo;
    }

    public void mostrarHistorico(){
        System.out.println(transacoes.values());
    }

    public String toString(){
        String out = "";
        for(int i = 0; i < clientes.size(); i++){
            out += clientes.get(i) + "\n";
        }
        out += "saldo:" + this.saldo;
        return out;
    }
}
