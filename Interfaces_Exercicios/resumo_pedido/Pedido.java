import provedores.*;
public class Pedido {
	int codigo;
	double peso;
	double total;
	Frete frete;
	
	public int getCodigo() {return codigo;}
	public double getPeso() { return peso;}
	public double getTotal() { return total;}
	public Frete getFrete() { return frete;}
	
	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public Pedido(int c, double p, double t) {
		this.codigo = c;
		this.peso = p;
		this.total = t;
	}
}
