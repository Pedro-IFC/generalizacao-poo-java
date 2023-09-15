package Animal;

public class Largato extends Reptil {
	private boolean liberaCauda;

	public boolean isLiberaCauda() {
		return liberaCauda;
	}

	public void setLiberaCauda(boolean liberaCauda) {
		this.liberaCauda = liberaCauda;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Largato [liberaCauda=");
		builder.append(liberaCauda);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
