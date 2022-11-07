package BootcampWeek1;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,9,8,6,7,6,81,4,6,15};

        Scanner sayi = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = sayi.nextInt();
        boolean varmı = false ;

        for (int sayı : numbers) {
            if (sayı == number) {
                varmı = true;
                break;

            }
        }
        if (varmı)
        {
            System.out.println(number + "sayı dizede var");
        }
        else
        {
            System.out.println(number + "sayı dize içerisinde yok ");
        }


    }
}
