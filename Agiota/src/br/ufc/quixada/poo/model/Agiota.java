package br.ufc.quixada.poo.model;

import java.util.ArrayList;

public class Agiota {
    private float saldo;
    ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    ArrayList <Transacao> transacoes = new ArrayList<Transacao>();
    private int proxIdTransacao;

    public Agiota(float saldo){
        this.saldo = saldo;
        this.proxIdTransacao = 0;
    }

    public void cadastrarCliente(Cliente c){
        clientes.add(c);
    }

    public Cliente retornaCliente(String id){
        for(Cliente cliente : clientes){
            if(cliente.id.equals(id)){
                return cliente;
            }
        }
        return null;
    }

    public void novaTransacao(float valor, String idCliente){
        Transacao tran = new Transacao(proxIdTransacao, valor, idCliente);
        this.transacoes.add(tran);
        proxIdTransacao += 1;
    }

    public void receber(String id, float saldo){
        Cliente cliente = retornaCliente(id);
        if(cliente.saldo < saldo){
            System.out.println("Pagamento está acima de sua dívida!");
            return;
        }
        novaTransacao(saldo, id);
        cliente.saldo -= saldo;
        this.saldo += saldo;
    }

    public void emprestimo(String id, float saldo){
        Cliente cliente = retornaCliente(id);
        novaTransacao(-saldo, id);
        this.saldo -= saldo;
        cliente.saldo += saldo;
    }

    public String toString(){
        String out = "";
        for(Cliente cliente : clientes){
            out += cliente + "\n";
        }
        out += "saldo agiota: " + this.saldo;
        return out;
    }

    public ArrayList<Transacao> retornaHistorico(){
        return transacoes;
    }
}
