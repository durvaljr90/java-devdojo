package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'São Paulo' dd 'de' MMMM 'de' yyyy 'são agora' HH 'horas e ' mm 'minutos '";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);
        sdf.format(new Date());

        System.out.println(sdf.format(new Date()));
    }
}
