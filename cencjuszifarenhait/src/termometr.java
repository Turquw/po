import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class termometr  extends JFrame {
    private JPanel panel1;
    private JPanel main;
    private JTextField cencjuszpole;
    private JTextField Farenhaidpole;
    private JButton konwertujButtokonwertujn;
    private JButton wyczysc;
    private JButton Wyjscie;
    private JRadioButton czcionkaMala;
    private JRadioButton czcionkaSredniaRadioButton;
    private JRadioButton czcionkaDuzaRadioButton;
    private JCheckBox wielkieLiteryCheckBox;
    private JButton resetuj;
    private double c,f;
    public static void main(String[] args) {
        termometr termometr=new termometr();
        termometr.setVisible(true);
    }
    public termometr() {
        this.setContentPane(this.main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);


        ActionListener Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obk = e.getSource();
                if (obk == konwertujButtokonwertujn || obk == cencjuszpole) {
                    c = Double.parseDouble(cencjuszpole.getText());
                    f = 32.00 + (9 / 5) * c;
                    Farenhaidpole.setText(String.valueOf(f));
                } else if (obk == wyczysc) {
                    cencjuszpole.setText("");
                    Farenhaidpole.setText("");
                    if (wielkieLiteryCheckBox.isSelected() == true) wielkieLiteryCheckBox.setSelected(false);
                    if (czcionkaMala.isSelected() == true) czcionkaMala.setSelected(false);
                    if (czcionkaSredniaRadioButton.isSelected() == true) czcionkaSredniaRadioButton.setSelected(false);
                    if (czcionkaDuzaRadioButton.isSelected() == true) czcionkaDuzaRadioButton.setSelected(false);
                } else if (obk == Wyjscie) {
                    dispose();
                } else if (obk == wielkieLiteryCheckBox) {
                    if (wielkieLiteryCheckBox.isSelected() == true) {
                        Farenhaidpole.setFont(new Font("SanSerif", Font.BOLD, 18));
                    } else {
                        Farenhaidpole.setFont(new Font("SanSerif", Font.PLAIN, 12));
                    }
                } else if (obk == czcionkaMala) {
                    Farenhaidpole.setFont(new Font("SanSerif", Font.PLAIN, 8));
                } else if (obk == czcionkaSredniaRadioButton) {
                    Farenhaidpole.setFont(new Font("SanSerif", Font.PLAIN, 12));
                } else if (obk == czcionkaDuzaRadioButton) {
                    Farenhaidpole.setFont(new Font("SanSerif", Font.PLAIN, 20));
                }
            }

        };
        konwertujButtokonwertujn.addActionListener(Listener);
        wyczysc.addActionListener(Listener);
        Wyjscie.addActionListener(Listener);
        wielkieLiteryCheckBox.addActionListener(Listener);
        czcionkaMala.addActionListener(Listener);
        czcionkaSredniaRadioButton.addActionListener(Listener);
        czcionkaDuzaRadioButton.addActionListener(Listener);
    }
}

