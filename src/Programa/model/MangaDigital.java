package programa.model;

public class MangaDigital extends Manga {

	private float limite;

	public MangaDigital(String nome, String autor, float preco, float limite) {
		super(nome, autor, preco);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Estoque: " + this.limite);
	}
}