package BootcampWeek1;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int toplam = 0 ;
        int sayı ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        sayı = sc.nextInt();

        for (int i = 1; i < sayı; i++) {

            if (sayı%i==0)
            {
                toplam +=i;
            }

        }
        if (toplam==sayı)
        {
            System.out.println(sayı + "Mukemmel sayıdır");
        }
        else
        {
            System.out.println(sayı + "Mukemmel bir sayı değil");
        }

    }
}
