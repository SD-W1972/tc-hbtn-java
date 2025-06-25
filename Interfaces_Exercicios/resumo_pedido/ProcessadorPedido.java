import provedores.*;
public class ProcessadorPedido {
	ProvedorFrete provedorFrete;
	
	public ProcessadorPedido(ProvedorFrete pf) {
		this.provedorFrete  = pf;
	}
	
	public void processar(Pedido pedido) {
		pedido.setFrete(provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
	}
}
