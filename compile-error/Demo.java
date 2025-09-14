public class Demo {
    public static void main(String[] args) {
        // Intentional error: Foo class is not defined
        Foo foo = new Foo();
        System.out.println("This will never compile.");
    }
}