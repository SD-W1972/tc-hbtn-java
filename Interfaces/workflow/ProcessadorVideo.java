import java.util.List;
import java.util.ArrayList;

public class ProcessadorVideo {
	List<CanalNotificacao> canais = new ArrayList<>();

	public void registrarCanal(CanalNotificacao canal) {
		canais.add(canal);
	}
	
	public void processar(Video video) {
        String mensagemTexto = video.getArquivo() + " - " + video.getFormato();
        Mensagem mensagem = new Mensagem(mensagemTexto, TipoMensagem.LOG);
        
        for (CanalNotificacao canal : canais) {
            canal.notificar(mensagem);
        }
	}
}
