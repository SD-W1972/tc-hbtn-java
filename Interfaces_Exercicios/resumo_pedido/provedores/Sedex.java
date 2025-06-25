package provedores;

public class Sedex	implements ProvedorFrete {
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
		double valorTotal = 0.0;
		if(peso > 1000) {
			valorTotal = valor * 0.10;
		}else {
			valorTotal = valor * 0.05;
		}
		
		return new Frete(valorTotal, TipoProvedorFrete.SEDEX);
	}
	
	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.SEDEX;
	}
}
