package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraftSingletonLazy {
    public static AirCraftSingletonLazy INSTACE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static AirCraftSingletonLazy getINSTANCE() {
        if (INSTACE == null) {
            synchronized (AirCraftSingletonLazy.class) {
                if (INSTACE == null) {
                    INSTACE = new AirCraftSingletonLazy("797-299");
                }
            }
        }
        return INSTACE;
    }
}
