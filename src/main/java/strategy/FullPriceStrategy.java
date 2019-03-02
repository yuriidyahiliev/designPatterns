package strategy;

public class FullPriceStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        return price;
    }
}
