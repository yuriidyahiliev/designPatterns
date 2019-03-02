package strategy;

public class HalfPriceStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        return price * 0.5;
    }
}
