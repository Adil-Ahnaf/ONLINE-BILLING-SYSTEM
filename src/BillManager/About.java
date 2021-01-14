package BillManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ahnaf on 4/16/2017.
 */
public class About extends JFrame{
    Color color1 = new Color(0, 51, 51);
    Color color2 = new Color(255, 153, 102);
    public About(){
        super("About");
        Font font=new Font(null,Font.ITALIC,15);
        JLabel l1=new JLabel("Object Oriented Programing Lab ");
        JLabel l2=new JLabel("Project name: Billing System");
        JLabel l3=new JLabel("Developed By:");
        JLabel l4=new JLabel("1.Adil Ahnaf");
        JLabel l5=new JLabel("2.Rakibul Hasan");

        l1.setBounds(30,50,250,50);
        l1.setFont(font);
        l2.setBounds(30,90,250,30);
        l2.setFont(font);
        l3.setBounds(30,120,100,30);
        l3.setFont(font);
        l4.setBounds(80,140,200,30);
        l4.setFont(font);
        l5.setBounds(80,170,200,30);
        l5.setFont(font);





        this.getContentPane().setBackground(color1);
        l1.setForeground(color2);
        l2.setForeground(color2);
        l3.setForeground(color2);
        l4.setForeground(color2);
        l5.setForeground(color2);



        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        setLayout(null);
        setSize(350,300);
        setLocation(993,430);//opens Window center of the screen
        setResizable(false);
        setAlwaysOnTop(true);
        setVisible(true);

    }

   /* public static void main(String[] args) {
        new About();
    }*/
}
