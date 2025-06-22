package BuilderPatternExample;

public class ComputerApp {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 4080")
                .build();

        System.out.println("Basic Configuration: " + basicComputer);
        System.out.println("Gaming Configuration: " + gamingComputer);
    }
}
