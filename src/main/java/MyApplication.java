import javax.swing.*;

public class MyApplication {
    public MyApplication() {
        new View();
    }

    public static void main(String... args) {
        SwingUtilities.invokeLater(MyApplication::new);
    }
}
