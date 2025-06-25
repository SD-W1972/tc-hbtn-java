package provedores;

public class JadLog implements ProvedorFrete{
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
		double valorTotal = 0.0;
		
		if(peso > 2000) {
			valorTotal = valor * 0.07;
		}else {
			valorTotal = valor * 0.045;
		}
		
		return new Frete(valorTotal, TipoProvedorFrete.JADLOG);
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.JADLOG;
	}
}
