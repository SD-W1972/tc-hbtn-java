import java.util.List;
import java.util.ArrayList;
import atividades.*;
public class Workflow {
	List<Atividade> listaAtividades = new ArrayList<>();
	
	public void registrarAtividade(Atividade atividade) {
	

		listaAtividades.add(atividade);
		
		
	}
	
	public List<Atividade> getListaAtividades(){
		return listaAtividades;
	}
}
