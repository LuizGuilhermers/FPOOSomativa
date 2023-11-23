package Desafio05;

public class Livro extends Produto{
	
	public Livro (String nome) {
		super (nome);
	}
	
	private String autor;
	private int paginas;
	public Livro(String nome, String autor, int paginas) {
		super(nome);
		this.autor = autor;
		this.paginas = paginas;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

}
