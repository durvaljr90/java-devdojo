package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equalsIgnoreCase("green");
//            }
//        });
//        System.out.println(greenCars);

        List<Car> greenCars = filter(cars, car -> car.getColor().equalsIgnoreCase("green"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2010);
        System.out.println(greenCars);
        System.out.println(yearBefore);

    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

}
