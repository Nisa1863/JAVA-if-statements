//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         /* if donguleri onemli cunku bellirli kosullara
         gore karar verebilecek programlar olusturmamiza
         olanak saglar
          */
        //bir sicaklik ayarlayalim//
        int temp = 32;
        if (temp > 30) {
            System.out.println("it's a hot ");
            System.out.println("Drink water");
        }
        else if (temp > 20 && temp <= 30) {
                System.out.println("It's beautiful day");

        } else {
            System.out.println("it's a cold");
            System.out.println("Drinks caffe");
        }
        /*else if ten sonra suslu parantezlerimizi silip
        calistirabiliriz suslu parantezler gereksiz
        ama if de actigimiz parantezi kapatmamiz gerekli
        cunku islem ilk basta if dongusune girip
        girilmedigini kontrol eder eger girmediyse o degere
        esit degilse sonra else if e doner  else if den sonra da
        tek yer kalir o da else dir
         */
    }
}
// Bence onemli bir yontem//
       /*if else olayinda kolay bir yontem bulunmakta (? :)
        satirlarca kod yazmak yerine tek kodda da halledebiliriz
        mesela notumz var grcip gecmeye bakacagiz
            if (Nt >= 50) System.out.println(" gectiniz ");
            else Sytem.out.println ("kaldiniz"); yerine uzun uzun yazamaktan ise

            System.out.println(Nt >=50 ? "gectiniz" : "kaldiniz"); sadece bu kadar
                soru isareti ve iki noktayi kullandik
        */