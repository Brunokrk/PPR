//Alisson Schmitt, Bruno Marchi Pires, Vinícius Kreutz
package dados;

public class Avaliacao {
	private double ranking; 
	private String descricao;
	private int id; //não especificaram tipo, botei int
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRanking() {
		return ranking;
	}
	public void setRanking(double ranking) {
		this.ranking = ranking;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Avaliacao [ranking=" + ranking + ", descricao=" + descricao + "]";
	}
	
	
	
}
