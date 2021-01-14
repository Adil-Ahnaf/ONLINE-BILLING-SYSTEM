package test;

import BillManager.FileCreator;

import java.awt.*;
import javax.swing.*;

public class test {
    test() {
        JFrame f = new JFrame("Panel test.Example");
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);

        JButton b1 = new JButton("Button 1");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button 2");
        b2.setBounds(100, 100, 80, 30);
        b2.setBackground(Color.green);
        JPanel p1 = new JPanel();
        p1.setBounds(250, 300, 50, 50);
        p1.setBackground(Color.green);

        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.add(p1);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        //new test();
     /*   FileCreator.saveCurrentReceiptNo("1020");
String order_No=FileCreator.getLastSavedReceiptNo();

        System.out.println( String.format("%05d",Integer.parseInt(order_No)));
*/

        double netVat;
        double subTotal_bill = 410;
        double vat_ = 15;

        netVat = subTotal_bill * vat_ / 100;
        System.out.println(netVat);
    }
}