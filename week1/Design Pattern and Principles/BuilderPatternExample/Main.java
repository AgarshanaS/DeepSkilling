package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        // Basic build
        Computer basicPC = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Configuration:");
        basicPC.displayConfig();
    }
}
