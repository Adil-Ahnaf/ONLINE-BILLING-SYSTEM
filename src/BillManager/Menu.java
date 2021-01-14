package BillManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ahnaf on 4/16/2017.
 */
public class Menu extends JFrame {
    Color color1 = new Color(0, 51, 51);
    Color color2 = new Color(204, 255, 255);
    public Menu(){
        super("MENU CARD");
        Font font=new Font(null,Font.ITALIC,30);
        Font font1=new Font(null,Font.HANGING_BASELINE,15);


        JLabel l1=new JLabel("Menu Card");
        l1.setFont(font);
        l1.setBounds(80,10,200,40);
        JLabel l2=new JLabel("Chicken Burger");
        JLabel l3=new JLabel("Biff Burger");
        JLabel l4=new JLabel("Pizza");
        JLabel l5=new JLabel("Pasta");
        JLabel l6=new JLabel("Hot Dog");
        JLabel l7=new JLabel("TK.100");
        JLabel l8=new JLabel("TK.70");
        JLabel l9=new JLabel("TK.110");
        JLabel l10=new JLabel("TK.80");
        JLabel l11=new JLabel("TK.50");



        l2.setBounds(20,70,200,25);
        l2.setFont(font1);
        l3.setBounds(20,100,200,25);
        l3.setFont(font1);
        l4.setBounds(20,130,200,25);
        l4.setFont(font1);
        l5.setBounds(20,160,200,25);
        l5.setFont(font1);
        l6.setBounds(20,190,200,25);
        l6.setFont(font1);
        l7.setBounds(230,70,50,25);
        l7.setFont(font1);
        l8.setBounds(230,100,50,25);
        l8.setFont(font1);
        l9.setBounds(230,130,50,25);
        l9.setFont(font1);
        l10.setBounds(230,160,50,25);
        l10.setFont(font1);
        l11.setBounds(230,190,50,25);
        l11.setFont(font1);



        this.getContentPane().setBackground(color1);
        l1.setForeground(color2);
        l2.setForeground(color2);
        l3.setForeground(color2);
        l4.setForeground(color2);
        l5.setForeground(color2);
        l6.setForeground(color2);
        l7.setForeground(color2);
        l8.setForeground(color2);
        l9.setForeground(color2);
        l10.setForeground(color2);
        l11.setForeground(color2);


        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        setLayout(null);
        setSize(350,400);
        setLocation(993,20);
        setResizable(false);
        setAlwaysOnTop(true);
        setVisible(true);
    }

   /* public static void main(String[] args) {
        new Menu();
    }*/
}
