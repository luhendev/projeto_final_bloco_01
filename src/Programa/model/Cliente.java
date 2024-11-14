package programa.model;

public abstract class Cliente {

	private String cliente;
	private int numeroMangas;
	private String tituloManga;
	private int quantidade;
	private float preco;

	public Cliente(String cliente, int numeroMangas, String tituloManga, int quantidade, float preco) {
		this.cliente = cliente;
		this.numeroMangas = numeroMangas;
		this.tituloManga = tituloManga;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumeroMangas() {
		return numeroMangas;
	}

	public void setNumeroMangas(int numeroMangas) {
		this.numeroMangas = numeroMangas;
	}

	public String getTituloManga() {
		return tituloManga;
	}

	public void setTituloManga(String tituloManga) {
		this.tituloManga = tituloManga;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Carrinho:");
		System.out.println("***********************************************************");
		System.out.println("Cliente: " + this.cliente);
		System.out.println("Número de Mangás: " + this.numeroMangas);
		System.out.println("Título do Mangá: " + this.tituloManga);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Preço Unitário: R$" + this.preco);
		System.out.println("Total: R$" + (this.preco * this.quantidade));
	}
}