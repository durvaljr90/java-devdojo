package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.servico.AnimeService;
import academy.devdojo.maratonajava.javacore.ZZJcrud.servico.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
//        ProducerService producerService =
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(INPUT.nextLine());
            if (op == 0) break;
            switch (op) {
                case 1:
                    producerMenu();
                    op = Integer.parseInt(INPUT.nextLine());
                    ProducerService.menu(op);
                    break;
                case 2:
                    animeMenu();
                    op = Integer.parseInt(INPUT.nextLine());
                    AnimeService.menu(op);
                    break;
                default:
                    continue;


            }
            ;
        }

    }

    private static void menu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Producer");
        System.out.println("2. Anime");
        System.out.println("0. Exit");
    }

    private static void producerMenu() {
        System.out.println("Type the number od your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("9. Go back");
    }

    private static void animeMenu() {
        System.out.println("Type the number od your operation");
        System.out.println("1. Search for anime");
        System.out.println("2. Delete anime");
        System.out.println("3. Save anime");
        System.out.println("4. Update anime");
        System.out.println("9. Go back");
    }
}
