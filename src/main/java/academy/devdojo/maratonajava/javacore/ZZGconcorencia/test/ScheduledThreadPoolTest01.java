package academy.devdojo.maratonajava.javacore.ZZGconcorencia.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");
        };

//        executor.schedule(r, 5, TimeUnit.SECONDS); // Executa apenas uma vez e fica aguardando. o shutdown
//        executor.shutdown();
//        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 0, 5, TimeUnit.SECONDS);// ele fica rodando sem parar
        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleAtFixedRate(r, 0, 5, TimeUnit.SECONDS);// ele fica rodando sem parar
        executor.schedule(() -> {
            System.out.println("Cancelando o scheduleWithFixedDelay");
            scheduleWithFixedDelay.cancel(false);
            executor.shutdown();
        }, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(formatter));
        beeper();

    }
}
