package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCn = new Locale("zn", "CN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeIra = new Locale("fa", "IR");
        Locale localeEgito = new Locale("ar", "EG");

        Calendar calendar = Calendar.getInstance();
        DateFormat dtf1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dtf2 = DateFormat.getDateInstance(DateFormat.FULL, localeCn);
        DateFormat dtf3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dtf4 = DateFormat.getDateInstance(DateFormat.FULL, localeIra);
        DateFormat dtf5 = DateFormat.getDateInstance(DateFormat.FULL, localeEgito);

        System.out.println(dtf1.format(calendar.getTime()));
        System.out.println(dtf2.format(calendar.getTime()));
        System.out.println(dtf3.format(calendar.getTime()));
        System.out.println(dtf4.format(calendar.getTime()));
        System.out.println(dtf5.format(calendar.getTime()));

        System.out.println(localeCn.getCountry());
        System.out.println(localeCn.getDisplayCountry(localeEgito));
    }
}
