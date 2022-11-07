package BootcampWeek1;

import java.util.Scanner;

public class KalinSesliInceSesli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String s = String.valueOf(sc.next().toLowerCase());

            switch (s) {
                case "a":
                    System.out.println("sesli harf");
                    break;
                case "e":
                    System.out.println("sesli harf");
                    break;
                case "o":
                    System.out.println("sesli harf");
                    break;
                case "ö":
                    System.out.println("sesli harf");
                    break;
                case "u":
                    System.out.println("sesli harf");
                    break;
                case "ü":
                    System.out.println("sesli harf");
                    break;
                case "ı":
                    System.out.println("sesli harf");
                    break;
                case "i":
                    System.out.println("sesli harf");
                    break;

                default:
                    System.out.println(s + "harfi seessiz harfdir");
            }


    }

}
