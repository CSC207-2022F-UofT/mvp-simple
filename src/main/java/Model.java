/**
 * A minimal class to maintain some state
 */
public class Model {
    private int count = 0;
    private final View view;

    public Model(View v)
    {
        view = v;
    }

    public void addOneToCount() {
        count++;
        view.setLabelText(String.valueOf(count));
    }
    
}
