package test;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Ahnaf on 4/18/2017.
 */
public class FileCreatorBackup {
/*

    //............. Receipt Number Saving in File .........................................

    static String fileNameOfReceiptNo = "Saved_Receipt_No.txt";
    public static void saveCurrentReceiptNo(String id) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(fileNameOfReceiptNo);
            pw.print(id);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            pw.close();
        }
    }

    public static String getLastSavedReceiptNo() {
        String id = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileNameOfReceiptNo);
            br = new BufferedReader(fr);
            id = br.readLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return id;
    }






    //====================== Methods  =================
    public boolean GetReceiptFromFile(String fileName) {

        fileName = fileLocation + fileName + ".txt";
        String data;
        FileReader fr = null;
        BufferedReader br = null;
        boolean success = true;
        try {
            fr = new FileReader(fileName);//(fileLocation + fileName);
            br = new BufferedReader(fr);

            id_r = br.readLine();
            jobRef = br.readLine();;
            cusName = br.readLine();;
            address = br.readLine();;
            phone = br.readLine();;

            for (int i = 0; i < 5; i++) {
                prdtQuant[i] = Double.parseDouble(br.readLine());
            }

            discount = Double.parseDouble(br.readLine());
            subTotal = Double.parseDouble(br.readLine());;
            vat = Double.parseDouble(br.readLine());;
            total = Double.parseDouble(br.readLine());;

        } catch (Exception e) {
            success = false;
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return success;
    }

    public boolean SetReceiptToFile(String fileName) {
        fileName = fileLocation + fileName + ".txt";
        String data;
        PrintWriter pw = null;

        boolean success = true;
        try {

            pw = new PrintWriter(fileName);

            pw.println(id_r);
            pw.println(jobRef);
            pw.println(cusName);
            pw.println(address);
            pw.println(phone);

            for (int i = 0; i < 5; i++) {
                pw.println(Double.toString(prdtQuant[i]));
            }
            pw.println(Double.toString(discount));
            pw.println(Double.toString(subTotal));
            pw.println(Double.toString(vat));
            pw.println(Double.toString(total));

        } catch (Exception e) {
            success = false;
            e.printStackTrace();
        } finally {
            try {
                pw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return success;
    }


    //========= Constructors & To String ==============
    public FileCreatorBackup() {
    }

    public FileCreatorBackup(String jobRef, String cusName, String address, String phone, double[] prdtQuant, double discount, double subTotal, double vat, double total, String id_r) {
        this.jobRef = jobRef;
        this.cusName = cusName;
        this.address = address;
        this.phone = phone;
        this.prdtQuant = prdtQuant;
        this.discount = discount;
        this.subTotal = subTotal;
        this.vat = vat;
        this.total = total;
        this.id_r = id_r;
    }

    @Override
    public String toString() {
        return "Receipt Info\n"
                + "--------------\n"
                + "\nid_r=" + id_r
                + "\njobRef=" + jobRef + ", "
                + "\ncusNameF=" + cusName + ", "
                + "\naddress=" + address + ","
                + "\nphone=" + phone + ", "
                + "\nprdtQuant=" + Arrays.toString(prdtQuant) + ","
                + "\ndiscount=" + discount + ", "
                + "\nsubTotal=" + subTotal + ", "
                + "\nvat=" + vat + ", "
                + "\ntotal=" + total + ", " + "\n";
    }



    //=============== Receipt Variables =================
    String jobRef;
    String cusName;
    String address;
    String phone;

    double[] prdtQuant = new double[5];
    double discount;
    double subTotal;
    double vat;
    double total;

    //=============== Extra Variables =================
    String id_r;
    String fileLocation = "data/";


*/
}
