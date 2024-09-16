package day32;

/*
 * program to add two numbers by a button click
 * 
 * Applet program consist of two section
 * 1)Source code 
 * 2)HTML code
 */
import java.awt.*;//abstract windowing toolkit
import java.awt.event.*;//to get event access like click ,,mouse pointer

import javax.swing.Action;

import java.applet.*;

public class gui extends Applet implements ActionListener {

    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    TextField t3=new TextField(10);

    Label l1=new Label("first no");
    Label l2=new Label("second no");
    Label l3=new Label("sum");
    Button b=new Button("Add");

    public void init(){
        add(l1);
        add(t1);
        add(l2);
        add(t1);
        add(l3);
        add(t3);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b) {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(" "+(n1+n2));
        }
    }
}
