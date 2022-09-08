package academy.devdojo.maratonajava.javacore.ZZGconcorencia.Service;


import academy.devdojo.maratonajava.javacore.ZZGconcorencia.dominio.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retriveEmail();
                if (email == null) continue;
                System.out.println(threadName + " enviando e-mail para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");
    }

}

