package ObserverPatternExample;

public class StockApp {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Client1");
        Observer web = new WebApp("Client2");

        market.register(mobile);
        market.register(web);

        market.setPrice(101.5);
        System.out.println("---");
        market.setPrice(103.8);

        market.deregister(mobile);
        System.out.println("---");
        market.setPrice(99.9);
    }
}
