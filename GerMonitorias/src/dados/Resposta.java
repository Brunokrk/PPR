package dados;

public class Resposta extends Discussao{
	private String resposta;

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return "Resposta [resposta=" + resposta + "]";
	}
	
}
