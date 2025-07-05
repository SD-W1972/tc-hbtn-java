
public class Empregado {
    double salarioFixo;
   
   public double getSalarioFixo() {
       return salarioFixo;
   }
   
   public Empregado(double salarioFixo) {
       this.salarioFixo = salarioFixo;
   }
   
   public double calcularBonus(Departamento departamento) {
       double bonus = 0;
       if(departamento.alcancouMeta()) {
           bonus = (10 * salarioFixo)/ 100;
       }
       
       return bonus;
   }
   
   public double calcularSalarioTotal(Departamento departamento) {
       return salarioFixo + calcularBonus(departamento);
   }
   
   









   
}