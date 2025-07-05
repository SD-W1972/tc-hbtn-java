import exceptions.*;

public class ContaBancariaBasica {
    protected String numeracao;
    protected double saldo;
    protected double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() { return numeracao; }
    public double getSaldo() { return saldo; }
    public double getTaxaJurosAnual() { return taxaJurosAnual; }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -= valor;
    }

    public double calcularTarifaMensal() {
        return Math.min(saldo * 0.10, 10.00);
    }

    public double calcularJurosMensal() {
        if (saldo < 0) {
            return 0;
        }
        return (taxaJurosAnual / 12 / 100) * saldo;
    }

    public void aplicarAtualizacaoMensal() {

        this.saldo = this.saldo - calcularTarifaMensal() + calcularJurosMensal();

    }
}