package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraftSingletonLazy;

public class AirCraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1A");


    }

    private static void bookSeat(String seat) {
        AirCraftSingletonLazy airCraft = AirCraftSingletonLazy.getINSTANCE();
        System.out.println(AirCraftSingletonLazy.getINSTANCE());
        System.out.println(airCraft.bookSeat(seat));
    }
}

