package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraftSingletonEnum;

public class AirCraftSingletonTest01 {
    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        AirCraftSingletonEnum airCraft = AirCraftSingletonEnum.INSTANCE;
        System.out.println(AirCraftSingletonEnum.INSTANCE.hashCode());
        System.out.println(airCraft.bookSeat(seat));
    }
}
