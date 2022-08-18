package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Local {
    private String endereco;
    private Seminario[] seminarios;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco, Seminario[] seminario) {
        this.endereco = endereco;
        this.seminarios = seminario;
    }

    public void imprimeLocalSeminario(){
        System.out.println(this.endereco);
        if(seminarios == null) return;
        for(Seminario semenario: seminarios){
            System.out.println(semenario.getTitulo());
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
