package BillManager; /**
 * Created by Ahnaf on 3/28/2017.
 */

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BillManager extends JFrame {

    //...........variable Declearation......//

    String order_No_Current;
    String order_No_lastSaved;
    String cusName;
    String cus_address;
    String phone;

    double[] food_arr = new double[5];

    double chicken_burger;
    double biff_burger;
    double pizza_;
    double pasta_;
    double hot_dog;

    int vat_ = 10;
    int discount_ = 15;
    double netVat;
    double netDiscount = 0;
    double subTotal_bill;
    double total_bill;

    //money conversion rate of every country money//
    double australianDollar = 0.016330;
    double brazillianReal = 0.039100;
    double euro = 0.011570;
    double indianRupee = 0.81631;
    double united_statesDollar = 0.012470;


    double pre_sellprice =0;
    double billsellprice;
    int totalOrder;
    int jan_order,feb_Order,march_Order,april_Order,may_Order,jun_Order;



    //---------------Variable for Item Quentity---------------//

    int  quentity;
    String str_quentity;



    public BillManager() {
        super("Billing System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //..................set backroung color.............//

        Color color1 = new Color(0, 51, 51);
        Color color2 = new Color(255, 255, 255);


        JPanel p1 = new JPanel(); //Creat a panel//
        p1.setBackground(color1);

        p1.setLayout(null);
        Font font = new Font(null, Font.ITALIC, 25);
        Font font1 = new Font(null, Font.BOLD, 20);
        Font font2 = new Font(null, Font.ITALIC, 15);


        //..................BillManager.Menu bar.............//
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu home = new JMenu("Home");
        JMenu menu = new JMenu("Menu");
        JMenu about = new JMenu("About");
        JMenuItem save = new JMenuItem("Save Order");

        JLabel l1 = new JLabel("Date:");
        l1.setFont(font);
        l1.setForeground(color2);
        l1.setBounds(10, 10, 60, 20);

        JLabel l2 = new JLabel("Time:");
        l2.setFont(font);
        l2.setForeground(color2);
        l2.setBounds(380, 10, 80, 20);

        JLabel time = new JLabel();
        time.setFont(font);
        time.setForeground(color2);
        time.setBounds(450, 10, 140, 25);

        JLabel date = new JLabel();
        date.setFont(font);
        date.setForeground(color2);
        date.setBounds(75, 10, 140, 25);


        JLabel orderNo = new JLabel("Order No: ");
        JLabel name = new JLabel("Customer Name:");
        JLabel address = new JLabel("Address:");
        JLabel number = new JLabel("Contact Number:");
        JLabel order = new JLabel("Customer Order:");
        JLabel chickenBurger = new JLabel("Chicken Burger:");
        JLabel biffBurger = new JLabel("Biff Burger");
        JLabel pizza = new JLabel("Pizza");
        JLabel pasta = new JLabel("Pasta");
        JLabel hotDog = new JLabel("Hot Dog");
        JLabel discount = new JLabel("Discount:");
        JLabel vat = new JLabel("Vat");
        JLabel subTotal = new JLabel("Sub Total");
        JLabel total = new JLabel("Total");
        JLabel converter = new JLabel("Converter:");


        orderNo.setFont(font2);
        orderNo.setForeground(color2);
        orderNo.setBounds(10, 50, 100, 20);
        name.setFont(font2);
        name.setForeground(color2);
        name.setBounds(10, 80, 150, 20);
        address.setFont(font2);
        address.setForeground(color2);
        address.setBounds(10, 110, 100, 20);
        number.setFont(font2);
        number.setForeground(color2);
        number.setBounds(10, 140, 150, 20);
        order.setFont(font1);
        order.setForeground(color2);
        order.setBounds(10, 170, 200, 20);
        chickenBurger.setFont(font2);
        chickenBurger.setForeground(color2);
        chickenBurger.setBounds(10, 200, 150, 20);
        biffBurger.setFont(font2);
        biffBurger.setForeground(color2);
        biffBurger.setBounds(10, 230, 150, 20);
        pizza.setFont(font2);
        pizza.setForeground(color2);
        pizza.setBounds(10, 260, 100, 20);
        pasta.setFont(font2);
        pasta.setForeground(color2);
        pasta.setBounds(10, 290, 100, 20);
        hotDog.setFont(font2);
        hotDog.setForeground(color2);
        hotDog.setBounds(10, 320, 100, 20);
        discount.setFont(font2);
        discount.setForeground(color2);
        discount.setBounds(350, 230, 100, 20);
        vat.setFont(font2);
        vat.setForeground(color2);
        vat.setBounds(350, 260, 100, 20);
        subTotal.setFont(font2);
        subTotal.setForeground(color2);
        subTotal.setBounds(350, 290, 100, 20);
        total.setFont(font2);
        total.setForeground(color2);
        total.setBounds(350, 320, 100, 20);
        converter.setFont(font1);
        converter.setForeground(color2);
        converter.setBounds(10, 380, 150, 30);


        //.........Set text field..................//
        JLabel f1 = new JLabel();
        f1.setForeground(color2);
        f1.setBounds(160, 50, 100, 20);
        JTextField f2 = new JTextField();
        f2.setBounds(160, 80, 150, 20);
        JTextField f3 = new JTextField();
        f3.setBounds(160, 110, 300, 20);
        JTextField f4 = new JTextField();
        f4.setBounds(160, 140, 150, 20);
        JTextField f5 = new JTextField("0");
        f5.setBounds(160, 200, 50, 20);
        JTextField f6 = new JTextField("0");
        f6.setBounds(160, 230, 50, 20);
        JTextField f7 = new JTextField("0");
        f7.setBounds(160, 260, 50, 20);
        JTextField f8 = new JTextField("0");
        f8.setBounds(160, 290, 50, 20);
        JTextField f9 = new JTextField("0");
        f9.setBounds(160, 320, 50, 20);
        JTextField f10 = new JTextField();
        f10.setBounds(460, 230, 100, 20);
        f10.setEditable(false);
        JTextField f11 = new JTextField();
        f11.setBounds(460, 260, 100, 20);
        f11.setEditable(false);
        JTextField f12 = new JTextField();
        f12.setBounds(460, 290, 100, 20);
        f12.setEditable(false);
        JTextField f13 = new JTextField();
        f13.setBounds(460, 320, 100, 20);
        f13.setEditable(false);
        JTextField f14 = new JTextField();
        f14.setBounds(140, 420, 100, 20);
        JTextField f15 = new JTextField();
        f15.setBounds(140, 470, 100, 20);
        f15.setEditable(false);


        //........Set a Check box.......//
        JCheckBox box1 = new JCheckBox("Discount");
        box1.setFont(font1);
        box1.setBounds(350, 200, 130, 20);


        //...........Set Date And Time..........//
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        date.setText(s.format(d));

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
                time.setText(s.format(d));
            }
        }).start();


        //.............Set button...........//
        JButton totalButton = new JButton("Total");
        totalButton.setFont(font1);
        totalButton.setBounds(350, 380, 100, 30);
        JButton reset = new JButton("Reset");
        reset.setFont(font1);
        reset.setBounds(460, 380, 100, 30);
        JButton calculator = new JButton("Calculator");
        calculator.setFont(font);
        calculator.setBounds(380, 450, 150, 30);




        //---------------------Set Item Quentity---------------------------//
        f5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int key = e.getKeyCode();
                if (f5.getText().isEmpty()){
                    f5.setText("0");
                }
                quentity=Integer.parseInt(f5.getText());
                if (key == KeyEvent.VK_UP) {
                    quentity++;
                } else if (key == KeyEvent.VK_DOWN) {
                    quentity--;
                }

                str_quentity=Integer.toString(quentity);
                f5.setText(str_quentity);
            }
        });

        f6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int key = e.getKeyCode();
                if (f6.getText().isEmpty()){
                    f6.setText("0");
                }
                quentity=Integer.parseInt(f6.getText());
                if (key == KeyEvent.VK_UP) {
                    quentity++;
                } else if (key == KeyEvent.VK_DOWN) {
                    quentity--;
                }

                str_quentity=Integer.toString(quentity);
                f6.setText(str_quentity);
            }
        });

        f7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int key = e.getKeyCode();
                if (f7.getText().isEmpty()){
                    f7.setText("0");
                }
                quentity=Integer.parseInt(f7.getText());
                if (key == KeyEvent.VK_UP) {
                    quentity++;
                } else if (key == KeyEvent.VK_DOWN) {
                    quentity--;
                }

                str_quentity=Integer.toString(quentity);
                f7.setText(str_quentity);
            }
        });

        f8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int key = e.getKeyCode();
                if (f8.getText().isEmpty()){
                    f8.setText("0");
                }
                quentity=Integer.parseInt(f8.getText());
                if (key == KeyEvent.VK_UP) {
                    quentity++;
                } else if (key == KeyEvent.VK_DOWN) {
                    quentity--;
                }

                str_quentity=Integer.toString(quentity);
                f8.setText(str_quentity);
            }
        });

        f9.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int key = e.getKeyCode();
                if (f9.getText().isEmpty()){
                    f9.setText("0");
                }
                quentity=Integer.parseInt(f9.getText());
                if (key == KeyEvent.VK_UP) {
                    quentity++;
                } else if (key == KeyEvent.VK_DOWN) {
                    quentity--;
                }

                str_quentity=Integer.toString(quentity);
                f9.setText(str_quentity);
            }
        });




        //............Set Action for BillManager.Calculator Button.........//
        calculator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Calculator();
            }
        });

        //............Set a converter................//

        JButton convert = new JButton("Convert");
        convert.setFont(font1);
        convert.setBounds(10, 465, 120, 30);


        //...............Set Action For Total Button.............//

        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String take;
                int receive1;

                order_No_lastSaved = FileCreator.getLastSavedReceiptNo();/**read last saved order no from file named "Saved_Receipt_No.txt"*/

                order_No_Current = Integer.toString(Integer.parseInt(order_No_lastSaved) + 1);/**this is current order no(NewOrder).So, NewOrder = oldOrder +1 */

                String orderRef = String.format("%05d", Integer.parseInt(order_No_Current));
                f1.setText(orderRef);

                //FileCreator.saveCurrentReceiptNo(order_No_Current);


                try {
                    //........Including all food prize in total......//
                    chicken_burger = Double.parseDouble(f5.getText());
                    biff_burger = Double.parseDouble(f6.getText());
                    pizza_ = Double.parseDouble(f7.getText());
                    pasta_ = Double.parseDouble(f8.getText());
                    hot_dog = Double.parseDouble(f9.getText());

                } catch (NumberFormatException e1) {
                    if (f5.getText().isEmpty()) {
                        f5.setText("missing");
                        f5.setForeground(Color.red);
                    }
                    if (f6.getText().isEmpty()) {
                        f6.setText("missing");
                        f6.setForeground(Color.red);
                    }
                    if (f7.getText().isEmpty()) {
                        f7.setText("missing");
                        f7.setForeground(Color.red);
                    }
                    if (f8.getText().isEmpty()) {
                        f8.setText("missing");
                        f8.setForeground(Color.red);
                    }

                    if (f9.getText().isEmpty()) {
                        f9.setText("missing");
                        f9.setForeground(Color.red);
                    }

                }


                //.........Implements all Food items prize
                food_arr[0] = 100 * chicken_burger;
                food_arr[1] = 70 * biff_burger;
                food_arr[2] = 110 * pizza_;
                food_arr[3] = 50 * hot_dog;
                food_arr[4] = 80 * pasta_;


                // ..........Exception Handaling for first 4 filed...........//

                try {

                    if (f2.getText().isEmpty() || f3.getText().isEmpty() || f4.getText().isEmpty()) {

                        throw new Exception();
                    }

                    if (f2.getText() != null) {
                        take = f2.getText();
                        try {
                            for (int i = 0; i < take.length(); i++) {
                                if (take.charAt(i) == '1' || take.charAt(i) == '2' || take.charAt(i) == '3' || take.charAt(i) == '4'
                                        || take.charAt(i) == '5' || take.charAt(i) == '6' || take.charAt(i) == '7' || take.charAt(i) == '8'
                                        || take.charAt(i) == '9' || take.charAt(i) == '0') {

                                    throw new Exception();
                                }
                            }
                        } catch (Exception e1) {
                            f2.setText("Invalid Input");
                            f2.setForeground(Color.red);
                        }
                    }

                    if (f4.getText() != null) {
                        try {
                            receive1 = Integer.parseInt(f4.getText());

                            if (box1.isSelected()) {
                                subTotal_bill = food_arr[0] + food_arr[1] + food_arr[2] + food_arr[3] + food_arr[4];
                                netDiscount =  subTotal_bill * discount_ / 100;
                                netVat = (subTotal_bill-netDiscount) * vat_ / 100;
                                total_bill = subTotal_bill-netDiscount+netVat;

                                f12.setText(String.format(" % .2f", subTotal_bill));
                                f11.setText(String.format(" % .2f", netVat));
                                f10.setText(String.format(" % .2f", netDiscount));
                                f13.setText(String.format(" % .2f", total_bill));
                            } else {
                                subTotal_bill = food_arr[0] + food_arr[1] + food_arr[2] + food_arr[3] + food_arr[4];
                                netDiscount =  0;
                                netVat = (subTotal_bill-netDiscount) * vat_ / 100;
                                total_bill = subTotal_bill-netDiscount+netVat;

                                f12.setText(String.format(" % .2f", subTotal_bill));
                                f11.setText(String.format(" % .2f", netVat));
                                f10.setText(String.format(" % .2f", netDiscount));
                                f13.setText(String.format(" % .2f", total_bill));
                            }


                        } catch (NumberFormatException e1) {
                            f4.setText("Charter is't valid");
                            f4.setForeground(Color.red);

                        }
                    }
                } catch (Exception e1) {
                    if (f2.getText().isEmpty()) {
                        f2.setText("Input Missing");
                        f2.setForeground(Color.red);
                    }
                    if (f3.getText().isEmpty()) {
                        f3.setText("Input Missing");
                        f3.setForeground(Color.red);
                    }
                    if (f4.getText().isEmpty()) {
                        f4.setText("Input Missing");
                        f4.setForeground(Color.red);
                    }
                }


                f2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f2.setText("");
                        f2.setForeground(Color.black);
                    }
                });
                f3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f3.setText("");
                        f3.setForeground(Color.black);
                    }
                });
                f4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f4.setText("");
                        f4.setForeground(Color.black);
                    }
                });
                f5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f5.setText("");
                        f5.setForeground(Color.black);
                    }
                });
                f6.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f6.setText("");
                        f6.setForeground(Color.black);
                    }
                });
                f7.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f7.setText("");
                        f7.setForeground(Color.black);
                    }
                });
                f8.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f8.setText("");
                        f8.setForeground(Color.black);
                    }
                });
                f9.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f9.setText("");
                        f9.setForeground(Color.black);
                    }
                });


                //..................set Action for reset Buttion.........//
                reset.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f1.setText(null);
                        f2.setText(null);
                        f3.setText(null);
                        f4.setText(null);
                        f5.setText("0");
                        f6.setText("0");
                        f7.setText("0");
                        f8.setText("0");
                        f9.setText("0");
                        f10.setText(null);
                        f11.setText(null);
                        f12.setText(null);
                        f13.setText(null);
                        f14.setText(null);
                        f15.setText(null);


                    }
                });


            }
        });


        //............Set combobox...........//
        String country[] = {"Choose One", "Australia", "Brazil", "Euro", "India", "United States",};
        JComboBox cb1 = new JComboBox(country);

        cb1.setBounds(10, 420, 120, 25);


        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                try {
                    double bangladeshTaka = Double.parseDouble(f14.getText());

                    if (f14.getText().isEmpty() || cb1.getSelectedItem().equals("Choose One")) {
                        throw new NumberFormatException();
                    }


                    if (cb1.getSelectedItem().equals("Australia")) {
                        String convert1 = String.format("AUD=%.2f", bangladeshTaka * australianDollar);
                        f15.setText(convert1);
                    }

                    if (cb1.getSelectedItem().equals("Brazil")) {
                        String convert2 = String.format("BRL=%.2f", bangladeshTaka * brazillianReal);
                        f15.setText(convert2);
                    }

                    if (cb1.getSelectedItem().equals("Euro")) {
                        String convert3 = String.format("EUR=%.2f", bangladeshTaka * euro);
                        f15.setText(convert3);
                    }

                    if (cb1.getSelectedItem().equals("India")) {
                        String convert4 = String.format("RS=%.2f", bangladeshTaka * indianRupee);
                        f15.setText(convert4);
                    }

                    if (cb1.getSelectedItem().equals("United States")) {
                        String convert6 = String.format("USD=%.2f", bangladeshTaka * united_statesDollar);
                        f15.setText(convert6);
                    }
                } catch (NumberFormatException e1) {
                    if (f14.getText().isEmpty()) {
                        f14.setText("amount missing");
                        f14.setForeground(Color.red);
                    } else if (cb1.getSelectedItem().equals("Choose One")) {
                        f14.setText("Select Country");
                        f14.setForeground(Color.red);
                    } else {
                        f14.setText("Invalid input");
                        f14.setForeground(Color.red);
                    }

                }

                f14.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        f14.setText(null);
                        f14.setForeground(Color.black);
                    }
                });

            }
        });


        // ............add BillManager.Menu Action Listner..........//


        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //jobRef = f1.getText();
               // order_No_Current = Integer.toString(Integer.parseInt(order_No_Current) + 1);
                cusName = f2.getText();
                cus_address = f3.getText();
                phone = f4.getText();

                String filename = date.getText() + "-Id-" + order_No_Current;

                String location = "Bill_Record\\" + filename + ".txt";
                FileOutputStream fs = null;
                PrintWriter output = null;
                try {
                    fs = new FileOutputStream(location);
                    output = new PrintWriter(fs);
                    output.println("Order No:" + order_No_Current);
                    output.println("Customer Name:" + cusName);
                    output.println("Address:" + cus_address);
                    output.println("Phone Number:" + phone);
                    output.println("Subtotal:" + subTotal_bill);
                    output.println("Discount:" + netDiscount);
                    output.println("Vat:" + netVat);
                    output.println("Total:" + total_bill);

                } catch (IOException e1) {
                    System.out.println(e1.getMessage());
                } finally {
                    try {
                        output.close();
                        fs.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }

                FileCreator.saveCurrentReceiptNo(order_No_Current);



                //---------------------Save to report----------------//

                FileOutputStream report=null;
                PrintWriter reportWrite=null;

                String billDate=date.getText();
                String month=billDate.substring(5,7);
                totalOrder=Integer.parseInt(order_No_Current);


                try {

                    if (month.equals("04")){
                        pre_sellprice=Double.parseDouble(f13.getText());


                        File april=new File("Bill_Report\\April Report.txt");
                        BufferedReader read=new BufferedReader(new FileReader(april));


                        int i=0,j=0;
                        april_Order=totalOrder;
                        String temp=read.readLine();
                        System.out.println(temp);
                        while (temp!=null){
                            for (String re:temp.split(" ")){
                                if (i==3){
                                    april_Order=totalOrder;
                                }
                                else {
                                    i++;
                                }
                            }
                            temp=null;
                        }
                        String temp1=read.readLine();
                        while (temp1!=null){

                            for (String re:temp1.split(" ")){
                                if (j==3){
                                    billsellprice=Double.parseDouble(f13.getText());
                                    pre_sellprice=Double.parseDouble(re)+billsellprice;
                                }
                                else {
                                    j++;
                                }
                            }
                            temp1=null;
                        }
                        report=new FileOutputStream("Bill_Report\\April Report.txt");
                        reportWrite=new PrintWriter(report);
                        reportWrite.println("Total Bill Id: "+april_Order);
                        reportWrite.println("Total Selling Price: "+pre_sellprice);
                        reportWrite.close();
                    }
                    if (month.equals("05")){


                        pre_sellprice=Double.parseDouble(f13.getText());


                        File april=new File("Bill_Report\\May Report.txt");
                        BufferedReader read=new BufferedReader(new FileReader(april));


                        int i=0,j=0;
                        april_Order=totalOrder;
                        String temp=read.readLine();
                        System.out.println(temp);
                        while (temp!=null){
                            for (String re:temp.split(" ")){
                                if (i==3){
                                    april_Order=totalOrder;
                                }
                                else {
                                    i++;
                                }
                            }
                            temp=null;
                        }
                        String temp1=read.readLine();
                        while (temp1!=null){

                            for (String re:temp1.split(" ")){
                                if (j==3){
                                    billsellprice=Double.parseDouble(f13.getText());
                                    pre_sellprice=Double.parseDouble(re)+billsellprice;
                                }
                                else {
                                    j++;
                                }
                            }
                            temp1=null;
                        }

                        report=new FileOutputStream("Bill_Report\\May Report.txt");
                        reportWrite=new PrintWriter(report);
                        reportWrite.println();
                        reportWrite.println("Total Bill Id: "+may_Order);
                        reportWrite.println("Total Selling Price: "+pre_sellprice);
                        reportWrite.close();
                    }
                }
                catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        });



        menu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                new Menu();
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });

        about.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                new About();
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });


        //..........Set Component in frame.......//

        home.add(save);
        menuBar.add(home);
        menuBar.add(menu);
        menuBar.add(about);
        p1.add(l1);
        p1.add(date);
        p1.add(l2);
        p1.add(time);
        p1.add(orderNo);
        p1.add(name);
        p1.add(address);
        p1.add(number);
        p1.add(order);
        p1.add(chickenBurger);
        p1.add(biffBurger);
        p1.add(pizza);
        p1.add(pasta);
        p1.add(hotDog);
        p1.add(f1);
        p1.add(f2);
        p1.add(f3);
        p1.add(f4);
        p1.add(f5);
        p1.add(f6);
        p1.add(f7);
        p1.add(f8);
        p1.add(f9);
        p1.add(box1);
        p1.add(discount);
        p1.add(vat);
        p1.add(subTotal);
        p1.add(total);
        p1.add(f10);
        p1.add(f11);
        p1.add(f12);
        p1.add(f13);
        p1.add(totalButton);
        p1.add(reset);
        p1.add(calculator);
        p1.add(converter);
        p1.add(cb1);
        p1.add(f14);
        p1.add(f15);
        p1.add(convert);
        setContentPane(p1);

        //........Set frame Size...........//
        setSize(600, 700);
        setResizable(false);
        setLocationRelativeTo(null);//opens Window center of the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new BillManager();
    }

}
