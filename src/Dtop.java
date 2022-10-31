
import org.intellij.lang.annotations.Flow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframev extends JFrame implements ActionListener {
    JCheckBox c1, c2;
    JRadioButton b1, b2;
    JTextField tf;

    Myframev() {
        super("MYFRAMES");
        tf = new JTextField("Please Enter Text", 20);
        tf.setBounds(10, 20, 100, 80);
        c1 = new JCheckBox("Bold");
        c2 = new JCheckBox("Italic");
        b1 = new JRadioButton("lower");
        b2 = new JRadioButton("Upper");
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        c1.addActionListener(this);
        c2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(new FlowLayout());
        add(b1); b1.setVisible(true);
        add(b2); b2.setVisible(true);
        add(tf); tf.setVisible(true);
        add(c1); c1.setVisible(true);
        add(c2); c2.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "lower":
                tf.setText(tf.getText().toLowerCase());
                break;
            case "Upper":
                tf.setText(tf.getText().toUpperCase());
                break;
        }
        int b=0, i=0;
        if(c1.isSelected()) b = Font.BOLD;
        if(c2.isSelected()) i = Font.ITALIC;

        Font f = new Font("Times New Roman", b|i, 15);
        tf.setFont(f);
    }



}

public class Dtop{
    public static void main(String args[]){
        Myframev f1 = new Myframev();
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}

