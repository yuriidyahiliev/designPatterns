import org.junit.Test;
import strategy.HalfPriceStrategy;
import strategy.PriceContext;

public class StrategyTest {

    @Test
    public void testStrategy() {
        int initialPrice = 100;
        PriceContext priceContext = new PriceContext(new HalfPriceStrategy());
        double price = priceContext.getPrice(initialPrice);
        System.out.println(price);
    }
}
