package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisOperadorTernario {
    public static void main(String[] args) {
        //Operador ternário: (condição) ? verdadeiro : falso
        double salary = 4000;
        String fazerDoacao = "Fazer uma doação de 500";
        String naoFazerDoacao = "Ainda não tenho condiçoes de fazer doação";

        String resultado = salary > 4500 ? fazerDoacao : naoFazerDoacao;

        System.out.println(resultado);

    }
}
