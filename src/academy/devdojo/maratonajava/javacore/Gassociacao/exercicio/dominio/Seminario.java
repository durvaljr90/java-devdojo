package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno) {
        this.titulo = titulo;
        this.alunos = aluno;
    }


    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprimeSeminarios() {
        System.out.println(this.titulo);
        if (local == null) return;
        ;
        System.out.println(local.getEndereco());
        if (alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
