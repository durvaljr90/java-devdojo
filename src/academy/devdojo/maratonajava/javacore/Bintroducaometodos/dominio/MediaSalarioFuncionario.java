package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class MediaSalarioFuncionario {
    private double media;

    public double getMedia() {
        return media;
    }

    public void mediaSalarioFuncionario(Funcionario funcionario) {
        if (funcionario.getSalario() == null) {
            return;
        }
        for (double num : funcionario.getSalario()) {
            media += num;
        }
        media /= funcionario.getSalario().length;
        System.out.printf("\nA média salarial é:  %.2f", media);



    }


}
