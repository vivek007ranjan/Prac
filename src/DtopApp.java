import com.sun.source.tree.LabeledStatementTree;
import org.w3c.dom.Text;

import java.awt.*;

public class DtopApp {
    public static void main(String[] args) {
        Frame f = new Frame("DAP");
        Button b = new Button("Click");
        TextField tf = new TextField(20);
        Label LuserName = new Label("Username");
        Label Lpassword = new Label("Password");
        f.setLayout(new FlowLayout());
        f.add(LuserName);
        f.add(tf);
        f.add(Lpassword);
      //  f.add(tf,10);
        f.add(b);
        f.setVisible(true);
        f.setSize(1000,500);

    }
}
