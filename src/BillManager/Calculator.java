package BillManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ahnaf on 3/31/2017.
 */
public class Calculator extends JFrame{

    double firstNumber;
    double secondNumber;
    double result;
    char operators;
    String answer;
    int index1;
    int index2;
    int start=0;


    public Calculator(){
        super("Calculator");

        Color color=new Color(153,204,153);
        Color color1=new Color(204,255,204);

        Font font1=new Font(null,Font.BOLD,20);

        JPanel p1=new JPanel();
        p1.setBounds(10,10,315,70);
        p1.setBackground(color1);
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        p1.setLayout(null);


        JLabel screen=new JLabel();
        screen.setBounds(8,5,300,30);
        screen.setFont(font1);
        JLabel screen1=new JLabel();
        screen1.setBounds(8,32,300,30);
        screen1.setFont(font1);


        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
        JButton b17;



        GridLayout grid1=new GridLayout(4,4,10,10);
        JPanel p2=new JPanel();
        p2.setBounds(10,100,315,240);
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        p2.setLayout(grid1);
        p2.setBackground(color);


        b1=new JButton("1");
        b1.setFont(font1);
        b2=new JButton("2");
        b2.setFont(font1);
        b3=new JButton("3");
        b3.setFont(font1);
        b4=new JButton("4");
        b4.setFont(font1);
        b5=new JButton("5");
        b5.setFont(font1);
        b6=new JButton("6");
        b6.setFont(font1);
        b7=new JButton("7");
        b7.setFont(font1);
        b8=new JButton("8");
        b8.setFont(font1);
        b9=new JButton("9");
        b9.setFont(font1);
        b10=new JButton("0");
        b10.setFont(font1);
        b11=new JButton("C");
        b11.setFont(font1);
        b12=new JButton(".");
        b12.setFont(font1);
        b13=new JButton("+");
        b13.setFont(font1);
        b14=new JButton("-");
        b14.setFont(font1);
        b15=new JButton("*");
        b15.setFont(font1);
        b16=new JButton("/");
        b16.setFont(font1);


        JPanel p3=new JPanel();
        p3.setBounds(10,342,315,60);
        p3.setBorder(BorderFactory.createLineBorder(Color.black));
        p3.setBackground(color);
        p3.setLayout(null);


        b17=new JButton("=");
        b17.setFont(font1);
        b17.setBounds(82,5,150,50);


        //.................Add Action listner............//
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String enterValue = screen1.getText() + b1.getText();
                screen1.setText(enterValue);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b2.getText();
                screen1.setText(enterValue);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b3.getText();
                screen1.setText(enterValue);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b4.getText();
                screen1.setText(enterValue);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b5.getText();
                screen1.setText(enterValue);
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b6.getText();
                screen1.setText(enterValue);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b7.getText();
                screen1.setText(enterValue);
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b8.getText();
                screen1.setText(enterValue);
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b9.getText();
                screen1.setText(enterValue);
            }
        });

        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b10.getText();
                screen1.setText(enterValue);
            }
        });

        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                screen.setText("");
                screen1.setText("");
            }
        });

        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b12.getText();
                screen1.setText(enterValue);
            }
        });

        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b13.getText();
                screen1.setText(enterValue);
            }
        });

        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b14.getText();
                screen1.setText(enterValue);
            }
        });

        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b15.getText();
                screen1.setText(enterValue);
            }
        });

        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterValue = screen1.getText() + b16.getText();
                screen1.setText(enterValue);
            }
        });

        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // secondNumber = Double.parseDouble(screen.getText());

                String text=screen1.getText();

                for (int i=0;i<text.length();i++){
                    if (text.charAt(i)=='+' || text.charAt(i)=='-' || text.charAt(i)=='*' || text.charAt(i)=='/'){
                        operators=text.charAt(i);
                        index1=i;
                    }
                }
                index2=index1+1;
                try{
                    firstNumber=Double.parseDouble(text.substring(0,index1));
                    secondNumber=Double.parseDouble(text.substring(index2));

                    if (operators=='+') {
                        screen.setText(screen1.getText());
                        result = firstNumber + secondNumber;
                        answer = String.format("%.0f", result);
                        screen1.setText(answer);
                    }
                    if (operators == '-') {
                        screen.setText(screen1.getText());
                        result = firstNumber - secondNumber;
                        answer = String.format("%.0f", result);
                        screen1.setText(answer);
                    }
                    if (operators == '*') {
                        screen.setText(screen1.getText());
                        result = firstNumber * secondNumber;
                        answer = String.format("%.0f", result);
                        screen1.setText(answer);
                    }
                    if (operators == '/') {
                        screen.setText(screen1.getText());
                        result = firstNumber / secondNumber;
                        answer = String.format("%.0f", result);
                        screen1.setText(answer);
                    }
                }
                catch (NumberFormatException e1){
                    screen1.setText("Syntex Error");
                }
            }
        });





        p1.add(screen);
        p1.add(screen1);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p3.add(b17);

        add(p1);
        add(p2);
        add(p3);
        setLayout(null);
        setSize(350,450);
        setResizable(false);
//        setLocationRelativeTo(null);//opens Window center of the screen

        setLocation(10,30);
        setVisible(true);
    }

//       public static void main(String[] args) {
//        new Calculator();
//    }
}
