public class Controller {

    private final Model model;
    public Controller(Model m) {
        model = m;
    }

    public void increment() {
        model.addOneToCount();
    }
}
