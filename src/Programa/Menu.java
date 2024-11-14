package Programa;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("             E-COMMERCE DE MANGÁS                     ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Buscar Mangá              ");
            System.out.println("            2 - Listar todos os Mangás               ");
            System.out.println("            3 - Adicionar Mangá ao Carrinho          ");
            System.out.println("            4 - Remover Mangá do Carrinho          ");
            System.out.println("            5 - Ver Carrinho                         ");
            System.out.println("            6 - Finalizar Compra                      ");
            System.out.println("            7 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");
			opcao = scanner.nextInt();

			if (opcao == 7) {
				System.out.println("\nMangás de todos os genêros!");
				sobre();
                 scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
            	System.out.println("Buscar Mangás");
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
		System.out.println("\n*********************************************************");
        System.out.println("                                                           ");
		System.out.println("Projeto Desenvolvido por: Lucas Henrique");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/luhendev");
        System.out.println("                                                           ");
		System.out.println("*********************************************************");
	}
}