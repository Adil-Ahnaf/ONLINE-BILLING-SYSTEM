package test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Ahnaf on 4/18/2017.
 */
public class LearnFile {
    public static void main(String[] args) {

        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();

        String location="C:\\Users\\Ahnaf\\Downloads\\save\\"+name+".txt";

        File file=new File(location);
                try {
                    PrintWriter output=new PrintWriter(file);
                    output.println("hello");
                    output.println("java");
                    output.close();
                }
                catch (IOException e1){
                    System.out.println("error");
                }
    }
}
