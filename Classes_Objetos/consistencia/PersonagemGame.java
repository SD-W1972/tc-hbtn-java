public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saude, String nome){
        setSaudeAtual(
            saude
        );
        setNome(
            nome
        );
    }


    public int getSaudeAtual(){
        return this.saudeAtual;
    }
    public void setSaudeAtual(int saude){
        this.saudeAtual = saude;
        if(this.saudeAtual > 0){
            this.status = "vivo";
        }else{
            this.status = "morto";
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
            if(nome != null && !nome.isEmpty()){   
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
