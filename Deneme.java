import java.util.Scanner;//scanner kütüphanesi ekledik.
public class Deneme {
    public static void main(String[] args) {

        int mat, fizik, kimya,turkce, tarih, muzik;

        Scanner open=new Scanner(System.in); //scanneri aktifleştirdik.

        System.out.println("matematik notunuzu giriniz.");
        mat= open.nextInt();

        System.out.println("fizik notunuzu giriniz.");
        fizik=open.nextInt();

        System.out.println("kimya notunuzu giriniz.");
        kimya=open.nextInt();

        System.out.println("turkce notunuzu giriniz.");
        turkce=open.nextInt();

        System.out.println("tarih notunuzu giriniz.");
        tarih=open.nextInt();

        System.out.println("muzik notunuzu giriniz.");
        muzik=open.nextInt();

        double ort=(mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("ortalama notunuz:" +ort);

        String sonuc= ort>60? "geçtiniz": "kaldınız";

        System.out.println("durum: " +sonuc);
    }
}
