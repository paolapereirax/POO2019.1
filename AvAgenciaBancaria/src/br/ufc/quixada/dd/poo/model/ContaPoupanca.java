package br.ufc.quixada.dd.poo.model;

public class ContaPoupanca extends ContaBancaria {

    private String tipo;

    public ContaPoupanca(String nome){
        super(nome);
        this.tipo = "CP";
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
    public void transferir( ContaBancaria contaFavorecido, double valor) {
        contaFavorecido.depositar(valor);
        super.setSaldo(super.getSaldo() - valor);
    }

    @Override
    public void atualizarMensal() {
        this.setSaldo(this.getSaldo() + (0.1 * this.getSaldo()));
    }

    public String imprime(){
        return getId() + ":" + getNome() + ":" + getSaldo() + ":" + getTipo();
    }
}
