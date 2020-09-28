package Match;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LabEx1 extends JFrame {

    public int count1 = 0;
    public int count2 = 0;
    JButton but1 = new JButton ("AC Milan");
    JButton but2 = new JButton ("Real Madrid");
    JLabel lb1 = new JLabel ("Result: 0 X 0");
    JLabel lb2 = new JLabel ("Last Scorer: N/A");
    JLabel lb3 = new JLabel ("Winner: DRAW");

    public LabEx1 () {
        setLayout (null);
        but1.setBounds (100, 350, 150, 50);
        but2.setBounds (300, 350, 150, 50);
        add(but1);
        add(but2);
        lb1.setBounds (50,  50,  300, 50);
        lb2.setBounds (50,  150,  300, 50);
        lb3.setBounds (50,  250,  300, 50);
        add(lb1);
        add(lb2);
        add(lb3);
        setSize (1000, 1000);

        but1.addActionListener (listener1);
        but2.addActionListener (listener2);

    }

    ActionListener listener1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count1++;
            lb1.setText ("Result: "+count1+" X "+count2);
            lb2.setText ("AC Milan");
            if (count1 == count2) {
                lb3.setText ("Winner: DRAW");
            }
            else {
                if (count1 > count2)  {
                    lb3.setText("Winner: AC Milan");
                }
                else {
                    lb3.setText("Winner: Real Madrid");
                }
            }
        }
    };

    ActionListener listener2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count2++;
            lb1.setText ("Result: "+count1+" X "+count2);
            lb2.setText ("Real Madrid");
            if (count1 == count2) {
                lb3.setText ("Winner: DRAW");
            }
            else {
                if (count1 > count2)  {
                    lb3.setText("Winner: AC Milan");
                }
                else {
                    lb3.setText("Winner: Real Madrid");
                }
            }
        }
    };

    public static void main (String [] args) {
        new LabEx1().setVisible (true);
    }
}
