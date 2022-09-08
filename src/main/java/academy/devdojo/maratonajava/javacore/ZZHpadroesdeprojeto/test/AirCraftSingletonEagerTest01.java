package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraftSingletonEager;

public class AirCraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1A");


    }

    private static void bookSeat(String seat) {
        AirCraftSingletonEager airCraft = AirCraftSingletonEager.getINSTANCE();
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        System.out.println(airCraft.bookSeat(seat));
    }
}

