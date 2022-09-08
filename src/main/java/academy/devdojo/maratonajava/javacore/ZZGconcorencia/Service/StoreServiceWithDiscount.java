package academy.devdojo.maratonajava.javacore.ZZGconcorencia.Service;

import academy.devdojo.maratonajava.javacore.ZZGconcorencia.dominio.Discount;
import academy.devdojo.maratonajava.javacore.ZZGconcorencia.dominio.Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discount = Discount.Code.values()[ThreadLocalRandom.
                current().nextInt(Discount.Code.values().length)];
        return String.format("%s: %.2f: %s", storeName, price, discount);
    }
    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }
    public String applyDiscount(Quote quote){
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format("%s original price %.2f . Applying discount code %s . Final price: %.2f",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountValue);
    }
    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
