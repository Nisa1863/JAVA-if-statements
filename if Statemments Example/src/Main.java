//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
    System.out.println("bir sayi giriniz");
    int x =new Scanner(System.in).nextInt();
    if (x <0 ){
        System.out.println( x*x);
        } burada eger sayimiz negatif ise
        o zaman negatif sayinin karesini al
        yani kendisini iki kez carp anlaminda x*x xin
        karesi olur

         */
        //ik sayinin buyuk kusucukluk karsilastirmasini yapalim//

        System.out.println("1.sayi:");
        System.out.println("2.sayi:");
        int sayi1 =new Scanner(System.in).nextInt();
        float sayi2 =new Scanner(System.in).nextFloat();

        if (sayi1> sayi2){
            System.out.println("1. sayi 2. sayidan daha 0buyuk");
            System.out.println("GUNAYDIN CANIMMMM25");
        } else if (sayi2 >sayi1) {
            System.out.println("2.sayi 1.sayidan daha buyuk");

        }else {
            System.out.println("sayilar birbirine esittir");
        }

    }
    /*burada sayimizin buyukluk kucukluk ve esitlik durumuna
    baktik ilk sayi girmesini soyledik daha sonra ekrandan cikti
    yani kullanicidan cikti alabilmek icin scanner la hangi
    degiskenle yaotigimiza bagli tanimladik ve daha sonra
    if dongusu acarak buyukluk kucukluk olanaklarina baktik
     */
}
