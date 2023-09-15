package Animal;

public class Animal {
	private float tamanho;
	private float peso;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void andar(float distancia){
		System.out.print("O animal andou " + distancia + " metros");
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [tamanho=");
		builder.append(tamanho);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
}
