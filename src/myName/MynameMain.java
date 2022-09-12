//Write an app that displays a frame containing two tables that
//display your name, one for your first name and one for your last.


package myName;
import  java.awt.*;
import  javax.swing.*;

public class MynameMain {
    public static void main(String[] args) {

        JFrame frame= new JFrame("My name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1=new JLabel("Halil");
        JLabel label2=new JLabel("Future Creater");

        //panel inside the frame
        JPanel panel=new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(800,600));
        panel.add(label1);
        panel.add(label2);

        //display everything in frame
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);




    }
}
