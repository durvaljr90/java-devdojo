package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle1.getString("ola"));
        System.out.println(bundle1.getString("bom.dia"));

    }
}
