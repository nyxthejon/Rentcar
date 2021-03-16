import javax.swing.*;

public class testform {

        private JTextField funnyMomentTextField;
        private JPanel fieldtest;
         private JComboBox comboBox1;

    public testform()
        {

            JFrame frame = new JFrame("My First GUI");
            frame.setContentPane(fieldtest);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setSize(300, 300);

            frame.setVisible(true);

        }

    }


