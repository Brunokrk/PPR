package dados;

public class Discussao {
	private String titulo;
	private String conteudo;
	private int id; //n�o especificaram tipo, botei int
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "Discussao [titulo=" + titulo + ", conteudo=" + conteudo + "]";
	}
	
}
