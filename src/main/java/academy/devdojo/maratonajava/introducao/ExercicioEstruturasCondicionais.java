package academy.devdojo.maratonajava.introducao;

public class ExercicioEstruturasCondicionais {
    public static void main(String[] args) {

        double anualSalary = 100000;
        double taxeFirst = 9.70;
        double taxeSecond = 37.35;
        double taxeThird = 49.50;
        double taxe;

        if (anualSalary <= 34712) {
            taxe = anualSalary * ( taxeFirst / 100);
        } else if (anualSalary > 34712 && anualSalary <= 68507) {
            taxe = anualSalary * (taxeSecond / 100);
        } else {
            taxe = anualSalary * (taxeThird /100);
        }

        System.out.println(taxe);

    }
}
