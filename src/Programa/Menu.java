package programa;

import programa.controller.Controller;
import programa.model.Manga;
import programa.model.MangaConcreto;
import java.util.Scanner;
import programa.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Controller manga = new Controller();

		Scanner scanner = new Scanner(System.in);

		String nome;
		String autor;
		float preco;
		int opcao;

		Manga lv1 = new MangaConcreto("Naruto", "Kishimoto", 2.9f);
		Manga lv2 = new MangaConcreto("Dragon Ball", "Akira Toriyama", 2.9f);
		Manga lv3 = new MangaConcreto("Boku No Hero", "Kōhei Horikoshi", 2.9f);

		lv1.setNumero(manga.gerarNumero(lv1));
		lv2.setNumero(manga.gerarNumero(lv2));
		lv3.setNumero(manga.gerarNumero(lv3));

		manga.adicionarManga(lv1);
		manga.adicionarManga(lv2);
		manga.adicionarManga(lv3);

		while (true) {
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "               E-COMMERCE DE MANGÁS                  ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND
					+ "            1 - Buscar Mangá por Número              ");
			System.out.println("            2 - Listar todos os Mangás               ");
			System.out.println("            3 - Adicionar Mangá                      ");
			System.out.println("            4 - Remover Mangá                        ");
			System.out.println("            5 - Ver Carrinho                         ");
			System.out.println("            6 - Adicionar ao Carrinho                ");
			System.out.println("            7 - Remover do Carrinho                  ");
			System.out.println("            8 - Finalizar Carrinho                   ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND
					+ "Selecione uma opção:                                 ");
			System.out.println("                                                     ");
			opcao = scanner.nextInt();

			if (opcao == 9) {
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Digite o número do Mangá que você deseja buscar: ");
				int numeroBusca = scanner.nextInt();
				manga.procurarPeloNumero(numeroBusca);
				break;

			case 2:
				System.out.println("\nListar todos os Mangás:");
				manga.listarMangas();
				keyPress();
				break;
			case 3:
				System.out.println("Adicionar Mangá");

				System.out.println("Digite o nome do Mangá: ");
				scanner.skip("\\R?");
				nome = scanner.nextLine();
				System.out.println("Digite o nome do Autor: ");
				scanner.skip("\\R?");
				autor = scanner.nextLine();
				System.out.println("Digite o preço do Mangá: ");
				preco = scanner.nextFloat();

				Manga novoManga = new MangaConcreto(nome, autor, preco);
				novoManga.setNumero(manga.gerarNumero(novoManga));
				manga.adicionarManga(novoManga);
				System.out.println("Mangá " + nome + " adicionado com sucesso!");
				keyPress();
				break;
			case 4:
				System.out.println("Remover Mangá: ");
				System.out.println("Digite o número do Mangá que você deseja remover: ");
				int numeroRemover = scanner.nextInt();
				manga.removerManga(numeroRemover);
				keyPress();
				break;
			case 5:
				System.out.println("Ver Carrinho: ");
				manga.listarCarrinho();
				break;
			case 6:
			    System.out.println("Adicionar ao Carrinho:");
			    System.out.println("Digite o número do Mangá que você deseja adicionar ao carrinho: ");
			    int numeroAdicionarCarrinho = scanner.nextInt();
			    Manga mangaEncontrada = manga.procurarPeloNumero(numeroAdicionarCarrinho); // Captura o mangá encontrado
			    if (mangaEncontrada != null) {
			        manga.adicionarCarrinho(mangaEncontrada); // Adiciona o mangá ao carrinho
			        System.out.println("Mangá adicionado ao carrinho!");
			    } else {
			        System.out.println("Erro: Mangá não encontrado.");
			    }
			    break;
			case 7:
				System.out.println("Remover do Carrinho:");
				System.out.println("Digite o número do Mangá que você deseja remover do carrinho: ");
				int numeroRemoverCarrinho = scanner.nextInt();
				manga.removerCarrinho(numeroRemoverCarrinho);
				keyPress();
				break;
			case 8:
				System.out.println("Finalizar Carrinho");
				manga.finalizarCarrinho();
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

	private static void keyPress() {
	}

	public static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("                                                     ");
		System.out.println("  Obrigado por visitar nosso e-commerce de mangás!   ");
		System.out.println("       Projeto Desenvolvido por: Lucas Henrique      ");
		System.out.println("    Generation Brasil - generation@generation.org    ");
		System.out.println("             https://github.com/luhendev             ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
	}
}
