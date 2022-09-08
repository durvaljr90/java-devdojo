package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.servicos.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassesGenericasTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Audi")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Lancha")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetosDisponiveis();
        rentalService.retornarObjetosAlugado(carro);
    }
}
