package Item;

public class ItemMain {
	public static void main(String[] args) {
		Item i = new Item();
		i.setCodigo(0);
		i.setDescricao("Descricao");
		System.out.println(i);
		
		Livro l = new Livro();
		l.setCodigo(0);
		l.setDescricao("Descricao");
		l.setAutor("Autor");
		System.out.println(l);
		
		Midia m = new Midia();
		m.setCodigo(0);
		m.setDescricao("Descricao");
		m.setDuracao(2);
		m.setGravadora("Gravadora");
		System.out.println(m);

		CD cd = new CD();
		cd.setCodigo(0);
		cd.setDescricao("Descricao");
		cd.setDuracao(2);
		cd.setGravadora("Gravadora");
		cd.setAlbum("Album");
		cd.setArtista("Artista");
		cd.setFaixas(2);
		System.out.println(cd);

		VHS vhs = new VHS();
		vhs.setCodigo(0);
		vhs.setDescricao("Descricao");
		vhs.setDuracao(2);
		vhs.setGravadora("Gravadora");
		vhs.setTitulo("Titulo");
		System.out.println(vhs);
	}
}
