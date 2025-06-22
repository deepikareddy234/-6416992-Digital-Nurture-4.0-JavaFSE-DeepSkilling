package ProxyPatternExample;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Lazy initialization
        } else {
            System.out.println(fileName + " is loaded from cache.");
        }
        realImage.display();
    }
}
