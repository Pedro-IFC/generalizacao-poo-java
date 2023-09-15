package PecasXadrez;

public class Torre extends PecasXadrez {
	public class Peao extends PecasXadrez {
		public boolean mover(int linha, int coluna) {
			if(linha <= 8 || coluna <= 8 && linha>0 && coluna>0) {
				int movimentos =2;
				movimentos -= coluna == this.getColuna() ? 1: 0;
				movimentos -= linha == this.getLinha() ? 1: 0;
				if(movimentos==1) {
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
