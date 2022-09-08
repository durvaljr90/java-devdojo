package academy.devdojo.maratonajava.javacore.ZZGconcorencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorencia.Service.StoreServiceWithDiscount;
import academy.devdojo.maratonajava.javacore.ZZGconcorencia.dominio.Quote;

import java.util.List;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        stores.forEach(s -> System.out.println(service.getPriceSync(s)));

//        stores.stream()
//                .map(service::getPriceSync)
//                .map(Quote::newQuote)
//                .map(service::applyDiscount)
//                .forEach(System.out::println);
    }

}
