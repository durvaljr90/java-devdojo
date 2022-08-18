package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataRemover {
    void remove();
    default void checkPermission(){
        System.out.println("Verificando permissões na interface");
    };
}
