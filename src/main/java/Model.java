/**
 * A minimal class to maintain some state
 */
public class Model {
    private int count = 0;
    private final IView view;

    public Model(IView v)
    {
        view = v;
    }

    public void addOneToCount() {
        count++;
        view.showNewCount(String.valueOf(count));
    }
    
}
