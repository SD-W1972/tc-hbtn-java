import atividades.*;

public class MaquinaWorkflow {
	public void executar(Workflow workflow) {
		for(Atividade a : workflow.getListaAtividades()) {
			a.executar();
		}
	}
}
