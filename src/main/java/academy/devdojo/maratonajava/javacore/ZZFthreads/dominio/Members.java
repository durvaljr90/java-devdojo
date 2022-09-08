package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

import javax.swing.plaf.TableHeaderUI;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou e-mail na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " verificando se existem e-mails diponiveis.");
        synchronized (this.emails){
            while(this.emails.size() == 0) {
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem e-mail disponiveis para consulta");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais pegando e-mails");
            this.emails.notifyAll();
        }
    }
}
