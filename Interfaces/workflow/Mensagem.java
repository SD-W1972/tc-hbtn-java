
public class Mensagem {
	String texto;
	TipoMensagem tipoMensagem;
	
	public String getTexto() {
		return texto;
	}
	
	public TipoMensagem getTipoMensagem() {
		return tipoMensagem;
	}
	
	public Mensagem(String texto, TipoMensagem tipoMensagem) {
		this.texto = texto;
		this.tipoMensagem = tipoMensagem;
	}
}
