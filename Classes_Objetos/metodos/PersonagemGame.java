
public class PersonagemGame {
	private int saudeAtual;
	private String nome;

	public int getSaudeAtual() {
		return saudeAtual;
	}
	
	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void tomarDano(int quantidadeDeDano) {
		if(this.saudeAtual - quantidadeDeDano < 0) {
			this.saudeAtual = 0;
		}else {
			this.saudeAtual -= quantidadeDeDano;
		}
	}
	
	public void receberCura(int quantidadeDeCura) {
		if(this.saudeAtual + quantidadeDeCura > 100) {
			this.saudeAtual = 100;
		}else {
			this.saudeAtual += quantidadeDeCura;
		}
	}
}
