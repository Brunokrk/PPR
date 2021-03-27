package dados;

public class Post extends Discussao{
	
	private String pergunta;
	
	public Post() {
		super();
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	@Override
	public String toString() {
		return "Post [pergunta=" + pergunta + "]";
	}
	
	
}
