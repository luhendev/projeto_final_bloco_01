package programa.model;

public abstract class Manga {

	private String nome;
	private String autor;
	private float preco;

	public Manga(String nome, String autor, float preco) {
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		System.out.println("\nNome do Mangá: " + this.nome);
		System.out.println("Autor: " + this.autor);
		System.out.println("Preço: R$ " + this.preco);
	}
}
