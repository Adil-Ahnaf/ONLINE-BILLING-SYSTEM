package test;

import java.util.Scanner;

/**
 * Created by Ahnaf on 4/7/2017.
 */
public class Simple {
    public static void main(String[] args) {
        String input;
        Scanner sc=new Scanner(System.in);
        int i=0;
        boolean sucess=false;

        while (sucess!=true)
            try {
                System.out.println("please inter");
                input = sc.nextLine();
                i = Integer.parseInt(input);
                System.out.println("result:" + input);
                sucess = true;

            }

            catch (NumberFormatException e){
                System.out.println("Invalid input");
        }
    }
}
