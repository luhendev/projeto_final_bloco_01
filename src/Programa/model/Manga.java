package programa.model;

public abstract class Manga {

	private String nome;
	private String autor;
	private float preco;
	private int numero;

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
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
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
        System.out.println("Número: " + numero + " | Nome: " + nome + " | Autor: " + autor + " | Preço: " + preco);
    }
}
