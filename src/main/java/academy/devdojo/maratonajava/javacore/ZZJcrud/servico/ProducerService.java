package academy.devdojo.maratonajava.javacore.ZZJcrud.servico;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repositorio.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            case 2:
                delete();
                break;
            case 3:
                save();
                break;
            case 4:
                update();
                break;
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = INPUT.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));

    }

    private static void delete() {
        System.out.println("Type the id of the producer you want to delete");
        int id = Integer.parseInt(INPUT.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = INPUT.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = INPUT.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    private static void update() {

        System.out.println("Type the ID the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(INPUT.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found.");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Producer found " + producerFromDb);
        System.out.println("Type the new name or enter to keep the same");
        String name = INPUT.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;

        Producer producerToUpdate = Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();
        ProducerRepository.update(producerToUpdate);
    }


}
