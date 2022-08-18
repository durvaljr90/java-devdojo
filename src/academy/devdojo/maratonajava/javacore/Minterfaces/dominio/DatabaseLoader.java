package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Imprimindo dados de um bando de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Verificando permissões no banco de dados");
    }
}

