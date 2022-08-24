package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String locale : isoCountries) {
            System.out.print(locale + " ");
        }
        System.out.println();

        for (String locale : isoLanguages) {
            System.out.print(locale + " ");
        }

    }
}
