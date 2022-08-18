package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        if(nome == null) {
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if( idade < 0){
            System.out.println("Idade inválida! ");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

}
