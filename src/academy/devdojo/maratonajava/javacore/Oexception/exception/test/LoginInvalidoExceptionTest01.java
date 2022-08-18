package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner leitor = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário: ");
        String usuarioDigitada = leitor.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = leitor.nextLine();
        if(!usernameDB.equals(usuarioDigitada) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos!!!");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
