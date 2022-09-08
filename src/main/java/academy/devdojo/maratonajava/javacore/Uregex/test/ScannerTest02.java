package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levim,Eren,Mikasa,true,200";
        Scanner scan = new Scanner(texto);
        scan.useDelimiter(",");
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                int i = scan.nextInt();
                System.out.println("Int " + i);
            } else if (scan.hasNextBoolean()) {
                boolean b = scan.nextBoolean();
                System.out.println("Boolean " + b);
            } else {
                System.out.println(scan.next());
            }
        }

    }
}
