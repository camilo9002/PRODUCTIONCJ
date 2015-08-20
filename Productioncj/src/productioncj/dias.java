package productioncj;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class dias extends Applet implements ActionListener {
    Label l1,l2,l3,l4,l5;

    public TextField getT5() {
        return t5;
    }

    public void setT5(TextField t5) {
        this.t5 = t5;
    }
    TextField t1,t2,t3,t4,t5;
    Button b;
    int anon = 365;
    int anob = 366;
    
    public void dias(){
    
    l1 = new Label("Año");
    t1 = new TextField(1);
    l2 = new Label("Dias");
    t2 = new TextField(2);
    l3 = new Label("Año");
    t3 = new TextField(3);
    l4 = new Label("Mes");
    t4 = new TextField(4);
    l5 = new Label("Dias");
    t5 = new TextField(5);
    b = new Button("Calcular");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b);
    add(l3);
    add(t3);
    add(l4);
    add(t4);
    add(l5);
    add(t5);
    b.addActionListener(this);
}
    public void actionPerformed(ActionEvent ae){
        int ano = Integer.parseInt(t1.getText());
        int mes = Integer.parseInt(t2.getText());
        
    }
}
