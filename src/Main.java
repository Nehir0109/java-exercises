import java.util.Scanner;

// Telefon numarası biçimlendirme:
/*public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("On haneli telefon numaranızı girin: ");
        String telefonNo= get.nextLine();

        if( telefonNo.length() == 10) {
            String yeniNo = "(" + telefonNo.substring(0,3) + ")" + telefonNo.substring(3,6) + "-" + telefonNo.substring(6,10);
            System.out.println("Biçimlendirilmiş no: "+ yeniNo);
        }else {
            System.out.println("Hata! Lüten 10 haneli bir telefon numarası girin.");
        }

    }
}*/

//Tarih biçimlendirme:
public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.println("Lütfen bir tarih girin (YYYY-AA-GG): ");
        String tarih =  get.nextLine();

        int yil = Integer.parseInt(tarih.substring(0, 4));
        int ay = Integer.parseInt(tarih.substring(5, 7));
        int gun = Integer.parseInt(tarih.substring(8, 10));

        String ayAdi= "";
        switch(ay){
            case 1: ayAdi = "Ocak"; break;
            case 2: ayAdi= "Şubat"; break;
            case 3: ayAdi= "Mart"; break;
            case 4: ayAdi= "Nisan"; break;
            case 5: ayAdi= "Mayıs"; break;
            case 6: ayAdi= "Haziran"; break;
            case 7: ayAdi= "Temmuz"; break;
            case 8: ayAdi= "Ağustos"; break;
            case 9: ayAdi= "Eylül"; break;
            case 10: ayAdi= "Ekim"; break;
            case 11: ayAdi= "Kasım"; break;
            case 12: ayAdi= "Aralık"; break;
            default: break;
        }

        System.out.printf("Biçimlendirilmiş Tarih: %s %d, %d \n", ayAdi, gun, yil);

    }
}