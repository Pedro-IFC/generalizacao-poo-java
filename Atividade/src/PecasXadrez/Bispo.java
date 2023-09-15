package PecasXadrez;

public class Bispo extends PecasXadrez {
	public class Peao extends PecasXadrez {
		public boolean mover(int linha, int coluna) {
			if(linha <= 8 || coluna <= 8 && linha>0 && coluna>0) {
				if((coluna-this.getColuna()) == (linha-this.getLinha())) {
					this.setColuna(coluna);
					this.setLinha(linha);
					return true;
				}
				return false;
			}
			return false;
		}
	}
}