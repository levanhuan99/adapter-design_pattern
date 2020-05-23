import adpter.MovableAdapter;
import adpter.MovableAdapterImpl;
import fromFactory.Honda;
import fromFactory.Movable;

public class Test {
    public static void main(String[] args) {
        Movable honda=new Honda();//MPH
        MovableAdapter hondaAdapter=new MovableAdapterImpl(honda);
        System.out.println(hondaAdapter.getSpeed());
    }
}
