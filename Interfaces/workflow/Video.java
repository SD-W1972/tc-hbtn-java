
public class Video {
	String arquivo;
	FormatoVideo formato;
	
	public String getArquivo() {
		return arquivo;
	}
	
	public FormatoVideo getFormato() {
		return formato;
	}
	
	public Video(String arquivo, FormatoVideo formato) {
		this.arquivo = arquivo;
		this.formato = formato;
	}
}
