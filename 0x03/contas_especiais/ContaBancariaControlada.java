import exceptions.*;

public class ContaBancariaControlada extends ContaBancariaBasica{

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade){
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal(){
        super.saldo = this.saldo - calcularTarifaMensal() + calcularJurosMensal();

        if(super.saldo < saldoMinimo){
            super.saldo -= valorPenalidade;
        }
    }
}