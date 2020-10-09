import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class afvink5 extends JFrame implements ActionListener {

    private JButton b1;
    private JTextField t1, t2;

    public static void main(String[] args) {
        JFrame f = new afvink5();
        f.setBounds(300, 300, 400, 150);
        ((afvink5) f).createGUI();
        f.setVisible(true);

    }
    void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        b1 = new JButton("start");
        t1 = new JTextField("vul hier de 1 lettercode in");
        t1.setPreferredSize(new Dimension(200,25));
        t2 = new JTextField("hier komt de 3 lettercode");
        t2.setPreferredSize(new Dimension(400,25));
        window.add(t1);
        window.add(b1);
        window.add(t2);
        b1.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String x = t1.getText().toUpperCase();
        String sheesh = "";
        try {
            for (int i = 0; i < x.length(); i++) {
                Character z = x.charAt(i);
                String a = z.toString();
                String y = Translator.one2three(a);
                sheesh += y+" ";
            t2.setText(sheesh);
            }
        } catch (NotAnAA notAnAA) {
            t2.setText(notAnAA.getMessage());
        }
    }
}