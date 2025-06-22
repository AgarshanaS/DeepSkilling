package BuilderPatternExample;

public class Computer {
    private String CPU;
    private String RAM;

    // Private constructor to enforce object creation via Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void displayConfig() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
    }
}
