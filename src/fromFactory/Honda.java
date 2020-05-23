package fromFactory;

import fromFactory.Movable;

public class Honda implements Movable {
    @Override
    public double getSpeed() {
        return 300;
    }
}
