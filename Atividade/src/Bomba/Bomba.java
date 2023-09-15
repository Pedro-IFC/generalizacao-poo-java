package Bomba;

public class Bomba {
	private double totalLitros;
	private float valorLitro;
	public double getTotalLitros() {
		return totalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public boolean abastecerporLitro(int litros) {
		if(this.getTotalLitros() - litros >=0) {
			this.setTotalLitros(this.getTotalLitros() - litros);
			return true;
		}
		return false;
	}
	public boolean abastecerporvalor(double valor) {
		int litros = (int)((int)valor/(int)this.getValorLitro());
		return abastecerporLitro(litros);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
	
}
