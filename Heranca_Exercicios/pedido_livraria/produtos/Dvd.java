package produtos;

public class Dvd extends produtos.Produto {
	private String diretor;
	private String genero;
	private int duracao;
	
	
	public double obterPrecoLiquido(){
		 return Math.round(precoBruto * 1.20 * 100.0) / 100.0;
	}
	
	public Dvd(String titulo, int ano, String pais, 
			double precoBruto, String diretor, String genero, 
			int duracao) {
		super(titulo, ano, pais, precoBruto);
		this.diretor = diretor;
		this.genero = genero;
		this.duracao = duracao;
	}
	
	public String getDiretor() {
		return diretor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}
