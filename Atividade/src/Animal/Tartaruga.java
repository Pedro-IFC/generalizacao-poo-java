package Animal;

public class Tartaruga extends Reptil {
	private int resistividadeCasco;

	public int getResistividadeCasco() {
		return resistividadeCasco;
	}

	public void setResistividadeCasco(int resistividadeCasco) {
		this.resistividadeCasco = resistividadeCasco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [resistividadeCasco=");
		builder.append(resistividadeCasco);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
