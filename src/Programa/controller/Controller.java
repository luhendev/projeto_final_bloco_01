package programa.controller;

import java.util.ArrayList;

import programa.model.Manga;
import programa.repository.MangaRepository;

public class Controller implements MangaRepository {

	private ArrayList<Manga> carrinho = new ArrayList<Manga>();
	private ArrayList<Manga> listaManga = new ArrayList<Manga>();
	int numero = 0;

	@Override
	public Manga procurarPeloNumero(int numero) {
	    for (Manga manga : listaManga) {
	        if (manga.getNumero() == numero) {
	            return manga;
	        }
	    }
	    System.out.println("Mangá com número " + numero + " não encontrado!");
	    return null; 
	}

	@Override
	public void listarMangas() {
		for (var manga : listaManga) {
			manga.visualizar();
		}
	}

	@Override
	public void adicionarManga(Manga manga) {
		listaManga.add(manga);
	}

	@Override
	public void removerManga(int numero) {
		for (int i = 0; i < listaManga.size(); i++) {
			if (listaManga.get(i).getNumero() == numero) {
				listaManga.remove(i);
				System.out.println("Mangá com número " + numero + " foi removido com sucesso!");
				return;
			}
		}
		System.out.println("Mangá com número " + numero + " não encontrado!");
	}

	public void adicionarCarrinho(Manga manga) {
		carrinho.add(manga);
	}

	public void removerCarrinho(int numero) {
		for (int i = 0; i < carrinho.size(); i++) {
			if (carrinho.get(i).getNumero() == numero) {
				carrinho.remove(i);
				System.out.println("Mangá com número " + numero + " foi removido do carrinho.");
				return;
			}
		}
		System.out.println("Mangá com número " + numero + " não encontrado no carrinho.");
	}

	public void listarCarrinho() {
	    if (carrinho.isEmpty()) {
	        System.out.println("Carrinho vazio.");
	    } else {
	        System.out.println("Itens no Carrinho:");
	        for (var manga : carrinho) {
	            manga.visualizar();
	        }
	    }
	}

	public void finalizarCarrinho() {
		if (carrinho.isEmpty()) {
			System.out.println("Carrinho vazio. Não é possível finalizar a compra.");
		} else {
			System.out.println("Finalizando compra...");

			System.out.println("Compra finalizada! Itens no carrinho:");
			listarCarrinho();
			carrinho.clear();
		}
	}

	public int gerarNumero(Manga manga) {
		int numeroGerado = ++numero;
		manga.setNumero(numeroGerado);
		return numeroGerado;
	}

}
