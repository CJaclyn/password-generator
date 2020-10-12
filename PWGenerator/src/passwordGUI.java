import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passwordGUI {

    private JButton button;
    private JPanel panel1;
    private JTextArea textArea1;
    private JLabel image;
    private JLabel label;

    Characters characters = new Characters();

    public passwordGUI() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    textArea1.setText(characters.randomPassword());

            }
        });
    }

    public static void main(String[]args){
        JFrame frame = new JFrame("Password Generator");
        frame.setContentPane(new passwordGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,300);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        image = new JLabel(new ImageIcon("pug.gif"));

    }
}
