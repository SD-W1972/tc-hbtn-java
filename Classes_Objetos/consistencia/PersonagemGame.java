
public class PersonagemGame {
	private int saudeAtual;
	private String nome;
	private String status;

	public PersonagemGame(int saudeInicial, String nomeInicial) {
		setSaudeAtual(saudeInicial);
		this.nome = nomeInicial;
	}
	
	public int getSaudeAtual() {
		return saudeAtual;
	}
	
	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
		
		if(this.saudeAtual > 0) {
			this.status = "vivo";
		}else {
			this.status = "morto";
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		
		  if(nome != null && !nome.isEmpty()) {
	            this.nome = nome;
	        }
	}

	public void tomarDano(int quantidadeDeDano) {
		if(this.saudeAtual - quantidadeDeDano < 0) {
			setSaudeAtual(0);
		}else {
			setSaudeAtual(this.saudeAtual -= quantidadeDeDano);
		}
	}
	
	public void receberCura(int quantidadeDeCura) {
		if(this.saudeAtual + quantidadeDeCura > 100) {
			setSaudeAtual(100);
		}else {
			setSaudeAtual(this.saudeAtual += quantidadeDeCura);
		}
	}
	
	public String getStatus() {
		return status;
	}
}
