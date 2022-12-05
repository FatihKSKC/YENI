package proje02kimlik;

import java.util.Scanner;

import static proje02kimlik.Kullanici.getInfo;
import static proje02kimlik.Kullanici.saveInfo;

public class Kimlik_Anasayfa {

    static Scanner scan = new Scanner(System.in);

    public static void kimlikAnasayfa() throws InterruptedException {
        System.out.println("--------------Kimlik Anasayfamiza hosgeldindiniz-----------------");
        System.out.println("Lutfen yapacaginiz islemi seciniz");
        System.out.println(
                "1: Kimlik kayit\n"+
                "2: Kimlik sorgu icin \n"+
                "3: Kimlik Bilgilerini Silme icin\n"+
                "4: Cikis");

        int secim= scan.nextInt();

        switch (secim){
            case 1:

                saveInfo();
                break;
            case 2:
                getInfo();
                break;



        }

    }
}
