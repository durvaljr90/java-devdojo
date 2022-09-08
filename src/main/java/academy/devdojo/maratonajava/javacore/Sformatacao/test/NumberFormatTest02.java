package academy.devdojo.maratonajava.javacore.Sformatacao.test;


import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeCN = Locale.CANADA;
        Locale localeFR = Locale.FRANCE;
        NumberFormat[] nf1 = new NumberFormat[4];
        nf1 [0] = NumberFormat.getCurrencyInstance(localeBR);
        nf1 [1] = NumberFormat.getCurrencyInstance(localeJP);
        nf1 [2] = NumberFormat.getCurrencyInstance(localeCN);
        nf1 [3] = NumberFormat.getCurrencyInstance(localeFR);

        double valor = 10000000.1213;

        for(NumberFormat numberFormat: nf1 ){
            System.out.println(numberFormat.format(valor));
        }
    }
}
