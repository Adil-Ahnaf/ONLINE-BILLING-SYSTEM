package BillManager;

import java.io.*;

/**
 * Created by Ahnaf on 4/18/2017.
 */
public class FileCreator {

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


}
