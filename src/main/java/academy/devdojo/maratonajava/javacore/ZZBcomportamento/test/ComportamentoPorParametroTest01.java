package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "reD"));
        System.out.println("------");
        System.out.println(filterByYear(cars, 2020));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor){
        List<Car> filterCar = new ArrayList<>();
        for(Car car: cars) {
            if(car.getColor().equalsIgnoreCase(cor)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterByYear(List<Car> cars, int year) {
        List<Car> carsByYearBefore = new ArrayList<>();
        for(Car car: cars) {
            if(car.getYear() < year) {
                carsByYearBefore.add(car);
            }
        }
        return carsByYearBefore;
    }

}
