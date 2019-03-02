package prototype;

public class User implements Cloneable {

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}
