package BootcampWeek1;

import java.io.PrintStream;
import java.util.Scanner;

public class AsalSayiMı {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true ; // asal oldugunu kabul ettim .

        if (number==1)
        {
            System.out.println("Gecersiz sayı");
            return;
        }

        for (int i = 2; i <number ; i++) {
            if (number==2)
            {
                isPrime=true;
            }

            if (number != 2 && number % i ==0)
            {
                isPrime=false;
            }
        }
        if (isPrime)
        {
            System.out.println(number + " Sayı asaldır");
        }
        else
        {
            System.out.println(number + "sayı asal değildir ");
        }


    }


}
