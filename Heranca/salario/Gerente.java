
public class Gerente extends Empregado {

	@Override
	public double calcularBonus(Departamento departamento) {
		double bonus = 0;
		if(departamento.alcancouMeta()) {
			double x = (1 * (departamento.getValorAtingidoMeta() - departamento.getValorMeta())) /100;
			bonus = ((20 * salarioFixo)/ 100)  + x;
		}
		
		return bonus;
	}

	public Gerente(double salarioFixo) {
		super(salarioFixo);
	}
}