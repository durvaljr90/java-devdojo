package academy.devdojo.maratonajava.introducao;

public class ExercicioEstrututaCondicionalSwitchCase {

    public static void main(String[] args) {
        //Utilizando o switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 domingo

        int diaSemana = 723;

        switch (diaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
