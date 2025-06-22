package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("moon.png");
        Image image2 = new ProxyImage("earth.png");

        // First time: image will be loaded from server
        image1.display();

        // Second time: image will be retrieved from cache (already loaded)
        image1.display();

        // Load and display another image
        image2.display();
    }
}

