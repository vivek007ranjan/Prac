import org.intellij.lang.annotations.Flow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {
     Label l,l1;
     TextField tf,tf1;
     Button b;
     public MyFrame()
     {
         super("My App");
         setLayout(new FlowLayout());
         l = new Label("Name");
         b = new Button("OK");
         l1 = new Label("Password");
         tf = new TextField(10);
         tf1 = new TextField(10);
         tf1.setEchoChar('*');
         b.addActionListener(this);
          //   l.setBounds(50,20,10,20);
         //   tf.setBounds(20,20,10,20 );

         add(l);
         add(tf);
         add(l1);
         add(tf1);
         add(b);


     }


    public void actionPerformed(ActionEvent e) {
        tf.setBackground(Color.cyan);
    }
}
