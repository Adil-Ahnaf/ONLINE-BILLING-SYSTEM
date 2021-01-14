package test;


import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class Backround extends JFrame {
    int i,x;
    String num;
    public Backround() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        JMenu home=new JMenu("Home");
        JMenu menu=new JMenu("BillManager.Menu");
        JMenu about=new JMenu("BillManager.About");

        JTextField f1=new JTextField();
        f1.setText("0");
        f1.setBounds(10,20,30,50);

        menu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });



        menuBar.add(home);
        menuBar.add(menu);
        menuBar.add(about);
        add(f1);
        setSize(300,300);
        setVisible(true);

    }



    public static void main(String args[])
    {
        new Backround();

    }
}
