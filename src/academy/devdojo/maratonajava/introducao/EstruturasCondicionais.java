package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (idade >= 18) {
            System.out.println("Autorizado comprar bebida alcólica");
        }

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida alcólica");
        }

        // !
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado comprar bebida alcólica");
        }

        boolean c = true;
        if (c == true) {
            System.out.println("Entrou no laço");
        }

        idade = 32;

        if (idade < 18) {
            System.out.println("Não autorizado a dirigir");
        } else {
            System.out.println("Autorizado a tirar habilitação");
        }

        if (idade < 15) {
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade <18) {
            System.out.println("Categoria junenil");
        } else {
            System.out.println("Categoria adulto");
        }

    }
}
