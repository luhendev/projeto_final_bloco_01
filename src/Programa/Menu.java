package programa;

import java.util.Scanner;

import programa.model.Manga;
import programa.model.Cliente;
import programa.model.Carrinho;
import programa.model.MangaDigital;
import programa.util.Cores;

public class Menu {
	public static void main(String[] args) {

        MangaDigital mangaDigital = new MangaDigital("Dragon Ball", "Akira", 30.0f, 0);
        mangaDigital.visualizar();
        
        Cliente carrinho = new Carrinho("Lucas", 2, "Death", 2, 1);
        carrinho.visualizar();
		
		Scanner scanner = new Scanner(System.in);
		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "             E-COMMERCE DE MANGÁS                    ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND
					+ "            1 - Buscar Mangá por Número              ");
			System.out.println("            2 - Listar todos os Mangás               ");
			System.out.println("            3 - Adicionar Mangá ao Carrinho          ");
			System.out.println("            4 - Remover Mangá do Carrinho            ");
			System.out.println("            5 - Ver Carrinho                         ");
			System.out.println("            6 - Finalizar Compra                     ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND
					+ "Selecione uma opção:                                 ");
			System.out.println("                                                     ");
			opcao = scanner.nextInt();

			if (opcao == 7) {
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Buscar Mangá por Número");
				break;
			case 2:
				System.out.println("Listar todos os Mangás");
				break;
			case 3:
				System.out.println("Adicionar Mangá ao Carrinho");
				break;
			case 4:
				System.out.println("Remover Mangá ao Carrinho");
				break;
			case 5:
				System.out.println("Ver Carrinho");
				break;
			case 6:
				System.out.println("Finalizar Compra");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
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