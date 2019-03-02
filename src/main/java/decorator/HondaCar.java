package decorator;

public class HondaCar implements Car {

    @Override
    public void drive() {
        System.out.println("Honda car is driving...");
    }
}
