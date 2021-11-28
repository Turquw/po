import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kalkulator extends JFrame {
    private JPanel main;
    private JButton obliczButton;
    private JButton wyczyscButton;
    private JTextField promien;
    private JTextField wysokosc;
    private JTextField bokb;
    private JTextField podaja;
    private JTextField pole;
    private JTextField obwod;
    private JTextField objetosc;
    private JRadioButton trapez;
    private JRadioButton trojkat;
    private JRadioButton prostokatRadioButton;
    private JRadioButton kwadratRadioButton;
    private JRadioButton sześcianRadioButton;
    private JRadioButton prostopadloscianRadioButton;
    private JRadioButton walecRadioButton;
    private JRadioButton kulaRadioButton;
 private double a,b,r,h,p,ob,v;
    public static void main(String[] args) {
        kalkulator termometr=new kalkulator();
        termometr.setVisible(true);
    }
    public kalkulator() {
        this.setContentPane(this.main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);
        ButtonGroup group = new ButtonGroup();
        group.add(kwadratRadioButton);
        group.add(prostokatRadioButton);
        group.add(kulaRadioButton);
        group.add(walecRadioButton);
        group.add(trapez);
        group.add(trojkat);
        group.add(sześcianRadioButton);
        group.add(prostopadloscianRadioButton);
        ActionListener Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obk = e.getSource();
                if(kwadratRadioButton.isSelected()==true){promien.setEnabled(false);wysokosc.setEnabled(false);objetosc.setEnabled(false);
                bokb.setEnabled(false);
                    if (obk == obliczButton || obk == podaja) {
                        a = Double.parseDouble(podaja.getText());
                        p = a*a;
                        pole.setText(String.valueOf(p));
                        ob=a*4;
                        obwod.setText(String.valueOf(ob));
                    }
                }
                else  if(prostokatRadioButton.isSelected()==true){promien.setEnabled(false);wysokosc.setEnabled(false);objetosc.setEnabled(false);

                    if (obk == obliczButton || obk == podaja||obk==bokb) {
                        a = Double.parseDouble(podaja.getText());
                        b= Double.parseDouble(bokb.getText());
                        p = a*b;
                        pole.setText(String.valueOf(p));
                        ob=a+a+b+b;
                        obwod.setText(String.valueOf(ob));
                    }}
                else  if(trojkat.isSelected()==true){promien.setEnabled(false);wysokosc.setEnabled(true);objetosc.setEnabled(false);
                        bokb.setEnabled(true);
                        if (obk == obliczButton || obk == podaja||obk==wysokosc||obk==bokb) {
                            a = Double.parseDouble(podaja.getText());
                            h = Double.parseDouble(wysokosc.getText());
                            b = Double.parseDouble(bokb.getText());
                            p = a*h;
                            p=p/2;
                            pole.setText(String.valueOf(p));

                            ob=a+b+h;

                            obwod.setText(String.valueOf(ob));
                        }}
                else if(trapez.isSelected()==true){promien.setEnabled(false);wysokosc.setEnabled(true);objetosc.setEnabled(false);
                    bokb.setEnabled(true);
                    if (obk == obliczButton || obk == podaja||obk==wysokosc||obk==bokb) {
                        a = Double.parseDouble(podaja.getText());
                        h = Double.parseDouble(wysokosc.getText());
                        b = Double.parseDouble(bokb.getText());
                        p = a+b;
                        p=p/2;
                        p=p*h;
                        pole.setText(String.valueOf(p));
                        v=a-b;
                        double c=0;
                        c=(v*v)+(h*h);
                        c=Math.sqrt(c);
                        ob=c+c+a+b;

                        obwod.setText(String.valueOf(ob));
                    }}
                else if(sześcianRadioButton.isSelected()==true){promien.setEnabled(false);wysokosc.setEnabled(false);objetosc.setEnabled(true);
                    bokb.setEnabled(false);
                    if (obk == obliczButton || obk == podaja) {
                        a = Double.parseDouble(podaja.getText());

                        p = Math.pow(a,2)*6;

                        pole.setText(String.valueOf(p));
                        ob=12*a;
                        obwod.setText(String.valueOf(ob));
                        v=a*a*a;
                        objetosc.setText(String.valueOf(v));
                    }}

                else  if(prostopadloscianRadioButton.isSelected()==true){promien.setEnabled(false);wysokosc.setEnabled(true);objetosc.setEnabled(true);
                    bokb.setEnabled(true);
                    if (obk == obliczButton || obk == podaja||obk==wysokosc||obk==bokb) {
                        a = Double.parseDouble(podaja.getText());
                        h = Double.parseDouble(wysokosc.getText());
                        b = Double.parseDouble(bokb.getText());
                        p = (h+b)*2+(h+b)*2+(a+b)*2;

                        pole.setText(String.valueOf(p));

                        ob=4*a+4*b+4*h;

                        obwod.setText(String.valueOf(ob));
                        v=a*b*h;
                        objetosc.setText(String.valueOf(v));
                    }}
                else  if(walecRadioButton.isSelected()==true){promien.setEnabled(true);wysokosc.setEnabled(true);objetosc.setEnabled(true);
                    bokb.setEnabled(false);obwod.setEnabled(false);podaja.setEnabled(false);
                    if (obk == obliczButton || obk == podaja||obk==wysokosc||obk==bokb) {

                        h = Double.parseDouble(wysokosc.getText());

                        r = Double.parseDouble(promien.getText());
                        p = 2*Math.PI*r*r+2*Math.PI*h;

                        pole.setText(String.valueOf(p));
                        double pp;

                        v=Math.PI*r*r*h;


                        objetosc.setText(String.valueOf(v));
                    }}
                else  if(kulaRadioButton.isSelected()==true){promien.setEnabled(true);wysokosc.setEnabled(false);objetosc.setEnabled(true);
                    bokb.setEnabled(false);obwod.setEnabled(false);podaja.setEnabled(false);
                    if (obk == obliczButton || obk == podaja||obk==wysokosc||obk==bokb) {



                        r = Double.parseDouble(promien.getText());
                        p = Math.PI*r*r*4;

                        pole.setText(String.valueOf(p));


                        v=4/3*Math.PI*r*r*r;


                        objetosc.setText(String.valueOf(v));
                    }}


                    }


                };
        kwadratRadioButton.addActionListener(Listener);
        obliczButton.addActionListener(Listener);
        trojkat.addActionListener(Listener);
        prostokatRadioButton.addActionListener(Listener);
        trapez.addActionListener(Listener);
        sześcianRadioButton.addActionListener(Listener);
        prostopadloscianRadioButton.addActionListener(Listener);
        walecRadioButton.addActionListener(Listener);
        kulaRadioButton.addActionListener(Listener);
}}
