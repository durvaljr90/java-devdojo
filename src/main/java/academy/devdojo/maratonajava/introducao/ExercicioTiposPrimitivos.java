package academy.devdojo.maratonajava.introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class ExercicioTiposPrimitivos {

    public static void main(String[] args) {

        String nome = "Duval";
        String endereco = "Itaquera";
        double salario = 3121.32;
        String dataRecebimentoSalario = "08/08/2022";
        String relatorio = "Eu " + nome+ ", morando no endereço "+ endereco +", "
                +"confirmo que recebi o salário " + salario + " de , na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
