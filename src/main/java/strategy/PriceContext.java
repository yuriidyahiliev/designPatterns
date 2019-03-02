package strategy;

public class PriceContext {

    private Strategy strategy;

    public PriceContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double price) {
        return strategy.getPrice(price);
    }
}
