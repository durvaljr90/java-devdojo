package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AirCraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    AirCraftSingletonEnum() {
        this.availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public synchronized boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

}
