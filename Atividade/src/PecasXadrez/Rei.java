package PecasXadrez;

public class Rei extends PecasXadrez {
	public boolean mover(int linha, int coluna) {
		if(linha <= 8 && coluna <= 8 && linha>0 && coluna>0) {
			if(linha==(this.getLinha()+1)
			|| linha==(this.getLinha()-1)
			|| coluna==(this.getColuna()-1)
			|| coluna==(this.getColuna()+1)) {
				this.setColuna(coluna);
				this.setLinha(linha);
				return true;	
			}
			return false;
		}
		
		return false;
	}
}
