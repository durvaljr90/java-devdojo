package academy.devdojo.maratonajava.javacore.ZZA.classesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassesAttributes() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest = new OuterClassesTest01();
        Inner inner = outerClassesTest.new Inner();
        inner.printOuterClassesAttributes();

        //OR

        Inner inner2 = new OuterClassesTest01().new Inner();
        inner2.printOuterClassesAttributes();

    }
}
