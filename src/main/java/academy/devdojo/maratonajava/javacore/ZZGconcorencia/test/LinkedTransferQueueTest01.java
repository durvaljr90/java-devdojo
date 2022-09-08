package academy.devdojo.maratonajava.javacore.ZZGconcorencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();

        System.out.println(tq.add("Durval")); // Caso não seja possível lança uma exceção
        System.out.println(tq.offer("Durval")); // Caso não seja possível o valode retorno é false
        System.out.println(tq.offer("Durval", 5, TimeUnit.SECONDS));

        tq.put("DevDovo");
        if(tq.hasWaitingConsumer()){
            tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element()); // buscar o primeiro elemento sem remover, mas se estiver em branco ele lança um exceção
        System.out.println(tq.peek()); // buscar o primeiro elemento sem remover, mas se estiver em branco ele retorna null
        System.out.println(tq.poll()); // buscar o primeiro elemento e remove o elemento, mas se estiver vazio ele retorna null
        System.out.println(tq.remove()); // buscar o primeiro elemento e remove o elemento, mas se estiver vazio ele lança uma exceção
        System.out.println(tq.take()); // busca e remove o primeiro elemento, caso esteja vazio ele fica aguardando até que um elemento entre para que ele possa remover



    }
}
