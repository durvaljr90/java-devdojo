package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimeProfessorSeminarios() {
        System.out.println(this.nome + " com especialidade em " + this.especialidade);
        if (seminarios == null) return;
        System.out.println("Irá ministrar os seguintes seminários: ");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
