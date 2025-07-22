import java.util.*;
import java.util.stream.*;
public class Teste{
  public static void main(String[] args) {
      List<Estudante> estudantes = new ArrayList<>();
      Estudante e1 = new Estudante("a", 15);
      Estudante e2 = new Estudante("a", 15);
      Estudante e3 = new Estudante("a", 15);
      Estudante e4 = new Estudante("a", 15);
      Estudante e5 = new Estudante("a", 18);
      Estudante e6 = new Estudante("a", 18);
      Estudante e7 = new Estudante("a", 28);

      estudantes.add(e1);
      estudantes.add(e2);
      estudantes.add(e3);
      estudantes.add(e4);
      estudantes.add(e5);
      estudantes.add(e6);
      estudantes.add(e7);
      estudantes.collect(Collectors.groupingBy(
              Estudante::getIdade() >= 18,
              Collectors.counting()))
 .forEach((c, d) -> System.out.println(d));
  }
}