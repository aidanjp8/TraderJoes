import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class GUI {
    public GUI() throws FileNotFoundException {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.getContentPane().add("Center", panel);
        frame.pack();
        frame.setTitle("RECIPE");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //String[] choices =

        final JComboBox<String> cb = new JComboBox<String>(choice());

        cb.setMaximumSize(cb.getPreferredSize());
        cb.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(cb);

        JButton btn = new JButton("OK");
        btn.setAlignmentX(Component.CENTER_ALIGNMENT); // added code
        panel.add(btn);

        btn.addActionListener((ActionListener) this);

        frame.setVisible(true);
    }

    public String[] choice() {
        return new String[]{"Egg-Frittata", "Steamed-Lentils", "Tteok-Bok-Ki", "Organic-Low-Calorie-Pink-Lemonade"
                , "Organic-Low-Calorie-Lemonade", "Wild-Arugula Veggies", "Jasper-Hill-Vault-No-5-Cave-Aged-Cheese"
                , "All-Natural-Ground-Chicken", "Cinna-Dragons-Gummy-Candy"};
    }

    public static void main(String[] args) throws FileNotFoundException {
        new GUI();
    }
}
