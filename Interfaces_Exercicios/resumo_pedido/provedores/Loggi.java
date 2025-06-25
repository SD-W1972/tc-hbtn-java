package provedores;

public class Loggi implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		double valorTotal = 0.0;
		
		if(peso > 5000) {
			valorTotal = valor * 0.12;
		}else {
			valorTotal = valor * 0.04;
		}
		
		return new Frete(valorTotal, TipoProvedorFrete.LOGGI);
	}
	
	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.LOGGI;
	}
}
