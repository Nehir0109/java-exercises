import java.util.Scanner;
// HESAP MAKİNESİ
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        double birinciSayi = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin: (+ , - , x , / ) ");
        char secilenİslem= scanner.next().charAt(0);

        System.out.println("İkinci sayıyı giriniz: ");
        double ikinciSayi = scanner.nextDouble();



        double sonuc = 0.0;

        switch(secilenİslem) {
            case '+': sonuc= birinciSayi + ikinciSayi; break;
            case '-': sonuc= birinciSayi - ikinciSayi; break;
            case 'x': sonuc= birinciSayi * ikinciSayi; break;
            case '/': sonuc= birinciSayi / ikinciSayi;
        }

        System.out.printf("Sonuç= %f", sonuc);

        }
    }
