import java.util.Scanner;
// HESAP MAKİNESİ
/*public class Main {
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
    }*/

// Çift veya tek kontrolü:
/*public class Main {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        Integer sayi= get.nextInt();

        if(sayi % 2 ==0){
            System.out.println("Çift sayı");
        } else if (sayi % 2 == 1 || sayi % 2 == -1){
            System.out.println("Tek sayı");
        }
    }
*/

// Basit Faiz Hesaplayıcı:

public class Main {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.println("Ana para miktarını giriniz: ");
        Double para = get.nextDouble();

        System.out.println("Faiz oranını giriniz: ");
        Double faiz= get.nextDouble();

        System.out.println("Süre giriniz(Ay): ");
        Double sure= get.nextDouble();

        double sonuc = (para/100)* (faiz/12)* sure;

        System.out.printf("Sonuç: %f", sonuc);


    }
}