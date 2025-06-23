package produtos;

public class Livro extends produtos.Produto {
	private int paginas;
	private String autor;
	private int edicao;
	
	
	public double obterPrecoLiquido() {
		 return Math.round(precoBruto * 1.15 * 100.0) / 100.0;
	}
	
	public Livro(String titulo, int ano, String pais, 
			double precoBruto, int paginas, String autor, int edicao) {
		super(titulo, ano, pais, precoBruto);
		this.paginas = paginas;
		this.autor = autor;
		this.edicao = edicao;
		
	}
	
	public int getPaginas() { return paginas; }
	public String getAutor() { return autor; }
	public int getEdicao() { return edicao; }
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
}
