import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        /*
        double pi = 3.14, r, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r = input.nextDouble();

        result = pi * (r * r);
        System.out.println(result);
         */
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı girmek istersiniz: ");
        int girilecekSayi = input.nextInt();
        int toplam = 0;

        for(int i = 1; i <= girilecekSayi; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            toplam += sayi;
        }

        int result = toplam / 5;
        System.out.println(result);
       */

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        for(int i = 2; i <=sayi; i++) {
            boolean asal = true;
            for(int j=2; j<i; j++) {
                if(i%j==0) {
                    asal = false;
                    break;
                }
            }
            if(asal) {
                System.out.println(i);
            }
            asal = true;
        }
        */
        /*
        int saniye, dakika;
        Scanner input = new Scanner(System.in);
        System.out.print("Saniye giriniz: ");
        saniye = input.nextInt();

        dakika = saniye/60;
        int kalan = saniye % 60;
        System.out.println(dakika + " dakika " + kalan + " saniye");

        */

        Scanner input = new Scanner(System.in);
        double faiz = 0.2;
        System.out.println("Faiz oranı " + faiz);

        System.out.print("Kaç yıl ödemek istersiniz? ");
        int year = input.nextInt();

        System.out.print("Ne kadar miktar kredi çekiceksiniz: ");
        int amount = input.nextInt();

        double monthlyPayment = (amount * faiz) / (1 - (1 / (1 + faiz)));
        System.out.println(monthlyPayment);

    }
}
