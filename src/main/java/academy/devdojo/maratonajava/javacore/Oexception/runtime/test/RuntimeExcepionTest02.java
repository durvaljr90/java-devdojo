package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExcepionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode haver divisão por 0");
        }
//        try {
//            return a / b;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
        return a / b;
    }
}
