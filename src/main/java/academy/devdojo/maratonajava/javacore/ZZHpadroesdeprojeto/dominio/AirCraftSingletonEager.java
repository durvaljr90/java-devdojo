package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraftSingletonEager {
    public static final AirCraftSingletonEager INSTACE = new AirCraftSingletonEager("747-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static AirCraftSingletonEager getINSTANCE() {
        return INSTACE;
    }
}
