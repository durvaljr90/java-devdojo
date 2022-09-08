package academy.devdojo.maratonajava.javacore.ZZGconcorencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorencia.Service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorencia.Service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPriceAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPriceAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s)))
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("TIme passed to searchPriceSync %d%n", (end - start));

    }
}
