package ObserverPatternExample;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    public void update(double price) {
        System.out.println("[" + name + " - Web] Stock price updated to ₹" + price);
    }
}
