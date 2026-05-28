package br.ufpb.dcx.victoria.cafeteria;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorCafeterias gerenciador = new GerenciadorCafeterias();

        System.out.println("=== SISTEMA DE CAFETERIAS INICIADO!===");
            int opcao = 0;

            while (opcao != 3) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Cadastrar");
                System.out.println("2. Buscar");
                System.out.println("3. Sair");
                System.out.println("Escolha uma opção:");

                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1) {
                    System.out.println("Digite o nome da cafeteria:");
                    String nome = scanner.nextLine();

                    Cafeteria novaCafeteria =  new Cafeteria(nome, "", 0);
                    gerenciador.adicionarCafeterias(novaCafeteria);

                    System.out.println("Cafeteria" + nome + "cadastrada com seucesso!");

                } else if (opcao == 2){
                    try {
                        System.out.println("Digite o nome da cafeteria que deseja buscar: ");
                        String nomeBusca = scanner.nextLine();
                        Cafeteria encontrada = gerenciador.buscarCafeteriaPorNome(nomeBusca);
                        System.out.println("Sucesso! Cafeteria encontrada: " + encontrada.getNome());
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                } else if (opcao == 3) {
                    System.out.println("Saindo do sistema...");
                } else {
                    System.out.println("Opção inválida!");
                }

            }

            scanner.close();
    }
}
