package academy.devdojo.maratonajava.javacore.ZZGconcorencia.test;


import academy.devdojo.maratonajava.javacore.ZZGconcorencia.Service.EmailDeliveryService;
import academy.devdojo.maratonajava.javacore.ZZGconcorencia.dominio.Members;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu e-mail: ");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
