package br.ufc.quixada.dd.poo.model;

public class ContaCorrente extends ContaBancaria {

    private String tipo;

    public ContaCorrente(String nome){
        super(nome);
        this.tipo = "CC";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void sacar(double valor) {
        if(super.getSaldo() >= valor){
            super.setSaldo(super.getSaldo() - valor);
        }
        else{
            System.out.println("Saldo Insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }

    @Override
    public void transferir(ContaBancaria contaFavorecida, double valor) {
        contaFavorecida.depositar(valor);
        super.setSaldo(super.getSaldo() - valor);
    }

    @Override
    public void atualizarMensal() {
        this.setSaldo(this.getSaldo() - 20);
    }

    public String imprime(){
        return getId() + ":" + getNome() + ":" + getSaldo() + ":" + getTipo();
    }
}
