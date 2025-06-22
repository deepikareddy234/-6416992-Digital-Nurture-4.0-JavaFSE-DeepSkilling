package ProxyPatternExample;

public class ImageViewerApp {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("landscape.jpg");

        img1.display(); // Loads from server
        System.out.println("---");
        img1.display(); // Uses cache
    }
}
